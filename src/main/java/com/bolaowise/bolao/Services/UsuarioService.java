package com.bolaowise.bolao.Services;

import com.bolaowise.bolao.DTO.UsuarioDTO;
import com.bolaowise.bolao.Repository.UsuarioRepository;
import com.bolaowise.bolao.entities.Usuario;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository respository;

    @Transactional(readOnly = true)
    public List<UsuarioDTO> FindAll(){
        List<Usuario> list = respository.findAll();

        List<UsuarioDTO> lisDto = new ArrayList<>();

        for(Usuario usur: list){
            lisDto.add(new UsuarioDTO(usur));
        }

        return lisDto;
    }

    public Usuario insert(Usuario entity){
        Usuario usuario = respository.findByEmail(entity.getEmail());
        if(usuario != null){
            throw new ServiceException("Email Ivalido");
        }
        return respository.save(entity);
    }
}
