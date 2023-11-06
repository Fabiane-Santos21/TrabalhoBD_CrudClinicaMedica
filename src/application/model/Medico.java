package application.model;

public class Medico {
    private int IdMedico;
    private String crm;
    private String nome;
    private String logradouro;
    private String numero;
    private String cep;
    private String bairro;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String especialidade;
    
	public int getIdMedico() {
		return IdMedico;
	}
	public void setIdMedico(int idMedico) {
		IdMedico = idMedico;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public String toString() {
		
		return "Medico [IdMedico=" + IdMedico + ", crm=" + crm + ", nome=" + nome + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", cep=" + cep + ", bairro=" + bairro + ", telefoneResidencial="
				+ telefoneResidencial + ", telefoneCelular=" + telefoneCelular + ", especialidade=" + especialidade + "]";
	}
	
	
    
    
}
