

public class Exercicio9 {
	public static int[] preencheVetor(int[] numeros) {
		int[] resposta = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resposta[i] = numeros[i] % 2 == 0 ? 1 : -1;
		}
		return resposta;
	}
}
