package ifpr.pgua.eic.tads.banco.entidades;

public class ContaCorrente extends Conta{ //Aqui estou implementandio uma Herança por meio desta palavrinha extends, ou seja ContaCorrente é uma extenção de Conta
    public ContaCorrente(String agencia, String numero, Pessoa cliente, double saldo, double limite) {
        super(agencia, numero, cliente, saldo); // o super se refere a super classe
        this.limite = limite;
    }

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String gerarExtrato(){
        String texto;

        texto = super.gerarExtrato();
        texto += "Limite: " + limite;

        return texto;
    }

}
