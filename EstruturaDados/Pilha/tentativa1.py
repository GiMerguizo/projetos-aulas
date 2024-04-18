from Pilha import Pilha


# entrada1 = ["2", "1", "+", "3", "*"]

def adiciona_na_pilha(item, pilha):
    pilha.push(item)


while True:
    termo = input('Digite a equacao: ')
    numeros = Pilha()

    if termo.isdigit():
        adiciona_na_pilha(termo, numeros)
        # print("É um numero")

    if termo == '=':
        break

print("Números da Pilha: ")
while not numeros.is_empty():
    print(numeros.pop())
    print(numeros.peek())

print('FIM')
