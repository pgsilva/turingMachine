package turing_machine;

public class Celula {

	private Integer indice;

	private String estado;

	private Direcao direcao;

	public Celula() {

	}

	public Celula(Integer indice, String estado, Direcao direcao) {
		super();
		this.indice = indice;
		this.estado = estado;
		this.direcao = direcao;
	}

	public Integer getIndice() {
		return indice;
	}

	public void setIndice(Integer indice) {
		this.indice = indice;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		return "Celula [indice=" + indice + ", estado=" + estado + ", direcao=" + direcao + "]";
	}

}
