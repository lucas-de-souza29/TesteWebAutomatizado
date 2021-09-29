package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "txtUsername")
	private WebElement campoUserName;
	
	@FindBy(name = "txtPassword")
	private WebElement campoSenha;
	
	@FindBy(id = "btnLogin")
	private WebElement btnLogin;

	public void informarOUser(String usuario) {
		campoUserName.sendKeys(usuario);
	}
	
	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void clicarBotaoLogin() {
		btnLogin.click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		informarOUser(usuario);
		informarCampoSenha(senha);
		clicarBotaoLogin();
	}
}
