package it.uniroma3.restController;

import it.uniroma3.Exception.RestaurantNotFoundException;
import it.uniroma3.entity.Restaurant;
import it.uniroma3.serivces.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class restaurantController {
    @Autowired
    private RestaurantService restaurantService;
    //Aggregate items
    //Restituisce tutti i ristoranti
    @GetMapping("/restaurants")
    List<Restaurant> findAll(){
        return restaurantService.findAll();
    }

    //crea un nuovo ristorante nel database e lo restituisce
    @PostMapping("/restaurants")
    Restaurant newRestaurant(@RequestBody Restaurant newRestaurant) {
        return restaurantService.save(newRestaurant);
    }

    //Single item
    //ricerca di un ristorante per id
    @GetMapping("/restaurants/{id}")
    Restaurant findById(@PathVariable Long id) {
        return restaurantService.findById(id)
                .orElseThrow(() -> new RestaurantNotFoundException(id));
    }
    //cancellazione di un ristorante per id
    @DeleteMapping("/restaurants/{id}")
    void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteById(id);
    }
}
