package appdatabase2.banco2.web;

import appdatabase2.banco2.Modelo.Bike;
import appdatabase2.banco2.Servicio.BikeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Bike")
public class BikeController {

    @Autowired
    private BikeServicio bikeServicio;

    @GetMapping("/all")
    public List<Bike> getAll(){
        return bikeServicio.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bike save(Bike bk){
        return bikeServicio.save(bk);
    }
}