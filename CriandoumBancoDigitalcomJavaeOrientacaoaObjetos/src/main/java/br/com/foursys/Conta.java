package br.com.foursys;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements ServicoConta {
    private static int contadorAgencia = 0;
    private static int contadorNumero = 0;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
        this.agencia = contadorAgencia++;
        this.numero = contadorNumero++;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;

    }

    public void depositar(double valor) {
        saldo += valor;

    }

    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        OffsetDateTime agora = OffsetDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String resultado = agora.format(formatter);
        System.out.printf("Valor da transferência: %.2f Horário: %s%n", valor,resultado);
    }

    public void imprimirExtrato(){
        System.out.printf("Agência: %d | Conta: %d | Saldo: %.2f%n", agencia, numero, saldo);
    }

}
