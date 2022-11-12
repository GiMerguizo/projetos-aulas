document.getElementById("btnVerCEP").addEventListener("click", verificarCep)

async function verificarCep(){
    let cep = document.getElementById("cep").value

    const apiViaCep = 'https://viacep.com.br/ws/'+ cep + '/json/'

    const resCep = await fetch(apiViaCep)       //await: tempo de espera - fetch: faz requisição
    const data = await resCep.json()

    if(data.erro == true)
        alert("CEP Inválido")
    else
        document.getElementById("resultado").value = `${data.logradouro} - ${data.bairro} - ${data.localidade}/${data.uf}`
}