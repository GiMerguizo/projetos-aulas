from bubble_sort import bubble_sort
from insertion_sort import insertion_sort
from quick_sort import quick_sort
# from ListaSE import ListaSE

print('--- Exercício de Ordenação ---')

lista = []
lista_ordenada = []
cont = 0

while True:
    cont += 1
    num = int(input(f'Digite o {cont}º número: '))
    lista.append(num)

    while True:
        continuar = str(input('Deseja continuar [S/N]? ')).lower()
        if continuar == 's' or continuar == 'n':
            break
        else:
            print('Opção inválida! Tente novamente!')

    if continuar == 'n':
        break

print(lista)

while True:
    print('\n---- Menu ----')
    print('[1] Bubble Sort \n[2] Insertion Sort \n[3] Quick Sort\n[4] Sair')
    op = int(input('Qual tipo de ordenação você desejar usar? '))

    if op < 4:
        print('\n--- Ordem ---')
        print('[1] Crescente \n[2] Decrescente')
        ordem = int(input('Opção: '))

        print('\n')
        if op == 1:
            print('Bubble Sort')
            lista_ordenada = bubble_sort(lista, ordem)
        elif op == 2:
            print('Insertion Sort')
            lista_ordenada = insertion_sort(lista, ordem)
        elif op == 3:
            print('Quick Sort')
            lista_ordenada = quick_sort(lista, ordem)
        elif op == 4:
            print('Saindo...')
        else:
            print('Algo deu errado! Tente novamente.')

        print('-----------------------')
        print(lista_ordenada)
    elif op == 4:
        print('Encerrando o programa...')
        break
    else:
        print('Algo deu errado, tente novamente!')

