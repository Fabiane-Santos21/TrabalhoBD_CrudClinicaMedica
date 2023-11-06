package application.model;

public class Fatura {

	private int fatId;
	private String fatNome;
	private String fatDescricao;
	private double fatValor;
	private int fatIdPaciente;
	public int getFatId() {
		return fatId;
	}
	public void setFatId(int fatId) {
		this.fatId = fatId;
	}
	public String getFatNome() {
		return fatNome;
	}
	public void setFatNome(String fatNome) {
		this.fatNome = fatNome;
	}
	public String getFatDescricao() {
		return fatDescricao;
	}
	public void setFatDescricao(String fatDescricao) {
		this.fatDescricao = fatDescricao;
	}
	public double getFatValor() {
		return fatValor;
	}
	public void setFatValor(double fatValor) {
		this.fatValor = fatValor;
	}
	public int getFatIdPaciente() {
		return fatIdPaciente;
	}
	public void setFatIdPaciente(int fatIdPaciente) {
		this.fatIdPaciente = fatIdPaciente;
	}
	
	@Override
	public String toString() {
		
		return "Fatura [fatId=" + fatId + ", fatNome=" + fatNome + ", fatDescricao=" + fatDescricao + ", fatValor="
				+ fatValor + ", fatIdPaciente=" + fatIdPaciente + "]";
	}
	
	
}
