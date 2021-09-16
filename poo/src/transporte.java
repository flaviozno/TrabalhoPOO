import java.time.LocalDate;

public class transporte {

    private String destino;
    private int lotacao;
    private double preco;
    private LocalDate hora;

    public transporte(String destino, int lotacao, double preco) {
        this.destino = destino;
        this.lotacao = lotacao;
        this.preco = preco;
        handleTime();
    }

    void handleTime() {
        hora = LocalDate.now();
    }

    public String getDestino() {
        return destino;
    }

    public int getLotacao() {
        return lotacao;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getDate() {
        return hora;
    }
}
