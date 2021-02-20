$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarUsuario.feature");
formatter.feature({
  "name": "Cadastrar usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CadastrarUsuario"
    }
  ]
});
formatter.scenario({
  "name": "cadastrar usuario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CadastrarUsuario"
    },
    {
      "name": "@cadastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar a aba admin",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.euAcionarAAbaAdmin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao add",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.acionarBotaoAdd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo employee name \"Fiona Grace\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarNoCampoEmployeeName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo username \"Pedro\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarNoCampoUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo password \"B9ixz77Z\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarNoCampoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo confirmar password \"B9ixz77Z\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.informarNoCampoConfirmarPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao salvar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.botaoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema cadastra o usuario \"Pedro\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarUsuarioSteps.oSistemaCadastraOUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "usuario invalido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginInvalido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"ad\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.eu_informar_o_usuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"asd\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informar_a_senha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicar_no_botao_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a mensagem de credenciais invalidas",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeAMensagemDeCredenciaisInvalidas()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "realizar login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"Admin\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.eu_informar_o_usuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"admin123\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informar_a_senha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicar_no_botao_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistem exibe o usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestandoActions.feature");
formatter.feature({
  "name": "TestarActions",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@dropdown"
    }
  ]
});
formatter.scenario({
  "name": "verificar dropDown da aba",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@dropdown"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o submenu customField",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestandoActionsSteps.euAcionarOSubmenuCustomField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a tela customField",
  "keyword": "Entao "
});
formatter.match({
  "location": "TestandoActionsSteps.oSistemaApresentaATelaCustomField()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Add Custom Field]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepsDefinitions.TestandoActionsSteps.oSistemaApresentaATelaCustomField(TestandoActionsSteps.java:21)\r\n\tat ✽.o sistema apresenta a tela customField(file:src/test/resources/features/TestandoActions.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
});