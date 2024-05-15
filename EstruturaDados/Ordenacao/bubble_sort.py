
def bubble_sort(lista):
    n = len(lista)
    for i in range(n):
        # Indica se houve troca na passagem atual
        trocou = False
    # ultimo i elementos já estão no lugar certo
        for j in range(0, n-i-1):
            if lista[j] > lista[j+1]:
                lista[j], lista[j+1] = lista[j+1], lista[j]
                trocou = True
        # Se não houve troca, a lista já está ordenada
        if not trocou:
            break
    return lista