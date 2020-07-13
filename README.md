# Tabelodromo_Rascunho
Esboço do Tabelodromo


limite (DB de Parâmetros):
	ID_Limite
	segmento 			(Varejo, Uniclass, Personnalite, Private, EMP1)
	canal 				(BKL, CEI, TCX, MBL, TEC, URA)
	Operacao 			(TED, TEF, SAQ, DOC, RED)
	Autenticacao 			(CARTAO/SENHA, BIOMETRIA, TOKEN)
	limite_diário
	limite_semanal

Operacao (DB com as operações executadas, com status SIM (acatada) ou NAO):
	agencia
	conta
	dac
	segmento (não é dado de entrada)
	Canal
	Operacao
	Autenticacao
	valor_Operacao
	ID_Limite
	status_Operacao (Passou SIM/NAO)

Controle (DB que controla por Agencia/Conta/ID_Limite os valores acumulados diários e semanais):
	agencia
	conta
	dac
	ID_Limite
	Data_Movimento
	Data_Corte_Semana
	Acumulado_Diario
	Acumulado_Semanal

Conta (DB de contas com vínculo ao DB de cliente):
	agencia
	conta
	dac
	segmento
	saldo
	ID_Cliente 		

Cliente (DB de clientes):
	ID_Cliente
	Nome
	Pessoa
	CPF_CNPJ
	RendaMensal
	email
