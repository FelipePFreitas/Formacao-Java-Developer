public class Relacionais{

    public static void main(String[] args) {

        String nome1 = "Gleyson";
        String nome2 = "Gleyson";

        System.out.println(nome1 == nome2);
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2 ? " + simNao);

       simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2 ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2 ? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numero1 é maior ou igual que numero2 ? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numero1 é menor que numero2 ? " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("numero1 é menor e igualque numero2 ? " + simNao);





    }
}