package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.*;

public class Hooks {
	
//	tudo que estiver no before, será executando antes de qualquer teste
	
//	@Before(order = 1, value = "@login") //order impoe uma ordem de execução, se necessario fazer varios Befores. o value executa a tag informada no testefeature, no caso o @login
//	public void setUp() {
//		acessarSistema();
//	}
	
	@Before()
	public void setUp() {
		acessarSistema();
	}

	@After()
	public void tearDown() {
		//depois de executar o teste, irá fechar o navegador
		driver.quit();
	}
	
}
