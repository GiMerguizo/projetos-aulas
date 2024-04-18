
print('----- For -----\n')

# Exibir os números de 0 e 9
for i in range(10):
    print(i)

input('Pressione Enter para continuar...\n')

# Receber três números e classifica-los como negativo e não negativo
for i in range(1, 4):
    num = int(input('\nDigite um número: '))
    if num < 0:
        print(f'O número {num:.0f} é negativo.')
    else:
        print('O número não é negativo.')

input('Pressione Enter para continuar...\n')

# For aninhado
for x in range(1, 11):
    print(f'\n-- Tabuada do {x} --\n')
    for y in range(1, 11):
        print(f'{x} x {y} = {x * y}')

input('Pressione Enter para continuar...\n')


print('-=' * 20)
print('\n----- While -----\n')
# Exibir os primeiros 10 números inteiros (while usado como for)
i = 1
while i <= 10:
    print(f'Número {i}')
    i += 1

input('Pressione Enter para continuar...\n')

# No python, não existe o do-while