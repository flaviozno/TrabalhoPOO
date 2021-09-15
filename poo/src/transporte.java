import java.time.LocalDate;

public class transporte {
    private String destino;
    private String passageiro;
    private int lotacao;
    private int CPF;
    private double preco;
    private LocalDate hora;

    public transporte(String destino, int lotacao, double preco, String passageiro, int CPF) {
        this.destino = destino;
        this.passageiro = passageiro;
        this.CPF = CPF;
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

    public int getCPF() {
        return CPF;
    }

    public String getPassageiro() {
        return passageiro;
    }
}
