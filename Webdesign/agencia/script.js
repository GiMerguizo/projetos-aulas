//alert("Entrando...")

function relogio(){
    var datahora = new Date()
    // document.getElementById('hora').innerText = datahora.getHours() + ":" + datahora.getMinutes() + ":" + datahora.getSeconds()
    document.getElementById('hora').innerText = `${datahora.getHours()}:${datahora.getMinutes()}:${datahora.getSeconds()}`
}

setInterval(relogio, 1000)      //1000 = 1 segundo
document.getElementById('hora').style.background = 'green'

function preco(){
    array= document.querySelectorAll("input[name='adicionais']:checked")
    totAd=0;
    for (i=0; i<array.lenght; i++)
    {
        totAd += Number(array[i].value)
    }

    document.getElementById('total').innerText = totAd
}

function limpar(){
    document.getElementById('formCadastro').reset
}

function imprimir(){
    window.print()
}

function fechar(){
    window.close()
}
