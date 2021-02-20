package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {
	
//	tudo que estiver no before, será executando antes de qualquer teste
	
//	@Before(order = 1, value = "@login") //order impoe uma ordem de execução, se necessario fazer varios Befores. o value executa a tag informada no testefeature, no caso o @login
//	public void setUp() {
//		acessarSistema();
//	}
	
	@Before(value = "not @login") //irá executar em todos, menos os que possuam a tag @login
	public void setUp() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin","admin123");
	}
	
	@Before(value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
		
	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		
		
		//depois de executar o teste, irá fechar o navegador
		driver.quit();
	}
	
	
	
}
