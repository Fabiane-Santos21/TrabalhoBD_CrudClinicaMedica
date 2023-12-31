package application.model;

public class Paciente {
    
	private int id;
	private String nome;
	private String cpf;
	private String logradouro;
	private String numero;
	private String cep;
	private String bairro;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String email;
	private String sexo;
	private int PacIdMedico;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getPacIdMedico() {
		return PacIdMedico;
	}
	public void setPacIdMedico(int pacIdMedico) {
		PacIdMedico = pacIdMedico;
	}
	@Override
	public String toString() {
		
		return "Paciente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", logradouro=" + logradouro + ", numero="
				 + numero + ", cep=" + cep + ", bairro=" + bairro + ", telefoneResidencial=" 
				 + telefoneResidencial + ", telefoneCelular=" + telefoneCelular + ", email=" + email + 
				 ", sexo=" + sexo + ", PacIdMedico=" + PacIdMedico + "]";
						
	}
	
	
	
}
