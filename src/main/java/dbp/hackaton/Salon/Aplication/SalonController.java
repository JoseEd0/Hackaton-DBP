package dbp.hackaton.Salon.Aplication;

import dbp.hackaton.Salon.Domain.Salon;
import dbp.hackaton.Salon.Domain.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salones")
public class SalonesController {

    @Autowired
    private SalonService salonService;

    @GetMapping
    public ResponseEntity<List<Salon>> getAllSalones() {

        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Salon> createSalon(@RequestBody Salon salon) {

        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Salon> updateSalon(@PathVariable int id, @RequestBody Salon salon) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalon(@PathVariable int id) {

        return ResponseEntity.ok().build();
    }
}