

public class Exercicio5 {
	public static int contaNegativos(int[] a, int x) {
		int resposta=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==x) {
				resposta++;
			}
		}
		return resposta;
	}
}
