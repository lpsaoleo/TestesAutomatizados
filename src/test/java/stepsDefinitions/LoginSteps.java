package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

//Segunda camada de trabalho

public class LoginSteps {

	@Quando("eu informar o usuario {string}")
	public void eu_informar_o_usuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informar_a_senha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicar_no_botao_login() {
		Na(LoginPage.class).acionarBotaoLogin();
	}
	
	@Entao("o sistema exibe a mensagem de credenciais invalidas")
	public void oSistemaExibeAMensagemDeCredenciaisInvalidas() {
		assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}
	
	@Entao("o sistem exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		//irá validar se o login foi bem sucedido
		//irá procurar o o texto "Welcome Admin", dentro do elemento de id "welcome"
	    assertEquals("Welcome Paul",driver.findElement(By.id("welcome")).getText());
	}

	
}
