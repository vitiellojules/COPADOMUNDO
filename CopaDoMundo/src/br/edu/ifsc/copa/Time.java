package br.edu.ifsc.copa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Time {
	public String nome;
	public Integer pontos;
	public Integer cartoesAmarelo;
	public Integer vitorias;
	public Integer getVitorias() {
		return vitorias;
	}
	
	public String getNome() {
		return nome;
	}
	public Integer getCartoesAmarelo() {
		return cartoesAmarelo;
	}
	public Integer getPontos() {
		return pontos;
	}
	@Override
	public String toString() {
		
		return nome + "\t" + pontos +"\t" +vitorias +"\t" + cartoesAmarelo;
	}
	public static void main(String[] args) {
		
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		t1.nome="A";
		t1.pontos=30;
		t1.cartoesAmarelo=3;
		t1.vitorias=7;
		
		t2.nome="B";
		t2.pontos=30;
		t2.cartoesAmarelo=4;
		t2.vitorias=7;
		
		t3.nome="C";
		t3.pontos=20;
		t3.cartoesAmarelo=2;
		t3.vitorias=3;
		
		ArrayList<Time> times = new ArrayList<>();
		times.add(t3);
		times.add(t2);
		times.add(t1);
		
		Comparator<Time> comparatorPontos = Comparator
                .comparing(Time::getPontos).reversed();
		Comparator<Time> comparatorVitorias = Comparator
                .comparing(Time::getVitorias).reversed();
		Comparator<Time> comparatorCartaoAmarelo = Comparator
                .comparing(Time::getCartoesAmarelo);
		Comparator<Time> comparadorFinal =
				comparatorPontos.
				thenComparing(comparatorVitorias).
				thenComparing(comparatorCartaoAmarelo);
		
		
		//Opcao geral
		Comparator<Time> comparadorGeral =
				Comparator.comparing(Time::getPontos).
				reversed().thenComparing(
						Comparator.comparing(
								Time::getVitorias).reversed()).
				thenComparing(Time::getCartoesAmarelo);
		
		
		List<Time> timeSorted = times.stream()
                .sorted(comparadorFinal)
                .collect(Collectors.toList());
		System.out.println("Cadastrados");
		System.out.println("Time\tPontos\tVit\tC.A");
		for (Time time : times) {
			System.out.println(time);
		}
		System.out.println("Ordenados");
		System.out.println("Time\tPontos\tVit\tC.A");
		for (Time time : timeSorted) {
			System.out.println(time);
		}
		System.out.println("Cadastrados");
		System.out.println("Time\tPontos\tVit\tC.A");
		for (Time time : times) {
			System.out.println(time);
		}
		
		
	}
}
