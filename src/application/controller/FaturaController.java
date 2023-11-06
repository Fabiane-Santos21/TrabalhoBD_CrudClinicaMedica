package application.controller;

import java.sql.SQLException;
import java.util.List;

import application.model.Fatura;
import application.persistence.FaturaDAO;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FaturaController implements IFaturaController{

	private TextField txtFatCodigo;
	private TextField txtFatNome;
	private TextField txtFatDescricao;
	private TextField txtFatValor;
	private TextField txtFatIdPaciente;
	private TextArea taListarFatura;
	
	public FaturaController(TextField txtFatCodigo, TextField txtFatNome, TextField txtFatDescricao, TextField txtFatValor, TextField txtFatIdPaciente, TextArea taListarFatura) 
	{
		this.txtFatCodigo = txtFatCodigo;
		this.txtFatNome = txtFatNome;
		this.txtFatDescricao = txtFatDescricao;
		this.txtFatValor = txtFatValor;
		this.txtFatIdPaciente = txtFatIdPaciente;
		this.taListarFatura = taListarFatura;
	}

	@Override
	public void insereFatura(Fatura f) throws ClassNotFoundException, SQLException  
	{
		FaturaDAO pDAO = new FaturaDAO();
		pDAO.insereFatura(f);
		limpaCamposFatura();
		buscaFaturas();
		
	}

	@Override
	public void atualizarFatura(Fatura f) throws SQLException, ClassNotFoundException 
	{
		FaturaDAO fDAO = new FaturaDAO();
		fDAO.atualizarFatura(f);
		limpaCamposFatura();
		buscaFaturas();
		
		
	}

	@Override
	public void excluiFatura(Fatura f) throws SQLException, ClassNotFoundException 
	{
		FaturaDAO fDAO = new FaturaDAO();
		fDAO.excluiFatura(f);
		limpaCamposFatura();
		buscaFaturas();
	}

	@Override
	public void buscaFatura(Fatura f) throws SQLException, ClassNotFoundException 
	{
		limpaCamposFatura();
		
		FaturaDAO fDAO = new FaturaDAO();
		f = fDAO.buscaFatura(f);
		
		txtFatCodigo.setText(String.valueOf(f.getFatId()));
		txtFatNome.setText(f.getFatNome());
		txtFatDescricao.setText(f.getFatDescricao());
		txtFatValor.setText(String.valueOf(f.getFatValor()));
		txtFatIdPaciente.setText(String.valueOf(f.getFatIdPaciente()));
		
		
		
		
	}

	@Override
	public void buscaFaturas() throws ClassNotFoundException, SQLException 
	{
		limpaCamposFatura();
		taListarFatura.setText("");
		
		FaturaDAO fDAO = new FaturaDAO();
		List<Fatura> listaFaturas = fDAO.buscaFaturas();
		
		StringBuffer buffer = new  StringBuffer("Código\t\t\tNome\t\t\t\t\t\t\tDescrição\t\t\t\t\t\t\tValor\t\t\t\tId Paciente\n");
		for(Fatura f: listaFaturas)
		{
			buffer.append(f.getFatId()+"\t\t"+f.getFatNome()+"\t\t\t\t\t\t"+f.getFatDescricao()+"\t\t\t\t\t\t"+f.getFatValor()+"\t\t\t\t"+f.getFatIdPaciente()+"\n");
		}
		
		taListarFatura.setText(buffer.toString());
		
	}
	
	private void limpaCamposFatura()
	{
		txtFatCodigo.setText("");
		txtFatNome.setText("");
		txtFatDescricao.setText("");
		txtFatValor.setText("");
		
	}
}


