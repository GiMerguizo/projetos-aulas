document.getElementById('descricao').innerHTML = `Processando pedido...`

function relogio(){
    var datahora = new Date()
    document.getElementById('hora').innerHTML = `${datahora.getHours()}:${datahora.getMinutes()}:${datahora.getSeconds()}`
}
setInterval(relogio, 1000)

function calcular(){
    nome= document.getElementById('nome').value
    console.log(nome)
    combo= document.getElementById('combo').value
    
    var array = document.querySelectorAll('input[type=checkbox]');
    valor=0;
    for (var item of array) {
        if (item.checked == true)
        {
            valor += Number(item.value)
        }
    }

    console.log(`Adicionais: R$${valor},00`);

    var opcao = document.querySelectorAll('input[type=radio]');
    frete=0;
    for (var viagem of opcao) {
        if (viagem.checked == true)
        {
            frete += Number(viagem.value)
        }
    }

    //console.log(document.getElementsByName('entrega'))
    console.log(`Frete: R$${frete},00`)

    total = parseFloat(combo) + parseFloat(valor) + parseFloat(frete)

    document.getElementById('resultado').innerText = `R$${total},00`
    console.log('Total a pagar: R$' + total)

    document.getElementById('descricao').innerHTML = `Nome: ${nome} - Valor do Combo: R$${combo},00 - Adicionais R$${valor},00 - Frete: R$${frete},00 - Valor final: R$${total},00`
}

function recibo(){
    window.print()
}