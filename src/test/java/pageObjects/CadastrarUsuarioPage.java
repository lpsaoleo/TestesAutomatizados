package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(id = "systemUser_employeeName_empId")
	public WebElement campoEmployee;

	@FindBy(name = "systemUser_userName")
	public WebElement campoUsername;

	@FindBy(name = "systemUser[password]")
	public WebElement campoPassword;

	@FindBy(name = "systemUser[confirmPassword]")
	public WebElement campoConfirmarPassword;

	@FindBy(name = "btnSave")
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
