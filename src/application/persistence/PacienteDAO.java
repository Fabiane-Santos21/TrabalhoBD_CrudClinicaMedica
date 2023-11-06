package application.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.model.Medico;
import application.model.Paciente;

public class PacienteDAO implements IPacienteDAO{
    
private Connection conn;
	
	public PacienteDAO() throws ClassNotFoundException, SQLException {
		GenericDAO cdb = new GenericDAO();
		
		conn = cdb.getConnection();
	}

	@Override
	public void inserirPaciente(Paciente p) throws SQLException {
		String sql = "INSERT INTO paciente VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getId());
		ps.setString(2, p.getNome());
		ps.setString(3, p.getCpf());
		ps.setString(4, p.getLogradouro());
		ps.setString(5, p.getNumero());
		ps.setString(6, p.getCep());
		ps.setString(7, p.getBairro());
		ps.setString(8, p.getTelefoneResidencial());
		ps.setString(9, p.getTelefoneCelular());
		ps.setString(10, p.getEmail());
		ps.setString(11, p.getSexo());
		ps.setInt(12, p.getPacIdMedico());
		
		ps.execute();
		ps.close();
		

	}

	@Override
	public void atualizarPaciente(Paciente p) throws SQLException {
	String sql = "UPDATE paciente SET nome = ?, cpf = ?, logradouro = ?, numero = ?, cep = ?,bairro = ?,telefoneResidencial = ?, telefoneCelular = ?, email = ?, sexo = ?, PacIdMedico = ? WHERE id = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		ps.setString(1, p.getNome());
		ps.setString(2, p.getCpf());
		ps.setString(3, p.getLogradouro());
		ps.setString(4, p.getNumero());
		ps.setString(5, p.getCep());
		ps.setString(6, p.getBairro());
		ps.setString(7, p.getTelefoneResidencial());
		ps.setString(8, p.getTelefoneCelular());
		ps.setString(9, p.getEmail());
		ps.setString(10, p.getSexo());
		ps.setInt(11, p.getPacIdMedico());
		ps.setInt(12, p.getId());
		
		ps.execute();
		ps.close();
		
	}

	@Override
	public void excluiPaciente(Paciente p) throws SQLException {
		String sql = "DELETE FROM paciente WHERE id = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, p.getId());
		
		ps.execute();
		ps.close();
	}

	@Override
	public Paciente buscaPaciente(Paciente p) throws SQLException {
		String sql = "select nome, cpf, logradouro, numero, cep, bairro, telefoneResidencial, telefoneCelular, email, sexo FROM paciente WHERE = ?";
		
		
		
	
	PreparedStatement ps = conn.prepareStatement(sql.toString());
	ps.setInt(1, p.getId());	
	
	int cont = 0;
	ResultSet rs = ps.executeQuery();
	
	if(rs.next()) {	
		
		Medico m = new Medico();
		
		m.setIdMedico(rs.getInt("IdMedico"));
		m.setNome(rs.getString("nome"));
		m.setCrm(rs.getString("crm"));
		m.setLogradouro(rs.getString("logradouro"));
		m.setNumero(rs.getString("numero"));
		m.setCep(rs.getString("cep"));
		m.setBairro(rs.getString("bairro"));
		m.setTelefoneResidencial(rs.getString("telefoneResidencial"));
		m.setTelefoneCelular(rs.getString("telefoneCelular"));
		m.setEspecialidade(rs.getString("especialidade"));
		
		
		p.setId(rs.getInt("id"));
		p.setNome(rs.getString("nome"));
		p.setCpf(rs.getString("cpf"));
		p.setLogradouro(rs.getString("logradouro"));
		p.setNumero(rs.getString("numero"));
		p.setCep(rs.getString("cep"));
		p.setBairro(rs.getString("bairro"));
		p.setTelefoneResidencial(rs.getString("telefoneResidencial"));
		p.setTelefoneCelular(rs.getString("telefoneCelular"));
		p.setEmail(rs.getString("email"));
		p.setSexo(rs.getString("sexo"));
		p.setPacIdMedico(rs.getInt("PacIdMedico"));
		cont++;
	}
	
	if(cont == 0) 
	{
		
		p = new Paciente();
		
	}
		rs.close();
		ps.close();
		return p;
	}
	
	@Override
	public List<Paciente> listaPacientes() throws SQLException {
		List<Paciente> listaPacientes = new ArrayList<Paciente>();
		String sql = "select nome, cpf, logradouro, numero, cep, bairro, telefoneResidencial, telefoneCelular, email, sexo FROM paciente ";
		
		
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		
		ResultSet rs = ps.executeQuery();
		
		
		
		while (rs.next())
		{
			Medico m = new Medico();
			
			m.setIdMedico(rs.getInt("IdMedico"));
			m.setCrm(rs.getString("crm"));
			m.setNome(rs.getString("nome"));
			m.setLogradouro(rs.getString("logradouro"));
			m.setNumero(rs.getString("numero"));
			m.setCep(rs.getString("cep"));
			m.setBairro(rs.getString("bairro"));
			m.setTelefoneResidencial(rs.getString("telefoneResidencial"));
			m.setTelefoneCelular(rs.getString("telefoneCelular"));
			m.setEspecialidade(rs.getString("especialidade"));
			
			
			Paciente p = new Paciente();	
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			p.setCpf(rs.getString("cpf"));
			p.setLogradouro(rs.getString("logradouro"));
			p.setNumero(rs.getString("numero"));
			p.setCep(rs.getString("cep"));
			p.setBairro(rs.getString("bairro"));
			p.setTelefoneResidencial(rs.getString("telres"));
			p.setTelefoneCelular(rs.getString("telcel"));
			p.setEmail(rs.getString("email"));
			p.setSexo(rs.getString("sexo"));
			p.setPacIdMedico(rs.getInt("PacIdMedico"));
			
			listaPacientes.add(p);
		}
	
		return listaPacientes;
	}

}


