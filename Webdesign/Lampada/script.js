function ligar(){
    document.getElementById('lampada').setAttribute('src', 'luzLigada.gif') //atribuição de outro valor
}

function desligar(){
    document.getElementById('lampada').setAttribute('src', 'luzDesligada.gif')
}

function desaparecer(){
    //document.getElementById('lampada').setAttribute('src', 'none')
    //document.getElementById('lampada').removeAttribute('src')
    document.getElementById('lampada').style.display = 'none'
}

function aparecer(){
    //document.getElementById('lampada').setAttribute('src', 'luzdesligada.gif')
    //document.getElementById('lampada').('src')
    document.getElementById('lampada').style.display = 'inline'
}

function calcular(){
    peso= Number(document.getElementById('peso').value)
    altura= Number(document.getElementById('altura').value)
    imc= peso / (altura * altura)
    document.getElementById('calculo').innerHTML = imc.toFixed(2)
    console.log('IMC calculado '+ imc) //não mostra na tela
}