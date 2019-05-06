import java.util.ArrayList;

public class UserBox {
    private User user;
    private double sumaCos;
    private ArrayList<Product> cartItems=new ArrayList<Product>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getSumaCos() {
        return sumaCos;
    }

    public void setSumaCos(double sumaCos) {
        this.sumaCos = sumaCos;
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<Product> cartItems) {
        this.cartItems = cartItems;
    }
}
