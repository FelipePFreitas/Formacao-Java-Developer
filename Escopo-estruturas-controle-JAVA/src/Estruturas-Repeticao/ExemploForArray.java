
public class ExemploForArray {

    public static void main(String[] args) {

        // em arrays o indice de elementos inicia em ZERO
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno do indice x = " + x + " é " + alunos[x]);
        }

    }

}
