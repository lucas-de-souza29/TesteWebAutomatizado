package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import pageObjects.CadastrarSkillsPage;


public class CadastrarSkillsSteps {
	
	@Dado("que o usuario clicar a aba Admin")
	public void queOUsuarioClicarAAbaAdmin() {
		Na(CadastrarSkillsPage.class).clicarAbaAdmin();
	}

	@Dado("clicar em Qualifications")
	public void clicarEmQualifications() {
       Na(CadastrarSkillsPage.class).clicarMenuQualifications();	    
	}

	@Dado("clicar em Skills")
	public void clicarEmSkills() {
       Na(CadastrarSkillsPage.class).clicarMenuSkills();	    
	}

	@Dado("clicar no botao Add")
	public void clicarNoBotaoAdd() {
       Na(CadastrarSkillsPage.class).clicarAddSkills();	    
	}

	@Dado("preencher o nome da skill {string}")
	public void preencherONomeDaSkill(String nomeSkill) {
		Na(CadastrarSkillsPage.class).fillNameSkills(nomeSkill);
	}

	@Dado("clicar no botao Save")
	public void clicarNoBotaoSave() {
	   Na(CadastrarSkillsPage.class).clicarSaveSkill();    
	}

	@Entao("o sistema adiciona uma nova skill")
	public void oSistemaAdicionaUmaNovaSkill() throws Exception {
		//Apresenta a mensagem Sucessfully saved
		Thread.sleep(2000);
		assertEquals("", driver.findElement(By.xpath("//*[@id=\"successBodyEdit\"]")).getText());	    
	}
}
