$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarSkills.feature");
formatter.feature({
  "name": "Cadastrar nova skill",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastrar uma skill",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CE002"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o user \"Admin\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.oUsuarioInformarOUser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"admin123\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario clicar a aba Admin",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSkillsSteps.queOUsuarioClicarAAbaAdmin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Qualifications",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSkillsSteps.clicarEmQualifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Skills",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSkillsSteps.clicarEmSkills()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao Add",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSkillsSteps.clicarNoBotaoAdd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o nome da skill \"Appium\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSkillsSteps.preencherONomeDaSkill(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao Save",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSkillsSteps.clicarNoBotaoSave()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema adiciona uma nova skill",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarSkillsSteps.oSistemaAdicionaUmaNovaSkill()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Realizar login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CE001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario informar o user \"Admin\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.oUsuarioInformarOUser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"admin123\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});