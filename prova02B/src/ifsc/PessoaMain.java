package ifsc;

import java.util.ArrayList;

public class PessoaMain {
		
		public static void main(String[] args) {
			Professor prof1 = new Professor("Pedro",000111222, 14256, " dez dezembro 2020");
			Professor prof2 = new Professor("maria",222333111,14527," vinte dezembro 2021");
			
			Aluno aluno1 = new Aluno("jesus", 777888522, 5869);
			Aluno aluno2 = new Aluno(" davi",333665222,6958);
			
			ArrayList<Professor>arrayProfessor = new ArrayList<>();
			ArrayList<Aluno>arrayAluno = new ArrayList<>();
			
			arrayProfessor.add(prof1);
			arrayProfessor.add(prof2);
			
			
			arrayAluno.add(aluno1);
			arrayAluno.add(aluno2);
			
			
			for (Professor prof : arrayProfessor) {
				System.out.println(prof.toString());
				
				
			}
			for (Aluno aluno : arrayAluno) {
				System.out.println(aluno.toString());
				
				
			}
			

		}

	

	
	
	
	
	

}
