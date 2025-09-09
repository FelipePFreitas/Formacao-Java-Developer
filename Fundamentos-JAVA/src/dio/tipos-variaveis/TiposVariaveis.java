public class TiposVariaveis {

    public static void main(String[] args) {

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo String
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo String
        float pi = 3.14F;
        double salarioMinimo = 2500.33; // 2.500 está errado
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Da erro por que int maior que short

    }

}