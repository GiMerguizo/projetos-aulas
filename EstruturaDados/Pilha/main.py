from Pilha import Pilha;

def torre_hanoi(n, origem, destino, auxiliar):
    if n == 1:
        move_disco(origem, destino)
    else:
        torre_hanoi(n-1, origem, auxiliar, destino)
        move_disco(origem, destino)
        torre_hanoi(n-1, auxiliar, destino, origem)
        

def move_disco(origem, destino):
    disco = origem.pop()
    destino.push(disco)
    print(f'Mover disco {disco} de {origem} para {destino}')


# Exemplo
if __name__ == "__main__":
    # Inicializando as pilhas
    torre_origem = Pilha()
    torre_auxiliar = Pilha()
    torre_destino = Pilha()

    # Adicionando discos à torre de origem
    for i in range(3, 0, -1):
        torre_origem.push(i)
    
    print('Estado inicial das Torres: ')
    print(f'Torre de Origem: {torre_origem.peek()}')
    print(f'Torre Auxiliar: {torre_auxiliar.peek()}')
    print(f'Torre de Destino: {torre_destino.peek()}')
    print()

    # Resolver a torre
    torre_hanoi(3, torre_origem, torre_destino, torre_auxiliar)

    print('\nEstado final das Torres: ')
    print(f'Torre de Origem: {torre_origem.peek()}')
    print(f'Torre Auxiliar: {torre_auxiliar.peek()}')
    print(f'Torre de Destino: {torre_destino.peek()}')
