print('--- Exercício de Ordenação ---')

# Funções

def bubble_sort(lista, ordem):
    n = len(lista)
    for i in range(n):
        # Indica se houve troca na passagem atual
        trocou = False
    # ultimo i elementos já estão no lugar certo
        for j in range(0, n-i-1):
            if ordem == 1:
                if lista[j] > lista[j+1]:
                    lista[j], lista[j+1] = lista[j+1], lista[j]
                    trocou = True
            elif ordem == 2:
                if lista[j] < lista[j+1]:
                    lista[j], lista[j+1] = lista[j+1], lista[j]
                    trocou = True
            else:
                print('Ordem inválida!')
        # Se não houve troca, a lista já está ordenada
        if not trocou:
            break
    return lista

def insertion_sort(lista, ordem):
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1

        if ordem == 1:
            while j >= 0 and lista[j] > chave:
                lista[j + 1] = lista[j]
                j -= 1
            lista[j + 1] = chave
        elif ordem == 2:
            while j >= 0 and lista[j] < chave:
                lista[j + 1] = lista[j]
                j -= 1
            lista[j + 1] = chave
        else:
            print('Ordem inválida!')
    return lista

def quick_sort(arr, ordem):
    def quicksort_helper(low, high):
        if low < high:
            # Partitioning index
            pi = partition(low, high)
            quicksort_helper(low, pi - 1)
            quicksort_helper(pi + 1, high)

    # Função para realizar a partição
    def partition(low, high):
        # Escolhe o último elemento como pivô
        pivot = arr[high]
        i = low - 1
        for j in range(low, high):
            if ordem == 1:
                # Se o elemento atual é menor ou igual ao pivô
                if arr[j] <= pivot:
                    i += 1
                    arr[i], arr[j] = arr[j], arr[i]
            elif ordem == 2:
                if arr[j] >= pivot:
                    i += 1
                    arr[i], arr[j] = arr[j], arr[i]
        # Trocar o pivo com o elemento seguinte à última posição trocada
        arr[i + 1], arr[high] = arr[high], arr[i + 1]
        return i + 1
    
    # Chamada inicial para a função auxiliar
    quicksort_helper(0, len(arr) - 1)
    return arr


lista = []
lista_ordenada = []
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

print('\n')
print(lista_ordenada)

