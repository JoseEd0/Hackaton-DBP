package dbp.hackaton.Etiqueta.Aplication;

import dbp.hackaton.Etiqueta.Domain.Etiqueta;
import dbp.hackaton.Etiqueta.Domain.EtiquetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etiquetas")
public class EtiquetasController {

    @Autowired
    private EtiquetaService etiquetaService;

    @GetMapping
    public ResponseEntity<List<Etiqueta>> getAllEtiquetas() {
        return ResponseEntity.ok(etiquetaService.getAllEtiquetas());
    }

    @PostMapping
    public ResponseEntity<Etiqueta> createEtiqueta(@RequestBody Etiqueta etiqueta) {
        etiquetaService.createEtiqueta(etiqueta);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Etiqueta> updateEtiqueta(@PathVariable int id, @RequestBody Etiqueta etiqueta) {
        etiquetaService.updateEtiqueta(id, etiqueta);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEtiqueta(@PathVariable int id) {
        etiquetaService.deleteEtiqueta(id);
        return ResponseEntity.ok().build();
    }
}