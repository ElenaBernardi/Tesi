package it.uniroma3.serivce;
import it.uniroma3.model.Restaurant;
import java.util.List;
import java.util.Optional;

public interface IRestaurantService {

    public List<Restaurant> findAll();
    public void save(Restaurant restaurant);
    public void deleteById(Long id);
    public Optional<Restaurant> findById(Long id);
}
