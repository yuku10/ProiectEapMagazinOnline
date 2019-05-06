import java.sql.*;
import java.util.ArrayList;

public class magazinDb {

    private static Connection dataBaseConnection;

    public static Connection getDataBaseConnection() {
        dataBaseConnection = null;
        try{

            dataBaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazin?useSSL=false&allowPublicKeyRetrieval=true", "root", "");
        } catch(Exception e){
            e.printStackTrace();
        }
        return dataBaseConnection;
    }

    public static void insertProduct(Product newProduct) {
        try (PreparedStatement Statement = getDataBaseConnection().prepareStatement(magazinDbData.insertProduct)){
            Statement.setInt(1, newProduct.getPid());//newProduct.getPid());
            Statement.setString(2, newProduct.getName());
            Statement.setDouble(3, newProduct.getPrice());//newUser.getEmail());
            Statement.setInt(4, newProduct.getStock());

            Statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public static void insertUser(User user){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.insertUser)){
            statement.setString(2, user.getUsername());
            statement.setString(5, user.getNume());
            statement.setString(6, user.getPrenume());
            statement.setString(4, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setInt(1,user.getId());
            statement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
        close();
    }

    public static User selectUser(String username){
        User user = new User();
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectUserByUsername)){
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                user.setUsername(resultSet.getString("username"));
                user.setNume(resultSet.getString("Nume"));
                user.setPrenume(resultSet.getString("Prenume"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setId(resultSet.getInt("iduser"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    public static ArrayList<String> getAllUsernames(){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectUsernames)){
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String> usernames = new ArrayList<>();
            while(resultSet.next()){
                String username = resultSet.getString("username");
                usernames.add(username);
            }
            resultSet.close();
            close();
            return usernames;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static String getPassword(String username){

        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectPassword)){
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            String password = null;
            if(resultSet.next())
                password =  resultSet.getString("password");
            resultSet.close();
            close();
            return password;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void close(){
            try {
                dataBaseConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void updatePass(String newPass,String username) {

            try (PreparedStatement thisStatement = getDataBaseConnection().prepareStatement("UPDATE user SET password = ? WHERE username = ?")) {
                thisStatement.setString(1, newPass);
                thisStatement.setString(2, username);
                thisStatement.executeUpdate();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }


}

