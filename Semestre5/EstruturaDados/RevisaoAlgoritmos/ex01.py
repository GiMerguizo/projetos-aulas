print("--- Exercício 1 ---\n")
num = int(input('Digite um número: '))
cont = 0

def somatorio(n):

    if cont == n:
        return 0

    return cont + somatorio()