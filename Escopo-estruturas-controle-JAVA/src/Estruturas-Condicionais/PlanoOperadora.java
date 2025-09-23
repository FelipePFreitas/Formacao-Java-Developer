
public class PlanoOperadora {

    public static void main(String[] args) {

        String plano = "M";

        // if (plano == "B") {
        //     System.out.println("100 minutos de ligação");
        // } else if (plano == "M") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e Instagram grátis");
        // } else if (plano == "G") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e Instagram grátis");
        //     System.out.println("5GB de Youtube");
        // }
        
        switch (plano) {
            case "T": {
                System.out.println("5GB DE YOUTUBE");
            }
            case "M": {
                System.out.println("WHATS E INSTAGRAM GRÁTIS");
            }
            case "B": {
                System.out.println("100 MINUTOS DE LIGAÇÃO");
            }
        }

    }

}
