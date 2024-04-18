print("--- Exercício 1 ---\n")
num = int(input('Digite um número: '))

def somatorio(n):

    if n == 1:
        return 1

    return n + somatorio(n - 1)

print(somatorio(num))
