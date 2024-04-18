string = str(input('Digite uma frase: '))


def inverter_string(s):

    if len(s) <= 1:
        return s
    else:
        return inverter_string(string[1:]) + string[0]


print(string)
print(inverter_string(string))
