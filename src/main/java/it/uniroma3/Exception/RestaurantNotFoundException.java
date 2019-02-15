package it.uniroma3.Exception;

public class RestaurantNotFoundException extends RuntimeException {

    public RestaurantNotFoundException(Long id){
        super("Ristorante con id="+id+" non trovato!");
    }
}
