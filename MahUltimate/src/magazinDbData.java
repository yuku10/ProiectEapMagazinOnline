public interface magazinDbData {
   // public static Object insertUser;
    String selectUsernames = "SELECT username from user";
    String insertUser = "INSERT INTO user(iduser,username,password,email,Nume,Prenume) VALUES(?, ?, ?, ?, ?, ?)";
    String selectPassword = "SELECT password FROM user where username = ?";
    String insertProduct = "INSERT INTO produse(idproduse,numeProdus,pretProdus,stocProdus) VALUES(?,?,?,?)";
    //String selectUserByUserId = "SELECT * FROM user WHERE iduser = ?";
    String selectUserByUsername = "SELECT * FROM user WHERE username = ?";




}


