public final class onibus extends transporte {

    private int bagagem;
    private int paradas;
    private static int contMax = 0;

    public onibus(String destino, int lotacao, int escalas, int bagagem, double preco, String passageiro, int CPF) {
        super(destino, lotacao, preco);
        this.bagagem = bagagem;
        this.paradas = escalas;
        contMax++;
    }

    public void handleSubmit() {
        db DB = new db();
        DB.startConnection();
        //DB.InsertOnibus(getDestino(), getLotacao(), getPreco(), bagagem, paradas, getDate());
    }

    public static int getCont() {
        return contMax;
    }

    @Override
    public String toString() {
        return "Passagem para " + getDestino() + " comprada por R$ " + getPreco() + " na data de " + getDate() + "com "
                + paradas + "escalas e " + bagagem + "bagagem(ns) realizada com sucesso";
    }
}