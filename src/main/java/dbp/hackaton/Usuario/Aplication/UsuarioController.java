package dbp.hackaton.Usuario.Aplication;

import dbp.hackaton.Usuario.Domain.Usuario;
import dbp.hackaton.Usuario.Domain.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public ResponseEntity<Usuario> register(@RequestBody Usuario usuario) {

        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {

        return ResponseEntity.ok().build();
    }
}