package Autos.controllers;

import Autos.Entities.Marca;
import Autos.converted.AutoConverter;
import Autos.converted.MarcaConverter;
import Autos.request.MarcaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by alumno on 07/06/2017.
 */

@Controller
@RequestMapping(
        value = "/api",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class AutoController {
    //Atributos
    @Autowired
    AutoService autoService;
    @Autowired
    MarcaService marcaService;
    @Autowired
    AutoConverter autoConverter;
    @Autowired
    MarcaConverter marcaConverter;

    //Metodos

    //Marcas
    //Agrega marca
    @RequestMapping(value = "/marca", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addMarca(@RequestBody MarcaRequest request) {
        try {
            marcaService.newMarca(request.getDescripcion(), request.getPais());
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Muestra las marcas
    @RequestMapping(value = "/marcas/", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<MarcaWrapper>> getTodas(){
        List<Marca> result = marcaService.getAll();
        if (result.size()>0) {
            return new ResponseEntity<List<MarcaWrapper>>(this.convertListMarcas(result), HttpStatus.OK);
        } else {
            return new ResponseEntity<List<MarcaWrapper>>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/m", method = RequestMethod.GET)
    public @ResponseBody
    String get(){
        return "asd";
    }


}

