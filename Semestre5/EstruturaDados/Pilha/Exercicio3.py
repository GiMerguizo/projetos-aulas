from Pilha import Pilha

entrada1 = ["2", "1", "+", "3", "*"]
numeros = Pilha()

def adiciona_na_pilha(lista, pilha):
    for item in lista:
        pilha.push(item)

for i in range(len(entrada1)):
    # print(entrada1[i])

    # if entrada1[i] != "+" or "-" or "*" or "/":
    if isinstance(i, (int, float)):
        adiciona_na_pilha(entrada1[i], numeros)

    i += 1


print("Números da Pilha: ")
while not numeros.is_empty():
    print(numeros.pop())

print('FIM')
