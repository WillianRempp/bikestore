
package com.bikestore.gateway.http;

import com.bikestore.model.Bicicleta;
import com.bikestore.usecase.BicicletaCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@SuppressWarnings("unused")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/bikestore/bike")
public class BikeController {

    private final BicicletaCrud bicicletaCrud;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Bicicleta> getAllBikes() {
        return bicicletaCrud.findAll();
    }

    @GetMapping("{codigoBicicleta}")
    @ResponseStatus(HttpStatus.OK)
    public Bicicleta getBikeById(@PathVariable(value = "codigoBicicleta") int codigoBicicleta) {
        return bicicletaCrud.findById(codigoBicicleta);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String saveBike(@Valid @RequestBody Bicicleta bicicleta) {
        return bicicletaCrud.create(bicicleta);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public String updateBike(@Valid @RequestBody Bicicleta bicicleta) {
        return bicicletaCrud.update(bicicleta);
    }

    @DeleteMapping("/{codigoBicicleta}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBikeById(@PathVariable("codigoBicicleta") int codigoBicicleta) {
        bicicletaCrud.deleteById(codigoBicicleta);
    }
}