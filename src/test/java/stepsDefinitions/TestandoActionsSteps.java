package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static utils.Utils.*;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class TestandoActionsSteps {

	@Quando("eu acionar o submenu customField")
	public void euAcionarOSubmenuCustomField() {
	    Na(TelaInicialPage.class).acessarMenuCustomField();
	}

	@Entao("o sistema apresenta a tela customField")
	public void oSistemaApresentaATelaCustomField() {
	    assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());
	}
	
}
