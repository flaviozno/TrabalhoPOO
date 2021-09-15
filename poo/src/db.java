import java.sql.*;

public class db {
    private String url = "jdbc:postgresql://localhost:5432/poo";
    private String username = "postgres";
    private String password = "151140";
    private Connection c = null;

    public void startConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão realizada com sucesso");
            c.setAutoCommit(false);
        } catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro na conexão!");
        }
    }
    public void Insert(String local, Integer lotacao, Double preco){
        String sqlInsert = "INSERT INTO transporte (destino, lotacao, preco) VALUES ('"+local+"',"+lotacao+","+preco+");";
        try {
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sqlInsert);
            stmt.close();
            c.commit();
            System.out.println("Dados cadastrados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro na inserçção no DB!");
        }
    }

    public void SelectAll(){
        String sqlResult = "SELECT * FROM transporte;";
        try {
            Statement stmt = c.createStatement();
            ResultSet result = stmt.executeQuery(sqlResult);

            while(result.next()){
                String local = result.getString("destino");
                Double preco = result.getDouble("preco");
                int lotacao = result.getInt("lotacao");
                System.out.println("\nLocal: " + local);
                System.out.println("Preco: R$" + preco);
                System.out.println("Lotacao: " + lotacao);
            }

            result.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro na inserção no DB!");
        }
    }

    public void Update(){

    }

    public void Delete(){

    }

    public void Close(){
        try {
            c.close();
            System.out.println("A conexão com o BD foi encerrada");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao fechar DB!");
        }
    }
}
