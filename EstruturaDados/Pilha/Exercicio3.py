from Pilha import Pilha


def avaliar_expressao(expressao):
    global resultado

    pilha = Pilha()

    for item in expressao:
        if item.isdigit():  # Verifica se é um númerp
            pilha.push(int(item))   # Coloca o número na pilha
        else:  # Se for um operador
            num2 = pilha.pop()  # Desempilha o último número
            num1 = pilha.pop()  # Desempilha o penúltimo número
            if item == "+":
                resultado = num1 + num2
            elif item == "-":
                resultado = num1 - num2
            elif item == "*":
                resultado = num1 * num2
            elif item == "/":
                resultado = num1 / num2
            pilha.push(resultado)  # Empilha o resultado

    return pilha.pop()  # Pega o resultado da pilha


# Teste das entradas
expressao1 = ["2", "1", "+", "3", "*"]
print("Resultado da expressão 1:", avaliar_expressao(expressao1))  # Saída esperada: 9

expressao2 = ["4", "13", "5", "/", "+"]
print("Resultado da expressão 2:", avaliar_expressao(expressao2))  # Saída esperada: 6

expressao3 = ["10", "2", "/"]
print("Resultado da expressão 3:", avaliar_expressao(expressao3))  # Saída esperada: 5
