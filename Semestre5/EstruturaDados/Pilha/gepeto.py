def avaliar_expressao(expressao):
    global resultado
    pilha = []

    for elemento in expressao:
        if elemento.isdigit():  # Se o elemento é um número, empilhe-o
            pilha.append(int(elemento))
        else:  # Se o elemento é um operador
            num2 = pilha.pop()  # Desempilha o último número
            num1 = pilha.pop()  # Desempilha o penúltimo número
            if elemento == "+":
                resultado = num1 + num2
            elif elemento == "-":
                resultado = num1 - num2
            elif elemento == "*":
                resultado = num1 * num2
            elif elemento == "/":
                resultado = num1 / num2
            pilha.append(resultado)  # Empilha o resultado

    return pilha[0]  # O resultado final estará no topo da pilha


# Testando a função com os exemplos fornecidos
expressao1 = ["2", "1", "+", "3", "*"]
print("Resultado da expressão 1:", avaliar_expressao(expressao1))  # Saída esperada: 9

expressao2 = ["4", "13", "5", "/", "+"]
print("Resultado da expressão 2:", avaliar_expressao(expressao2))  # Saída esperada: 6
