package estoreapi.model;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a user
 * 
 * @author Jonathan Zhu
 * @author Damon Gonzalez
 * @author Clayton Acheson
 */
public class User {

    private static final Logger LOG = Logger.getLogger(User.class.getName());

    // Package private for tests
    static final String STRING_FORMAT = "User [id=%d, username=%s]";

    @JsonProperty("id") private int id;
    @JsonProperty("username") private String username;
    @JsonProperty("cart") private Cart cart;
    @JsonProperty("productsPurchased") private int[] productsPurchased;

    /**
     * Create a user with the given id and username
     * @param id The id of the user
     * @param username The username of the user
     *  
     * {@literal @}JsonProperty is used in serialization and deserialization
     * of the JSON object to the Java object in mapping the fields.  If a field
     * is not provided in the JSON object, the Java field gets the default Java
     * value, i.e. 0 for int
     */
    public User(@JsonProperty("id") int id , @JsonProperty("username") String username, @JsonProperty("cart") Cart cart, @JsonProperty("productsPurchased") int[] productsPurchased) {
        this.id = id;
        this.username = username;
        this.cart = cart;
        this.productsPurchased = productsPurchased;
    }

    /**
     * Retrieves the id of the user
     * @return The id of the user
     */
    public int getId() {
        return id;
    }

    /**
     * Retrieves the username of the user
     * @return The username of the user
     */
    public String getUsername() {
        return username;
    }

    /**
     * Retrieves the cart of the user
     * @return The cart of the user
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Retrieves a list of the product ID's the user has purchased
     * @return a list of the product ID's the user has purchased
     */
    public int[] getProductsPurchased() {
        return productsPurchased;
    }

    public void setProductsPurchased(int[] productsPurchased) {
        this.productsPurchased = productsPurchased;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format(STRING_FORMAT,id,username,cart,productsPurchased);
    }

	public void setCart(Cart cart) {
        this.cart = cart;
	}

}