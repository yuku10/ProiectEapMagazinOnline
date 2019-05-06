import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public static void createAccount() {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nume: ");
        user.setNume(sc.next());
        System.out.println("Prenume:");
        user.setPrenume(sc.next());
        System.out.println("Email:");
        user.setEmail(sc.next());
        System.out.println("Username: ");
        user.setUsername(sc.next());
        System.out.println("Parola:");
        user.setPassword(sc.next());
        System.out.println("Id:");
        user.setId(sc.nextInt());
        ArrayList<String> usernames = magazinDb.getAllUsernames();
        while (usernames.contains(user.getUsername()))
        {
            System.out.println("Username exista deja, informeaza-te si tu dreacu inainte:");
            user.setUsername(sc.next());
        }
        while (user.getPassword() == null )
        {
            System.out.println("Parola: ");
            user.setPassword(sc.next());
        }

        magazinDb.insertUser(user);
    }

    public static void login() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String userLogin = sc.next();
        ArrayList<String> usernames = magazinDb.getAllUsernames();
        while (!usernames.contains(userLogin)) {
            System.out.println("Username-ul nu este bun, baga altul.");
            userLogin = sc.next();
        }
        System.out.println("Parola: ");
        String passwordLogin = sc.next();


        String password = magazinDb.getPassword(userLogin);
        while (!passwordLogin.equals(password)) {
            System.out.println("Parola nu este buna, daca esti prost si ti-ai uitat parola da-i un update");
            passwordLogin = sc.next();
        }
    }


    public static void changePass() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.next();
        System.out.println("Parola noua: ");
        String newPass = sc.next();
        magazinDb.updatePass(newPass, username);
    }
}

//public class UI {
//
//    Cart cart = new Cart();
//    Cart user = new Cart();
//
//    private int ch = 0;
//
//    public UI () {
//        Scanner sc = new Scanner(System.in);
//        String in=sc.next();
//        if(in.equals("user")) {
//            menuUser();
//        }
//        else if(in.equals("admin"))
//        {
//            menu();
//        }
//    }
//
//    public void startScreen () {
//        //System.out.println("1. Display Store Products");
//        System.out.println("1. Display Cart");
//        System.out.println("2. Add other object");
//        System.out.println("3. Remove an object");
//        System.out.println("0. Exit");
//    }
//
//    public void startScreenUser (){
//        System.out.println("1. Display Store Products");
//        System.out.println("2. Displey User Box");
//        System.out.println("0. Exit");
//    }
//
//    public void storeProductsMenu() {
//        System.out.println("1. Add to Cart");
//        System.out.println("2. Remove From Cart");
//        System.out.println("0. Exit");
//    }
//
//    public void userProducts() {
//        System.out.println("1. Buy a product");
//        System.out.println("0. Exit");
//    }
//
//    public void menuUser () {
//        do {
//            startScreenUser();
//            getUserInput();
//
//            switch (ch) {
//                case 1:
//                {//displayStoreProducts();
//                    userProducts();
//                    getUserInput();
//                    innerChoice2();
//                    break;}
//
//                case 2:
//                {
//                    showUserBox();
//                    break;
//
//                }
//
//                case 0:
//                {
//                    System.exit(0);
//                    break;
//                }
//            }
//
//        }while(ch!=0);
//    }
//    public void menu () {
//        do {
//            startScreen();
//            getUserInput();
//
//            switch (ch) {
//                /*case 1:
//                {   displayStoreProducts();
//                    storeProductsMenu();
//                    getUserInput();
//                    innerChoice1();
//                    break;}*/
//                case 1:
//                {
//                    showCart();
//                    break;}
//                case 0:
//                {System.exit(0);
//                    break;}
//                case 2:
//                {
//                    cart.addAdminObject();
//                    break;
//                }
//                case 3:
//                {
//                    Scanner sc = new Scanner(System.in);
//                    cart.removeAdminObject(sc.nextInt());
//                    break;
//                }
//                default:
//
//                    break;
//            }
//        } while (ch != 0);
//    }
//  /*  private void innerChoice1() {
//        switch (ch) {
//            case 1:
//            { addProductToCart();
//                showCart();
//                break;}
//            case 2:
//            {   //removeProductFromCart();
//                cart.removeAdminObject(1);
//                displayStoreProducts();
//                break;}
//            default:
//
//                break;
//        }
//    }
//    */
//    private  void innerChoice2() {
//        switch (ch) {
//            case 1:
//            {
//                addToBox();
//                showCart();
//                break;}
//
//                default:
//                break;
//        }
//    }
//    private int getUserInput() throws NumberFormatException {
//        Scanner in = new Scanner (System.in);
//        ch = Integer.parseInt(in.nextLine());
//        return ch;
//    }
//
//   /* private void displayStoreProducts() {
//
//        for (Product i: cart.cartItems)
//        {
//            System.out.println( i.getPid() + "- " +
//                    i.getName() + " " +
//                    i.getPrice() + " " +
//                    i.getStock());
//        }
//    }*/
//
//
//    private void addProductToCart() {
//        int pid = getUserInput();
//        cart.addProductToCartByPID(pid);
//    }
//
//    private void addToBox() {
//        int pid = getUserInput();
//        user.addInBoxByPID(pid);
//    }
//
//    private void showCart() {
//        cart.printCartItems();
//    }
//
//    private void showUserBox() {
//        user.printUserItems();
//    }
//
//    /*private void removeProductFromCart() {
//        //int pid = getUserInput();
//        cart.removeProductByPID(pid);
//    }
//*/
//    private void removeAdminObj(){
//        int pid = getUserInput();
//        cart.removeAdminObject(pid);
//    }
//
//
//}