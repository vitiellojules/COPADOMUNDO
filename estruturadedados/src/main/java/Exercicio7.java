
public class Exercicio7 {

	public static int posicaoMaiorValor(int[] numeros) {
		int posMaior = 0;
		int maiorNumero = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posMaior = i;
			}
		}
		return posMaior;
	}
}
