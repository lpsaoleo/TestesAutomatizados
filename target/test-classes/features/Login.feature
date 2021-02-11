#language: pt
#encoding: UTF-8

#A primeira camada é definir os passos no cucumber e os cenários.
#Se necessario, definir o "Contexto: " para passos que se repetem em qualquer cenario

@login
Funcionalidade: Login

@loginInvalido
Cenario: usuario invalido
Quando eu informar o usuario "ad"
E informar a senha "asd"
E clicar no botao login
Entao o sistema exibe a mensagem de credenciais invalidas

@loginSucesso
Cenario: realizar login
Quando eu informar o usuario "Admin"
E informar a senha "admin123"
E clicar no botao login
Entao o sistem exibe o usuario logado



#Apos definir todos os cenarios, rodar o programa com dryRun em "true" e copiar os metodos para o loginSteps