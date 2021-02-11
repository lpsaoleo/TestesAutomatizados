#language: pt
#encoding: UTF-8

#A primeira camada é definir os passos no cucumber e os cenários.
#Se necessario, definir o "Contexto: " para passos que se repetem em qualquer cenario

@CadastrarUsuario
Funcionalidade: Cadastrar usuario

	@cadastro
	Cenario: cadastrar usuario 
	Quando eu acionar a aba admin
	E acionar o botao add
	E informar no campo employee name "Fiona Grace"
	E informar no campo username "Pedro"
	E informar no campo password "B9ixz77Z"
	E informar no campo confirmar password "B9ixz77Z"
	E acionar o botao salvar
	Entao o sistema cadastra o usuario "Pedro"


#Apos definir todos os cenarios, rodar o programa com dryRun em "true" e copiar os metodos para o loginSteps