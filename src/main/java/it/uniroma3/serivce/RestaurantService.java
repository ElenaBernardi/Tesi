package it.uniroma3.serivce;

import it.uniroma3.model.Restaurant;
import it.uniroma3.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService implements IRestaurantService{
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> findAll(){
        return (List<Restaurant>)restaurantRepository.findAll();
    }

    @Override
    public void save(Restaurant restaurant) {
        this.restaurantRepository.save(restaurant);
    }

    @Override
    public void deleteById(Long id) {
        this.restaurantRepository.deleteById(id);
    }

    @Override
    public Optional<Restaurant> findById(Long id){
        return this.restaurantRepository.findById(id);
    }

}
