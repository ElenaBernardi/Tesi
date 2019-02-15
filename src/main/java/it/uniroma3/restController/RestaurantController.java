package it.uniroma3.restController;

import it.uniroma3.Exception.RestaurantNotFoundException;
import it.uniroma3.model.Restaurant;
import it.uniroma3.serivce.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    private IRestaurantService restaurantService;
    //Aggregate items
    //Restituisce tutti i ristoranti
    @GetMapping("/restaurants")
    List<Restaurant> findAll(){
        return restaurantService.findAll();
    }

    //crea un nuovo ristorante nel database
    @PostMapping("/restaurants")
    void newRestaurant(@RequestBody Restaurant newRestaurant) {
        restaurantService.save(newRestaurant);
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
