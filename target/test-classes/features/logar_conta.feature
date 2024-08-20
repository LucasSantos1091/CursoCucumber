# language: pt

Funcionalidade: login

	Como  um aluno
	Eu quero logar no sistema
	Para que eu possa visualizar os dados

Cenário: Logar
	Dado que tenho conta
	Quando realizar o login com o usuario "Lucas"
	E com a senha "Santos"
	Então deve apresentar mensagem de sucesso
