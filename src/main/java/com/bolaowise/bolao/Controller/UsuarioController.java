package com.bolaowise.bolao.Controller;

import com.bolaowise.bolao.DTO.UsuarioDTO;
import com.bolaowise.bolao.Repository.UsuarioRepository;
import com.bolaowise.bolao.Services.UsuarioService;
import com.bolaowise.bolao.entities.Usuario;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/todos")
    public ResponseEntity<List<UsuarioDTO>>findAll(){
        List<UsuarioDTO> list = service.FindAll();

        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/adicionar")
    public ResponseEntity<Usuario> insert(@RequestBody @Valid Usuario obj){

        obj = service.insert(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
}
