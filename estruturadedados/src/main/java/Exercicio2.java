import org.apache.commons.lang3.StringUtils;

public class Exercicio2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		//opcao 1
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		//opcao 2
		String res = StringUtils.join(a,' ');
		System.out.println(res);
	}
}
