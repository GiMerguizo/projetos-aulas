x1 = int(input('Valor da base (x): '))
y1 = int(input('Valor do expoente (y): '))


def potencia(x, y):

    if y == 0:
        return 1

    return x * potencia(x, y - 1)


print(potencia(x1, y1))
