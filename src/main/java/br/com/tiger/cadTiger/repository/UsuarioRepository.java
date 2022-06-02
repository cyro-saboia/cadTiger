package br.com.tiger.cadTiger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.tiger.cadTiger.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	    @Query("SELECT u FROM Usuario u WHERE u.txtEmail = ?1 and u.txtPassword = ?2")
	    public Usuario findLogin(String email, String password) throws Exception;
	     
	
}
