from Node import Node

class Pilha:
    def __init__(self):
        self.top = None     # Inicializa a pilha vazia

    def push(self, value):
        new_node = Node(value)  # Cria um novo nó
        if self.top is not None:
            new_node.next = self.top    # O novo nó aponta para o nó atual do topo
        self.top = new_node     # Atualiza o topo para o novo nó

    def pop(self):
        if self.is_empty():
            return None     # Retorna None se a pilha estiver vazia
        removed_node = self.top     # Armazena o nó atual do topo
        self.top = self.top.next    # Atualiza o topo para o próximo nó
        return removed_node.value   # Retorna o valor do nó removido
    
    def peek(self):
        if self.is_empty():
            return None     # Retorna None se a pilha estiver vazia
        return self.top.value    # Retorna o valor do nó no topo
    
    def is_empty(self):
        return self.top is None     # Retorna True se a pilha estiver vazia
    