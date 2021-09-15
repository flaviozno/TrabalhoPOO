public final class aviao extends transporte {

    private int classe;
    private int bagagem;
    private int escalas;
    private static int contMax = 0;

    public aviao(String destino, int lotacao, int classe, int escalas, int bagagem, double preco, String passageiro,
            int CPF) {
        super(destino, lotacao, preco, passageiro, CPF);
        this.classe = classe;
        this.bagagem = bagagem;
        this.escalas = escalas;
        contMax++;
    }

    public void handleSubmit() {
        db DB = new db();
        DB.startConnection();
        DB.Insert(getDestino(), getPassageiro(), getCPF(), getLotacao(), getPreco(), classe, bagagem, escalas,
                getDate());
    }

    public static int getCont() {
        return contMax;
    }

    @Override
    public String toString() {
        return "Passagem de " + classe + "ª classe para " + getDestino() + " comprada por R$ " + getPreco()
                + " na data de " + getDate() + "com " + escalas + "escalas e " + bagagem
                + "bagagem(ns) realizada com sucesso";
    }

}
