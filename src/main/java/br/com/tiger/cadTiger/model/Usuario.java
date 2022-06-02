package br.com.tiger.cadTiger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario_usu", schema = "cidade")
public class Usuario {

	@Id
	@SequenceGenerator(schema = "cidade", name = "usuario_seq")
	@Column(name = "id_usuario_usu")
	private Integer id;
	
	@Column(name = "txt_nome_usu")
	private String txtNome;
	
	@Column(name = "txt_email_usu")
	private String txtEmail;
	
	@Column(name = "txt_password_usu")
	private String txtPassword;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(String txtNome) {
		this.txtNome = txtNome;
	}

	public String getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(String txtEmail) {
		this.txtEmail = txtEmail;
	}

	public String getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(String txtPassword) {
		this.txtPassword = txtPassword;
	}
	
}
