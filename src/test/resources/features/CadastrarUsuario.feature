#language: pt
#encoding: UTF-8

#A primeira camada � definir os passos no cucumber e os cen�rios.
#Se necessario, definir o "Contexto: " para passos que se repetem em qualquer cenario

@login
Funcionalidade: Cadastrar usuario

	@cadastro
	Cenario: cadastrar usuario 
	Quando eu acionar a aba admin
	E acionar o botao add
	E informar no campo employee name "Fiona Grace"
	E informar no campo username "Pedro"
	E informar no campo password "12345678"
	E informar no campo confirmar password "12345678"
	E acionar o botao salvar
	Entao o sistema cadastra o usuario "Pedro"


#Apos definir todos os cenarios, rodar o programa com dryRun em "true" e copiar os metodos para o loginSteps