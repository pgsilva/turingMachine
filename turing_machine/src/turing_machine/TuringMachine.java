package turing_machine;

import java.util.Arrays;
import java.util.List;

public class TuringMachine {

	public static TuringMachine machine;

	private static final List<String> NUMEROS_GEOGRAFICO_DA_FRANCA = Arrays.asList("1", "2", "3", "4", "5");

	private StringBuilder telefone = new StringBuilder("");

	private TuringMachine() {

	}

	public static TuringMachine getInstance() {
		if (machine != null) {
			return machine;
		}
		return new TuringMachine();
	}

	public void lerFita(List<Celula> fita, Integer indice) {
		if (fita.size() - 1 == 10) {
			System.out.println("-------------------------");
			System.out.println("Ligação França para França\n");
			validaLigacaoFrancaToFranca(fita, indice);
		} else if (fita.size() - 1 > 10) {
			System.out.println("-------------------------");
			System.out.println("Ligação Internacional para França\n");
			validaLigaaoInternacionalToFranca(fita, indice);
		} else {
			System.out.println("Chamada inválida");
		}
	}

	private void validaLigaaoInternacionalToFranca(List<Celula> fita, Integer indice) {
		Celula celula = fita.get(indice);
		if (indice != null && celula != null) {
			if (!"".equals(celula.getEstado())) {
				if ((indice.equals(0) || indice.equals(1)) && "0".equals(celula.getEstado())) {
					printEstadoInternacionalToFranca(fita, indice, celula);
				} else if ((indice.equals(2) || indice.equals(3)) && "5".equals(celula.getEstado())) {
					printEstadoInternacionalToFranca(fita, indice, celula);
				} else if ((indice.equals(4) || indice.equals(5)) && "3".equals(celula.getEstado())) {
					printEstadoInternacionalToFranca(fita, indice, celula);
				} else if (indice.equals(6) && NUMEROS_GEOGRAFICO_DA_FRANCA.contains(celula.getEstado())) {
					printEstadoInternacionalToFranca(fita, indice, celula);
				} else if (indice > 6) {
					printEstadoInternacionalToFranca(fita, indice, celula);
				} else {
					telefone.append(celula.getEstado());
					System.out.println(telefone.toString());
					System.out.println("\n\ndiscagem incorreta\n");
					System.out.println("------------------------");
				}
			} else {
				if (telefone.toString().length() > 10) {
					System.out.println(telefone.toString());
					System.out.println(printRegiaoLigacao(telefone.toString(), true));
					System.out.println("\nFita Finalizada\n");
					System.out.println("------------------------");
				} else {
					System.out.println(telefone.toString());
					System.out.println("\n\ndiscagem incorreta\n");
					System.out.println("------------------------");
				}
			}
		} else {
			System.out.println("\n\nFita Finalizada\n");
			System.out.println("---------------------");
		}
	}

	private void validaLigacaoFrancaToFranca(List<Celula> fita, Integer indice) {
		Celula celula = fita.get(indice);
		if (indice != null && celula != null) {
			if (!"".equals(celula.getEstado())) {
				if (indice.equals(0) && "0".equals(celula.getEstado())) {
					printEstadoFrancaToFranca(fita, indice, celula);
				} else if (indice.equals(1) && NUMEROS_GEOGRAFICO_DA_FRANCA.contains(celula.getEstado())) {
					printEstadoFrancaToFranca(fita, indice, celula);
				} else if (indice > 1) {
					printEstadoFrancaToFranca(fita, indice, celula);
				} else {
					telefone.append(celula.getEstado());
					System.out.println(telefone.toString());
					System.out.println("\n\ndiscagem incorreta\n");
					System.out.println("------------------------");
				}
			} else {
				if (telefone.toString().length() == 10) {
					System.out.println(telefone.toString());
					System.out.println(printRegiaoLigacao(telefone.toString(), false));
					System.out.println("\nFita Finalizada\n");
					System.out.println("------------------------");
				} else {
					System.out.println(telefone.toString());
					System.out.println("\n\ndiscagem incorreta\n");
					System.out.println("------------------------");
				}
			}
		} else {
			System.out.println("\n\nFita Finalizada\n");
			System.out.println("---------------------");
		}
	}

	private void printEstadoFrancaToFranca(List<Celula> fita, Integer indice, Celula celula) {
		telefone.append(celula.getEstado());
		validaLigacaoFrancaToFranca(fita, verificaDirecao(celula, indice));
	}

	private void printEstadoInternacionalToFranca(List<Celula> fita, Integer indice, Celula celula) {
		telefone.append(celula.getEstado());
		validaLigaaoInternacionalToFranca(fita, verificaDirecao(celula, indice));
	}

	private Integer verificaDirecao(Celula celula, Integer indice) {
		if (celula.getDirecao().equals(Direcao.DIREITA)) {
			return indice + 1;
		} else {
			return indice - 1;
		}
	}

	private String printRegiaoLigacao(String telefone, boolean isInternacional) {
		if (isInternacional) {
			switch (telefone.substring(6, 7)) {
			case "1":
				return "chamada do Brasil para " + NumeroGeograficos.ZERO_UM.getRegiao();
			case "2":
				return "chamada do Brasil para " + NumeroGeograficos.ZERO_DOIS.getRegiao();
			case "3":
				return "chamada do Brasil para " + NumeroGeograficos.ZERO_TRES.getRegiao();
			case "4":
				return "chamada do Brasil para " + NumeroGeograficos.ZERO_QUATRO.getRegiao();
			case "5":
				return "chamada do Brasil para " + NumeroGeograficos.ZERO_CINCO.getRegiao();
			}
		} else {
			switch (telefone.substring(1, 2)) {
			case "1":
				return NumeroGeograficos.ZERO_UM.getRegiao();
			case "2":
				return NumeroGeograficos.ZERO_DOIS.getRegiao();
			case "3":
				return NumeroGeograficos.ZERO_TRES.getRegiao();
			case "4":
				return NumeroGeograficos.ZERO_QUATRO.getRegiao();
			case "5":
				return NumeroGeograficos.ZERO_CINCO.getRegiao();
			}
		}
		return null;
	}

}
