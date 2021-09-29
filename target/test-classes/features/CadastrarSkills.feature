#language: pt
#enconding: UTF-8

Funcionalidade: Cadastrar nova skill

@CE002
Cenario: Cadastrar uma skill
Dado o usuario informar o user "Admin"
E informar a senha "admin123"
E clicar no botao login
E que o usuario clicar a aba Admin
E clicar em Qualifications
E clicar em Skills
E clicar no botao Add
E preencher o nome da skill "Appium"
E clicar no botao Save
Entao o sistema adiciona uma nova skill