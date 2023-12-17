package MultiplicarMatriz;

import java.util.Scanner;

public class MultMatriz {

	static Scanner scan = new Scanner(System.in); // Cria um objeto para entrada de dados
	static int linha_ma, coluna_ma; // Variáveis que define as linhas e colunas da matriz A.
	static int[][] matrizA; // Cria a variável global como matriz A.

	static int linha_mb, coluna_mb; // Variáveis que define as linhas e colunas da matriz B.
	static int[][] matrizB; // Cria a variável global como matriz B.

	static int[][] matrizC; // Cria a variável global como matriz C.

	public static void main(String[] args) { // método principal Main

		System.out.println("Multiplicar Matriz \n"); // Nome da disciplina em andamento

		//matrizTeste(); // método somente mostra a matriz
		System.out.println(" ");
		System.out.println("Digite os dados das matrizes:");
		System.out.println("");
		multipicaMatizes(); // Chamada do método em que foi desenvolvido o código p/ multiplicação das
							// matrizes
	}

	public static void multipicaMatizes() { // escopo do método

		System.out.println("Digite o número de linhas da matriz A:");
		linha_ma = scan.nextInt(); // variável que armazena o número de linha da matriz A.
		System.out.println("Digite o número de colunas da matriz A:");
		coluna_ma = scan.nextInt(); // variável que armazena o número de coluna da matriz A.
		matrizA = new int[linha_ma][coluna_ma]; // matriz A definida com o número de linhas e colunas definida acima.

		System.out.println("Digite o número de linhas da matriz B:");
		linha_mb = scan.nextInt(); // variável que armazena o número de linha da matriz B.
		System.out.println("Digite o número de colunas da matriz B:");
		coluna_mb = scan.nextInt(); // variável que armazena o número de colunas da matriz B.
		matrizB = new int[linha_mb][coluna_mb]; // matriz B definida com o número de linhas e colunas definida acima.

		verificacao(); // método para verificar se é possível fazer a multiplicação
						// senão sai do sistema

		for (int i = 0; i < linha_ma; i++) { // laços de repetições para leitura da matriz A:
			for (int j = 0; j < coluna_ma; j++) {
				System.out.println("Entre com os dados da matriz A: ");
				matrizA[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < linha_mb; i++) {
			for (int j = 0; j < coluna_mb; j++) {
				System.out.println("Entre com os dados da matriz B: ");
				matrizB[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matriz A:");
		for (int i = 0; i < linha_ma; i++) {
			for (int j = 0; j < coluna_ma; j++) {
				System.out.println("[" + matrizA[i][j] + "] ");
			}
		}
		System.out.println("Matriz B");
		for (int i = 0; i < linha_mb; i++) {
			for (int j = 0; j < coluna_mb; j++) {
				System.out.println("[ " + matrizB[i][j] + " ]");
			}
		}
		System.out.println("***************************************\n");
		MultiplicacaoMatrizes(); // chama o método que fará a multiplicação da matrizes

		System.out.println("***************************************\n"); // Impressão da matriz C:
		System.out.println("Matriz A  x  matriz B \n");
		for (int i = 0; i < linha_ma; i++) {
			for (int j = 0; j < coluna_mb; j++) {
				System.out.println("[ " + matrizC[i][j] + " ]");
			}
		}
	}

	public static void MultiplicacaoMatrizes() { // método que faz a multiplicação das matrizes
		if (matrizA[0].length == matrizB.length) {
			matrizC = new int[linha_ma][coluna_mb];
			System.out.println("Faz a multiplicação entre matrizes A e B: ");
			for (int i = 0; i < linha_ma; i++) {
				for (int j = 0; j < coluna_mb; j++) {
					for (int k = 0; k < linha_mb; k++) {
						matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
					}
				}
			}
		}
	}

	public static void verificacao() { // método que faz a verificação se é possível realizar a multiplicação
		if (matrizA[0].length != matrizB.length) {
			System.out.println("Não é possível realizar a multiplicação das atrizes! ");
			System.out.println("O número de linhas e colunas não obedece as regras para multipoicação de matrizes!\n");
			System.out.println("Digite 1 para sair e 2 para continuar... ");
			int s = scan.nextInt();
			if (s == 1) {
				System.exit(0);
			} else if (s == 2) {
				System.out.println("Agora digite as dimenções das matrizes:");
			}
		}
	}

	public static void matrizTeste() { // método generico só para impressão das matrizes
		System.out.println("Matriz A de teste\n3\t2\t5\n4\t8\t7\n");
		System.out.println("Matriz B de teste\n5\t1\n9\t2\n7\t3");
		System.out.println("A multiplicação entre A e B resultou em C!\n68\t22\n141\t41");
	}

}
