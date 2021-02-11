package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Terceira camada de trabalho

//aqui é implementado com o Selenium, que faz a interacao com a Web
//nessa classe precisamos abstrair, mapear todas as etapas de teste
public class LoginPage {


	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;
		
	@FindBy(name = "txtPassword")
	private WebElement campoSenha;
	
	@FindBy(name = "Submit")
	private WebElement botaoLogin;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement link;
	
	public void informarCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}
	
	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	//esse método junta todos os outros métodos e executa todos de uma vez
	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}
}
