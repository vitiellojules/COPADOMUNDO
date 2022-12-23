package ifsc;

public class Aluno extends Pessoa{
	private Integer matricula;
	
	
public Aluno() {
		
	}
	
	public Aluno(String nome, int cpf, Integer matricula) {
		super.setNome(nome);
		super.setCpf(cpf);
		this.matricula = matricula;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		
		return "Nome :\n"+super.getNome()+"\n"+
				"CPF :\n"+super.getCpf()+"\n"+
				"matricula :\n"+this.matricula+"\n";
	}
}
