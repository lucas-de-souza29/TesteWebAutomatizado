package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CadastrarSkillsPage {

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement btnMenuAdmin;
	
    @FindBy(id = "menu_admin_Qualifications")
    private WebElement btnQualifications;
    
    @FindBy(id = "menu_admin_viewSkills")
    private WebElement btnMenuSkills;
    
    @FindBy(id = "btnAdd")
    private WebElement btnAddSkills;
    
    @FindBy(id = "skill_name")
    private WebElement nameSkill;
    
    @FindBy(id = "btnSave")
    private WebElement btnSaveSkill;
    
    public void clicarAbaAdmin() {
        btnMenuAdmin.click();    	
    }
    
    public void clicarMenuQualifications() {
    	btnQualifications.click();
    }
    
    public void clicarMenuSkills() {
    	btnMenuSkills.click();
    }
    
    public void clicarAddSkills() {
    	btnAddSkills.click();
    }
    
    public void fillNameSkills(String nomeSkill) {
        nameSkill.sendKeys(nomeSkill);	
    }
    
    public void clicarSaveSkill() {
        btnSaveSkill.click();   	
    }
}
