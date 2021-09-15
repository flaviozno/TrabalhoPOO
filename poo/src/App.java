import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException{
       db DB = new db();
       DB.startConnection();
       DB.Insert("Rio de Janeiro",1000,9960.99);
       DB.SelectAll();
       DB.Close();
    }
}
