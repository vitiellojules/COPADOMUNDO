package recuperaçaoprova2;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Caminhao caminhao1 = new Caminhao("sdae2123", 2000, 6);
		Caminhao caminhao2 = new Caminhao("wtfs2311", 1986, 4);
		Caminhao caminhao3 = new Caminhao("hyig6689", 1990, 5);
		
		Onibus onibus1 = new Onibus("yuyhb12312", 1980, 40);
		Onibus onibus2 = new Onibus("hvyf546", 1991, 50);
		Onibus onibus3 = new Onibus("nqs1232", 2000, 60);
		
		ArrayList<Caminhao>arrayCaminhao = new ArrayList<>();
		ArrayList<Onibus>arrayOnibus = new ArrayList<>();
		
		arrayCaminhao.add(caminhao1);
		arrayCaminhao.add(caminhao2);
		arrayCaminhao.add(caminhao3);
		
		arrayOnibus.add(onibus1);
		arrayOnibus.add(onibus2);
		arrayOnibus.add(onibus3);
		
		for (Caminhao caminhao : arrayCaminhao) {
			System.out.println(caminhao.toString());
			
			
		}
		for (Onibus onibus : arrayOnibus) {
			System.out.println(onibus.toString());
			
			
		}
		

	}

}
