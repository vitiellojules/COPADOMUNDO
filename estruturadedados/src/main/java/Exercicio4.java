

public class Exercicio4 {
	public static int contaNegativos(int[] numeros) {
		int resposta=0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]<0) {
				resposta++;
			}
		}
		return resposta;
	}
}
