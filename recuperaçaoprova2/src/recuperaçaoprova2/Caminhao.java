package recuperaçaoprova2;

public class Caminhao extends Veiculo {

private Integer eixos;
	
	public Caminhao() {
		
	}
	
	public Caminhao(String placa, Integer ano, Integer eixos) {
		super.setPlaca(placa);
		super.setAno(ano);
		this.eixos=eixos;
	}

	public Integer getEixos() {
		return eixos;
	}

	public void setEixos(Integer eixos) {
		this.eixos = eixos;
	}
	
	@Override
	public String toString() {
		
		return "placa\n"+super.getPlaca()+"\n"+
				"ano\n"+super.getAno()+"\n"+
				"eixos\n"+this.eixos+"\n";
	}
	

		
	
}
