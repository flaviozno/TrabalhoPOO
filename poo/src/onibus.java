public final class onibus extends transporte {

    private int bagagem;
    private int escalas;
    private static int contMax = 0;

    public onibus(String destino, int lotacao, int escalas, int bagagem, double preco, String passageiro, int CPF) {
        super(destino, lotacao, preco, passageiro, CPF);
        this.bagagem = bagagem;
        this.escalas = escalas;
        contMax++;
    }

    public void handleSubmit() {
        db DB = new db();
        DB.startConnection();
        DB.InsertOnibus(getDestino(), getPassageiro(), getCPF(), getLotacao(), getPreco(), bagagem, escalas, getDate());
    }

    public static int getCont() {
        return contMax;
    }

    @Override
    public String toString() {
        return "Passagem para " + getDestino() + " comprada por R$ " + getPreco() + " na data de " + getDate() + "com "
                + escalas + "escalas e " + bagagem + "bagagem(ns) realizada com sucesso";
    }
}