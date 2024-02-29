from unidecode import unidecode

print('--- Verificando o Palíndromo ---\n')

frase = str(input('Digite a palavra/frase: ')).strip()

junto = ''.join(frase.split())  # Retira o espaço entre as palavras da frase
tratado = unidecode(junto).lower()  # Trata o acentos e coloca as letras em minusculas


def palidromo(s):

    if len(s) <= 1:    # Verifica se a string tem somente 1 ou nenhum caracter
        return True
    if s[0] != s[-1]:   # Compara se o primeiro caracter é diferente do último
        return False

    return palidromo(s[1:-1])  # Processo de recursão para verificar os demais caracteres


print(f"\nA frase '{frase.capitalize()}' é um Palíndromo? \n{palidromo(tratado)}")
