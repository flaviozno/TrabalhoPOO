public class Passageiro {

    private String nome;
    private String destino;
    private int CPF;
    private int idade;
    private int bagagem;
    private int acompanhantes;

    public Passageiro(String nome, String destino, int CPF, int idade, int bagagem, int acompanhantes) {
        this.nome = nome;
        this.destino = destino;
        this.CPF = CPF;
        this.idade = idade;
        this.bagagem = bagagem;
        this.acompanhantes = acompanhantes;
    }

    public String getNome() {
        return nome;
    }

    public String getDestino() {
        return destino;
    }

    public int getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public int getBagagem() {
        return bagagem;
    }

    public int getAcompanhantes() {
        return acompanhantes;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s", nome) + String.format("\nCPF: %d", CPF)
                + String.format("\nDestino: %s", destino) + String.format("\nBagagem(ns): %d", bagagem)
                + String.format("\nAcompanhante(s): %d", acompanhantes);
    }

}
