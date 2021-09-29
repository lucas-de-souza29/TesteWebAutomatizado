package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;
import org.openqa.selenium.By;
import pageObjects.LoginPage;


public class LoginSteps {
	
	@Dado("o usuario informar o user {string}")
	public void oUsuarioInformarOUser(String usuario) {
		Na(LoginPage.class).informarOUser(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    Na(LoginPage.class).informarCampoSenha(senha);
	}
    
	@Dado("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).clicarBotaoLogin();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    assertEquals("Welcome Paul", driver.findElement(By.id("welcome")).getText());
	}

}
