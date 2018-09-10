package turing_machine;

import static turing_machine.Direcao.DIREITA;
import static turing_machine.Direcao.ESQUERDA;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Celula> fita = new ArrayList<>();
		fita.add(new Celula(0, "0", DIREITA));
		fita.add(new Celula(1, "2", DIREITA));
		fita.add(new Celula(2, "4", DIREITA));
		fita.add(new Celula(3, "6", DIREITA));
		fita.add(new Celula(4, "0", DIREITA));
		fita.add(new Celula(5, "6", DIREITA));
		fita.add(new Celula(6, "7", DIREITA));
		fita.add(new Celula(7, "5", DIREITA));
		fita.add(new Celula(8, "2", DIREITA));
		fita.add(new Celula(9, "1", DIREITA));
		fita.add(new Celula(10, "", ESQUERDA));
		TuringMachine.getInstance().lerFita(fita, 0);
		
		fita = new ArrayList<>();
		fita.add(new Celula(0, "0", DIREITA));
		fita.add(new Celula(1, "9", DIREITA));
		fita.add(new Celula(2, "4", DIREITA));
		fita.add(new Celula(3, "6", DIREITA));
		fita.add(new Celula(4, "0", DIREITA));
		fita.add(new Celula(5, "6", DIREITA));
		fita.add(new Celula(6, "7", DIREITA));
		fita.add(new Celula(7, "5", DIREITA));
		fita.add(new Celula(8, "2", DIREITA));
		fita.add(new Celula(9, "1", DIREITA));
		fita.add(new Celula(10, "", ESQUERDA));
		TuringMachine.getInstance().lerFita(fita, 0);
		
		fita = new ArrayList<>();
		fita.add(new Celula(0, "0", DIREITA));
		fita.add(new Celula(1, "0", DIREITA));
		fita.add(new Celula(2, "5", DIREITA));
		fita.add(new Celula(3, "5", DIREITA));
		fita.add(new Celula(4, "3", DIREITA));
		fita.add(new Celula(5, "3", DIREITA));
		fita.add(new Celula(6, "1", DIREITA));
		fita.add(new Celula(7, "4", DIREITA));
		fita.add(new Celula(8, "4", DIREITA));
		fita.add(new Celula(9, "1", DIREITA));
		fita.add(new Celula(10, "1", DIREITA));
		fita.add(new Celula(11, "1", DIREITA));
		fita.add(new Celula(12, "0", DIREITA));
		fita.add(new Celula(13, "3", DIREITA));
		fita.add(new Celula(14, "0", DIREITA));
		fita.add(new Celula(15, "", ESQUERDA));
		TuringMachine.getInstance().lerFita(fita, 0);
	}

}
