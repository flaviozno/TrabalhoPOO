import java.sql.*;

public class conect {
    private String url;
    private String username;
    private String password;
    private Connection c = null;
    Statement stmt = null;

    conect(){
        url="jdbc:postgresql://localhost:5432/poo";
        username="postgres";
        password="151140";
        
        try {
            String sql = "INSERT INTO transporte (destino, lotacao, preco)" + "VALUES ('tp', 30, 100);";

            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão realizada com sucesso");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            System.out.println("Sucesso");

            stmt = c.createStatement();
            String sqlResult = "SELECT * FROM transporte;";
            ResultSet result = stmt.executeQuery(sqlResult);
            while(result.next()){
                String local = result.getString("destino");
                int preco = result.getInt("preco");
                int lotacao = result.getInt("lotacao");
                System.out.println("Local: " + local);
                System.out.println("Preco: " + preco);
                System.out.println("Lotacao: " + lotacao);
            }
            result.close();
            stmt.close();
            c.close();
        }catch (Exception e){
            e.printStackTrace(); 
        }
    }
}
