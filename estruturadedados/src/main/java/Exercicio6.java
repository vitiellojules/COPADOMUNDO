
public class Exercicio6 {
	public static boolean[] preencheVetor(int[] numeros) {
		boolean[] resposta = new boolean[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			// Forma 1
			if (numeros[i] >= 0) {
				resposta[i] = true;
			} else {
				//Redundante, pois todos iniciam com false
				resposta[i] = false;
			}
			// Forma 2
			resposta[i] = numeros[i] >= 0;
			// Forma 3
			resposta[i] = numeros[i] >= 0 ? true : false;
		}
		return resposta;
	}
}
