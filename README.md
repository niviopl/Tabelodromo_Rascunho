# Tabelodromo_Rascunho
Esboço do Tabelodromo


limite:
	ID_Limite
	segmento 			(Varejo, Uniclass, Personnalite, Private, EMP1)
	canal 				(BKL, CEI, TCX, MBL, TEC, URA)
	Operacao 			(TED, TEF, SAQ, DOC, RED)
	Autenticacao 			(CARTAO/SENHA, BIOMETRIA, TOKEN)
	limite_diário
	limite_semanal

Operacao:
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

Controle:
	agencia
	conta
	dac
	ID_Limite
	Data_Movimento
	Data_Corte_Semana
	Acumulado_Diario
	Acumulado_Semanal

Conta:
	agencia
	conta
	dac
	segmento
	saldo
	ID_Cliente 		

Cliente:
	ID_Cliente
	Nome
	Pessoa
	CPF_CNPJ
	RendaMensal
	email
