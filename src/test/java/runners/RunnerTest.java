package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugins do cucumber
		plugin = {"pretty"},
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
		tags = "@dropdown",
		snippets = SnippetType.CAMELCASE, //irá colocar em camelCase automático os nomes dos métodos dos steps
		monochrome = true, //deixa o texto do console branco
		dryRun = false //se for true, irá apenas gerar os steps no console ao invés de abrir o navegador
		)

public class RunnerTest {
		
}
