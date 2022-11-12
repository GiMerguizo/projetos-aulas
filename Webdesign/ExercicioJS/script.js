function somar(){
    numero1 = document.getElementById('numero1').value
    numero2 = document.getElementById('numero2').value
    soma = parseFloat(numero1) + parseFloat(numero2)
    document.getElementById('resultado').innerHTML= soma
    console.log('SOMA: ' + soma)
}

function gerar(){
    numero1 = Math.random()
    numero2 = Math.random()
    soma = parseFloat(numero1) + parseFloat(numero2)
    //document.getElementById('numero1').innerHTML = numero1
    //document.getElementById('numero2').innerHTML = numero2
    document.getElementById('resultado').innerText = (numero1.toFixed(2) +' + '+ numero2.toFixed(2) + ' = '+ soma.toFixed(2))
    //document.getElementById('resultado').innerHTML = soma.toFixed(2)
    console.log('SOMA: ' + soma)
}

function limpar(){ 
    document.getElementById('numero1').value='none'
    document.getElementById('numero2').value='none'
    document.getElementById('numero1').style.backgroundColor = '#fff'
    document.getElementById('numero2').style.backgroundColor = '#fff'
    document.getElementById('resultado').innerHTML = 'Aqui irá aparecer o resultado...'
}

function verifica(){
    numero1 = document.getElementById('numero1').value
    numero2 = document.getElementById('numero2').value

    if (numero1 > numero2) {
        document.getElementById('numero1').style.backgroundColor = 'blue'
    }
    else if (numero1 < numero2){
        document.getElementById('numero2').style.backgroundColor = 'blue'
    }
    else {
        console.log(numero1 + '=' + numero2)
    }
}
