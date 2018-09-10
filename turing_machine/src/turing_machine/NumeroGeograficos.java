package turing_machine;

public enum NumeroGeograficos {
	
	ZERO_UM("1", "regi�o parisiense"),
	ZERO_DOIS("2", "noroeste da Fran�a e depend�ncias no Oceano �ndico"),
	ZERO_TRES("3", "nordeste da Fran�a"),
	ZERO_QUATRO("4", "sudeste da Fran�a"),
	ZERO_CINCO("5", "sudeste da Fran�a e depend�ncia no Atl�ntico");
	
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
