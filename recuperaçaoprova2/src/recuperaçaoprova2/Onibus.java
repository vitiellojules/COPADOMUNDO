package recuperaçaoprova2;

public class Onibus extends Veiculo{
private Integer assentos;
	
	public Onibus() {
		
	}
	
	public Onibus(String placa, Integer ano, Integer assentos){
		super.setPlaca(placa);
		super.setAno(ano);
		this.assentos=assentos;
	}

	public Integer getAssentos() {
		return assentos;
	}

	public void setAssentos(Integer assentos) {
		this.assentos = assentos;
	}
	
	@Override
	public String toString() {
		
		return "placa\n"+super.getPlaca()+"\n"+
				"ano\n"+super.getAno()+"\n"+
				"assentos\n"+this.assentos+"\n";
	}

}
