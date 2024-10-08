package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LogarContaSteps {

	private WebDriver driver;

	@Before
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        }

	@Dado("que tenho conta")
	public void que_tenho_conta() {
		driver.get("https://demo.testfire.net/login.jsp");
	}

	@Quando("realizar o login com o usuario {string}")
	public void realizar_o_login_com_o_usuario(String string) {
		driver.findElement(By.id("uid")).sendKeys(string);

	}

	@Quando("com a senha {string}")
	public void com_a_senha(String string) {
		driver.findElement(By.id("passw")).sendKeys(string);
		driver.findElement(By.name("btnSubmit")).click();
	}

	@Então("deve apresentar mensagem de sucesso")
	public void deve_apresentar_mensagem_de_sucesso() {
		String texto = driver.findElement(By.id("_ctl0__ctl0_Content_Main_message")).getText();
		Assert.assertEquals(
				"Login Failed: We're sorry, but this username or password was not found in our system. Please try again.",
				texto);
	}

	@Quando("acionar a opçao de emprestimo")
	public void acionar_a_opçao_de_emprestimo() {
		driver.findElement(By.id("LinkHeader2")).isDisplayed();
	}

	@Então("a pagina deve apresentar o titulo {string}")
	public void a_pagina_deve_apresentar_o_titulo(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@After
    public void teardown() {
        if (driver != null) {
            driver.quit();
}
        }}

