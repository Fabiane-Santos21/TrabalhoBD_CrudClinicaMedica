package application.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consulta {
	
	private int ConsId;
	private String ConsNome;
	private LocalDate consData;
	private int ConsIdMedico;
	private int ConsIdExame;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	public int getConsId() {
		return ConsId;
	}
	public void setConsId(int consId) {
		ConsId = consId;
	}
	public String getConsNome() {
		return ConsNome;
	}
	public void setConsNome(String consNome) {
		ConsNome = consNome;
	}
	public LocalDate getConsData() {
		return consData;
	}
	public void setConsData(LocalDate consData) {
		this.consData = consData;
	}
	public int getConsIdMedico() {
		return ConsIdMedico;
	}
	public void setConsIdMedico(int consIdMedico) {
		ConsIdMedico = consIdMedico;
	}
	public int getConsIdExame() {
		return ConsIdExame;
	}
	public void setConsIdExame(int consIdExame) {
		ConsIdExame = consIdExame;
	}
	public DateTimeFormatter getFormatter() {
		return formatter;
	}
	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}

	public String conversorData() {
		String dataCons = getConsData().format(formatter);
		return dataCons;
	}
	
	@Override
	public String toString() {
		
		return "Consulta [ConsId=" + ConsId + ", ConsNome=" + ConsNome + ", consData=" + consData + ", ConsIdMedico="
				+ ConsIdMedico + ", ConsIdExame=" + ConsIdExame + ", ConsIdPaciente=" + ", formatter="
				+ formatter + "]";
	}
	
	
	
}
