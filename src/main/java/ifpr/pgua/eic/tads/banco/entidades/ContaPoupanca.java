package ifpr.pgua.eic.tads.banco.entidades;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String agencia, String numero, Pessoa cliente, double saldo, double txRendimento) {
        super(agencia, numero, cliente, saldo);
    this.txRendimento = txRendimento;
    }
    private double rendimento;
    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    private double txRendimento;
    public double getTxRendimento() {
        return txRendimento;
    }
    public void setTxRendimento(double txRendimento) {
        this.txRendimento = txRendimento;
    }

    @Override
    public String gerarExtrato(){
        String texto = "";

        texto = super.gerarExtrato();
        texto += " txRendimento: " + txRendimento + " Rendimentos: " + rendimento;

        return texto;
    }
}
