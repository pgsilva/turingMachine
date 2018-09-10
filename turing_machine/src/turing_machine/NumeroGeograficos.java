package turing_machine;

public enum NumeroGeograficos {
	
	ZERO_UM("1", "região parisiense"),
	ZERO_DOIS("2", "noroeste da França e dependências no Oceano Índico"),
	ZERO_TRES("3", "nordeste da França"),
	ZERO_QUATRO("4", "sudeste da França"),
	ZERO_CINCO("5", "sudeste da França e dependência no Atlântico");
	
	private NumeroGeograficos(String numero, String regiao){
		this.numero = numero;
		this.regiao = regiao;
	}
	
	private String numero;
	
	private String regiao;
	
	public String getNumero() {
		return numero;
	}
	
	public String getRegiao() {
		return regiao;
	}

}
