package it.uniroma3.serivces;

import it.uniroma3.entity.Restaurant;
import it.uniroma3.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant save(final Restaurant restaurant){
        return this.restaurantRepository.save(restaurant);
    }

    public Optional<Restaurant> findById(Long id){
        return this.restaurantRepository.findById(id);
    }

    public List<Restaurant> findAll(){
        return (List)restaurantRepository.findAll();
    }

    public void deleteById(Long id){
        this.restaurantRepository.deleteById(id);
    }
}
