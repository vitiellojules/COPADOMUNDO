package br.edu.ifsc.copa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Time2 implements Comparable<Time2>{
	String nome;
	Integer qtdAtletas = 0;
	
	public Time2(String nome, int qtdAtletas) {
		this.nome = nome;
		this.qtdAtletas = qtdAtletas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + "\t" + qtdAtletas;
	}
	public static void main(String[] args) {
		ArrayList<Time2> numeros = new ArrayList<>();
		numeros.add(new Time2("SPFC",11));
		numeros.add(new Time2("CRF",12));
		numeros.add(new Time2("CCP",11));
		numeros.add(new Time2("CAM",10));
		numeros.add(new Time2("CAM",7));
		System.out.println(numeros);
		Collections.sort(numeros);
		System.out.println(numeros);

		System.out.println("Somente por nome");
		Collections.sort(numeros, new Comparator<Time2>() {
			public int compare(Time2 o1, Time2 o2) {
				return o1.nome.compareTo(o2.nome);
			};
		});
		System.out.println("Somente por qtd Atletas");
		Collections.sort(numeros, new Comparator<Time2>() {
			public int compare(Time2 o1, Time2 o2) {
				return o1.qtdAtletas.compareTo(o2.qtdAtletas);
			};
		});
		
		System.out.println(numeros);
	}
	@Override
	public int compareTo(Time2 o) {
		if(nome.compareTo(o.nome)==0) {
			return o.qtdAtletas.compareTo(qtdAtletas);
		}else {
			return nome.compareTo(o.nome);
		}
	}
}
