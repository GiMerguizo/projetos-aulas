"""
- Os elementos do vetor são todos do mesmo tipo;
- O vetor é unidimensional;
- Em Python, geralmente é implentado usando listas;
"""

# Criar uma lista vazia
vetor = []

# Criar uma lista com alguns elementos
vetor = [1, 2, 3, 4, 5]

# Criar uma lista com elementos de tipos diferentes
vetor = [1, 'dois', 3.0, 'quatro']

# Ex.: Calcular a média de idades de um grupo de 10 pessoas e mostrar a 5ª idade digitada
idades = []
print('Digite as idades de 10 pessoas: ')

for i in range(10):
    idade = int(input(f'Idade da pessoa {i+1}: '))
    idades.append(idade) # função de lista para gravar os dados dentro dela

media_idades = sum(idades) / len(idades)
quinta_idade = idades[4]

print(f'\nA média de idades é: {media_idades}')
print(f'A 5ª idade digitada foi: {quinta_idade}')

