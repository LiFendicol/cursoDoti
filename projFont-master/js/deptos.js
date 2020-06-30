function iniciar() {
    let user = localStorage.getItem("usuarioLogado");

    if (!user) {
        window.location = "index.html";
    }

    let nomeUsuario = JSON.parse(user).nome;
    document.getElementById("user").innerHTML = nomeUsuario;
    carregarDados();
}

function logout() {
    localStorage.removeItem("usuarioLogado");
    window.location = "index.html";
}

function carregarDados() {
    fetch("http://localhost:8080/departamentos")
        .then(res => res.json())
        .then(res => preencher(res));
}

function preencher(res) {
    //console.log(res);
    //let texto = "<table> <tr> <th>ID</th><th>Nome</th><th>Unidade</th>";
    let texto = `<table>
                    <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Unidade</th>
                    </tr>`;
    for (let index = 0; index < res.length; index++) {
        //texto = texto + "<tr><td>" + res[index].id + "</td><td>" + res[index].nome + "</td><td>" + res[index].unidade + "</td></tr>";
        texto = texto +
            `<tr>
            <td>${res[index].id}</td>
            <td>${res[index].nome}</td>
            <td>${res[index].unidade}</td>
        </tr>`;
    }

    texto = texto + "</table>";
    document.getElementById("conteudo").innerHTML = texto;
}