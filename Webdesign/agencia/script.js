function relogio()
{
    var datahora = new Date()
//    document.getElementById('hora').innerText = datahora.getHours()  + ":"+ datahora.getMinutes()+ ":"+datahora.getSeconds()
    document.getElementById('hora').innerText = `${datahora.getHours()}:${datahora.getMinutes()}:${datahora.getSeconds()}`
}

setInterval(relogio, 1000)
document.getElementById('hora').style.background = "#00f"
document.getElementById('hora').style.color = "#FFF"


function orcar(){
    //var adicionais= document.querySelectorAll('#adicionais')
    var adicionais= document.querySelectorAll("input[name='adicionais']:checked")
    //array= document.querySelectorAll("input[name='adicionais']:checked")
    var totAd=0
    for (i=0; i< adicionais.length; i++)
    {
        totAd += Number(adicionais[i].value)
    }

    if(document.getElementById('destino').value == 'RS')
        destino = 1000
    else if(document.getElementById('destino').value == 'PR')
        destino = 900
    else    
        destino = -1

    nome = document.getElementById('nome').value
    total = destino + totAd

    document.getElementById('pacote').innerText = `${nome} comprou o pacote e pagará ${totAd}`
    document.getElementById('valorDestino').innerHTML = `Valor do destino escolhido: R$${destino.toFixed(2)}`
    document.getElementById('total').innerText = `Valor total: R$${total.toFixed(2)}`    
}

function limpar(){  
    document.getElementById('formC').reset()
}

function imprimir(){
    window.print()
}

function fechar(){
    window.close()
}
