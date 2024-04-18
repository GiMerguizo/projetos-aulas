print('--- Estrutura de decisão ---\n')

salario = float(input('Digite o salário: '))

if salario == 1000:
    novo_salario = salario * 1.1
    print(f'Bônus de 10%.\nNovo salário: {novo_salario:.2f}')
elif salario < 1000:
    novo_salario = salario * 1.2
    print('Salário reajustado em 20%.')
    print(f'Novo salário: {novo_salario:.2f}')
else:
    print('Salário não será reajustado.')


