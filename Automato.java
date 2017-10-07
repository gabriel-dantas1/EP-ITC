import java.util.*;

public class Automato {

	private int estados;
	private int numSimbolos;
	private int qinicial;
	private int[] qfinais;
	private int[][] delta;
	
	Automato (int n, int s, int qzero){
		
		this.estados = n;
		this.numSimbolos = s;
		this.qinicial = qzero;
		this.qfinais = new int[n];
		this.delta = new int[n][s];
		
	}
	
	Automato eliminaInacessiveis(Automato m) {
		
		int inicial = m.qinicial - 1;
		boolean[][] tabela = new boolean[2][2];
		tabela[inicial][0] = true;

		
		
		return m;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int estados = in.nextInt();
		int numSimbolos = in.nextInt();
		int qInicial = in.nextInt();
		
		Automato afd = new Automato(estados, numSimbolos, qInicial);
		
		for (int i = 0; i < afd.estados; i++) {
			afd.qfinais[i] = in.nextInt();
		}
		
		for (int i = 0; i < afd.estados; i++) {
			for (int j = 0; j < afd.numSimbolos; j++) {
				afd.delta[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < afd.estados; i++) {
			for (int j = 0; j < afd.numSimbolos; j++) {
				System.out.print(afd.delta[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
