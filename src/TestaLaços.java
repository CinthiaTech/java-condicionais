public class TestaLaços {
    public static void main(String[] args) {

        for (int multiplicacao = 1; multiplicacao <= 10; multiplicacao++) {
            for (int contador = 0; contador <= 10; contador++) {

                System.out.print(multiplicacao * contador);
                System.out.print("");
            }
            System.out.println();
        }
    }
}