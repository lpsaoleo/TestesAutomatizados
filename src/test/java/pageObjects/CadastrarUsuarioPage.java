package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployee;

	@FindBy(id = "systemUser_userName")
	public WebElement campoUsername;

	@FindBy(id = "systemUser_password")
	public WebElement campoPassword;

	@FindBy(id = "systemUser_confirmPassword")
	public WebElement campoConfirmarPassword;

	@FindBy(id = "btnSave")
	public WebElement botaoSalvar;

	public void informarCampoEmployeeName(String employeeName) {
		campoEmployee.sendKeys(employeeName);
	}

	public void informarCampoUserName(String userName) {
		campoUsername.sendKeys(userName);
	}

	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}

	public void informarCampoConfirmarPassword(String password) {
		campoConfirmarPassword.sendKeys(password);
	}

	public void botaoSalvar() {
		botaoSalvar.click();
	}

}
