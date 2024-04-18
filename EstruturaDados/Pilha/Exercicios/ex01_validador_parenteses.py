from Pilha import Pilha

entrada = '(()'
pilha = Pilha()

for item in entrada:
    if item == '(':
        pilha.push(item)
    else:
        print('Nao foi adicionado na Pilha.')

for item in entrada:
    if item == ')':
        if pilha.is_empty() == None:
            print('Entrada vazia')
        
        else:
            teste = pilha.pop()
            if teste == '(':
                balanceada = True
            else:
                balanceada = False

print(balanceada)