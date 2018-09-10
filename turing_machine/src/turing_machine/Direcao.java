package turing_machine;

public enum Direcao {
	
	DIREITA("direita"),
	ESQUERDA("esquerda");
	
	private Direcao(String direcao) {
		this.direcao = direcao;
	}
	
	private String direcao;
	
	public String getDirecao() {
		return direcao;
	}

}
