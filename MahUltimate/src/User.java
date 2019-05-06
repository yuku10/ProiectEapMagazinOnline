import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;
import java.util.Scanner;

public class User {
    private String Nume;
    private String Prenume;
    private String email;
    private String password;
    private String username;
    private Integer id;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }

    public User(Integer id, String username, String password, String email, String nume, String prenume) {
        Nume = nume;
        Prenume = prenume;
        this.email = email;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public String getNume() {
        return Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Integer getId() {
        return id;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //    List<Product> cartItems=new ArrayList<Product>();
//    List<Product> userItems=new ArrayList<Product>();
//
//    public void addProductToCartByPID(Integer pid) {
//        Product product = getProductByProductID(pid);
//        addToCart(product);
//        product.setStock(product.getStock()+1);
//    }
//
//    public void addInBoxByPID(Integer pid) {
//        Product product = getProductByProductID(pid);
//        buyProduct(product);
//        int count=1;
//        product.setStock(count);
//        count++;
//    }
//    private Product getProductByProductID(Integer pid) {
//        Product product = null;
//        for (Product prod: cartItems) {
//            if (prod.getPid() == pid) {
//                product = prod;
//                break;
//            }
//        }
//       // System.out.println("sters");
//        return product;
//    }
//
//    private void addToCart(Product product) {
//        cartItems.add(product);
//    }
//    private void buyProduct(Product product) {
//        userItems.add(product);
//    }
//
//    public void removeProductByPID(Product product) {
//        //Product prod = getProductByProductID(pid);
//        cartItems.remove(product);
//    }
//
//    void printUserItems() {
//        for(Product prod: userItems) {
//            System.out.println(prod.getName()+" "+prod.getStock()+" ");
//
//        }
//    }
//
//    void printCartItems() {
//        for (Product prod: cartItems) {
//            System.out.println(prod.getPid()+" "+prod.getName()+" "+prod.getStock()+" ");
//        }
//    }
//
//    void addAdminObject() {
//
//        Scanner sc = new Scanner(System.in);
//        Product s = new Product(cartItems.size() + 1, sc.next(), sc.nextDouble(), sc.nextInt());
//        for (Product prod : cartItems) {
//            if (s.equals(prod)) {
//                s.setStock(prod.getStock() + s.getStock());
//            }
//        }
//        cartItems.add(s);
//
//    }
//
//
//    void removeAdminObject(int pid) {
//        Product prod = getProductByProductID(pid);
//        cartItems.remove(prod);
//        //System.out.println(" Sters");
//    }
//

}
