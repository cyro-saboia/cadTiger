package br.com.tiger.cadTiger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiger.cadTiger.model.Usuario;
import br.com.tiger.cadTiger.repository.UsuarioRepository;

@Service
public class LoginService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
    public boolean validateUser(String userid, String password) throws Exception {
    	
    	Usuario usuario = null;
    	usuario = usuarioRepository.findLogin(userid, password);
    	return usuario != null;
    	
    }

}
