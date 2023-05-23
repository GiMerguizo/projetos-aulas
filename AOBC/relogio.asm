// Colocando os valores nos endereços de memória
ram 198 0
ram 199 59
ram 200 0
ram 201 1
ram 202 0

cseg
org Inicio 0    // Início do programa

lda ac,200
str 4093,ac
add ac,201
str 200,ac

sub ac,199  // Subtraindo de 59, se 59-59 = 0 => entra no if
je BLOCO_IF_INICIO  // Chamada do if
jmp Inicio

org BLOCO_IF_INICIO // Bloco if
// Zerando a contagem
lda ac,198
str 200,ac

// Altera o dígito da hora
lda ac,202
add ac,201
str 4092,ac
str 202,ac

sub ac,199
je BLOCO_IF_HORA // Chamada do 2º if
jmp Inicio

org BLOCO_IF_HORA   // Bloco if 2
// Zerando a contagem
lda ac,198
str 202,ac
jmp BLOCO_IF_INICIO

hlt
