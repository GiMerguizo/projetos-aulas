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