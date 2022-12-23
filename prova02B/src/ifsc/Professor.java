package ifsc;

public class Professor extends Pessoa {

	private Integer siape;
	private String dataContrataçao;

	
public Professor() {
		
	}
	
	public Professor(String nome, int cpf, Integer siape,String dataContrataçao) {
		super.setNome(nome);
		super.setCpf(cpf);
		this.siape = siape;
		this.dataContrataçao = dataContrataçao;
	}
	public Integer getSiape() {
		return siape;
	}
	public void setSiape(Integer siape) {
		this.siape = siape;
	}
	public String getDataContrataçao() {
		return dataContrataçao;
	}
	public void setDataContrataçao(String dataContrataçao) {
		this.dataContrataçao = dataContrataçao;
	}
	

	@Override
	public String toString() {
		
		return "Nome :\n"+super.getNome()+"\n"+
				"CPF : \n"+super.getCpf()+"\n"+
				"Siape :\n"+this.siape+"\n"+
		        "datacontratacao :\n"+this.dataContrataçao+"\n";
	}
	

		
	
}
