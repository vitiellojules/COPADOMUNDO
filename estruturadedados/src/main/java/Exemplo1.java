import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;

//package src.main.java;

public class Exemplo1 {
	public static void main(String[] args) {
		int c[] = new int[12];
		int d[] = {1,2,3,4,5,6};
		double da[] = {5,1,5,7,3};
		String columns[] = {"ID", "Desc","Valor"};
		String cols[] = new String[3];
		cols[0]="ID";
		cols[1]="Desc";
		cols[2]="Valor";
		/*int n = Integer.parseInt(
				JOptionPane.
				showInputDialog("Qual a quantidade de n?"));
		Character nomes[] = new Character[n];*/
		int a[]=null;
		System.out.println("Vetor 'da' linha a linha");
		for (int i = 0; i < da.length; i++) {
			System.out.println(da[i]);
		}
		System.out.println("Vetor 'da' lado a lado");
		for (int i = 0; i < da.length; i++) {
			System.out.print(da[i]+";");
		}
		
		System.out.println();
		//Usando join de StringUtils (apache-commons-lang3)
		System.out.println("Vetor 'da' join");
		System.out.println(StringUtils.join(da,';'));
		//Usando join nativo do java
		System.out.println("Vetor 'columns' join");
		System.out.println(String.join(";", columns));
		
		String[] sts = new String[10];
		//Inicializando todos os elementos
		for (int i = 0; i < sts.length; i++) {
			sts[i]="";
		}
		
		java.util.Arrays.fill(sts, "-");
		
		Aluno[] alunos2 = {
				new Aluno("Aline"),
				new Aluno("Jorge"),
				new Aluno("Renato")
				};
		Aluno[] alunos = new Aluno[10];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i]=new Aluno("Aline");
		}
		//Preenche o array com o MESMO objeto pra todos
		Arrays.fill(alunos, new Aluno("Aline"));
		alunos[5].nome="Jorge";
		int[] val = new int[10];
		int xa = -1;
		Arrays.fill(val,xa);
		val[5]=10;
		
		System.out.println();
	
		
	}
}
