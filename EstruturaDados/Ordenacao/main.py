print('--- Exercício de Ordenação ---')

lista = []
cont = 0

while True:
    cont += 1
    num = int(input(f'Digite o {cont}º número: '))
    lista.append(num)

    continuar = str(input('Deseja continuar [s/n]? '))
    if continuar == 'n':
        break

print(lista)

print('\n---- Menu ----')
print('[1] Bubble Sort \n[2] Insertion Sort \n[3] Quick Sort\n[4] Sair')
op = int(input('Qual tipo de ordenação você desejar usar? '))

print('\n')
if op == 1:
    print('Bubble Sort')
elif op == 2:
    print('Insertion Sort')
elif op == 3:
    print('Quick Sort')
elif op == 4:
    print('Saindo...')
else:
    print('Algo deu errado! Tente novamente.')

print('\n--- Ordem ---')
print('[1] Crescente \n[2] Decrescente')
