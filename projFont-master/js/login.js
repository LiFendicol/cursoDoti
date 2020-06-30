function autenticar(event) {
    event.preventDefault();
    //alert("Funcionou");
    let txtEmail = document.getElementById("txtEmail").value;
    let txtSenha = document.getElementById("txtSenha").value;

    //alert(txtEmail + " - " + txtSenha);

    let loginMsg = {
        email: txtEmail,
        senha: txtSenha
    }

    let cabecalho = {
        method: "POST",
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/login", cabecalho)
        .then(res => tratarResposta(res));
}

function tratarResposta(res) {
    if (res.status == 200) {
        //document.getElementById("msgError").innerHTML = "Sucesso.";
        res.json().then(res => logaUsuario(res));
        window.location = "departamentos.html";
    } else {
        document.getElementById("msgError").innerHTML = "Usuário / senha inválidos";
    }
}

function logaUsuario(res){
    localStorage.setItem("usuarioLogado", JSON.stringify(res));
}
