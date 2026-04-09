package br.com.foursys;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(1000);

        Conta cp = new ContaPoupanca();
        cp.depositar(5000);

        cc.transferir(cp,1000);




        cp.imprimirExtrato();

        
}

}