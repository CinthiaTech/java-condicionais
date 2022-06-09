public class TestaCondicionais {
    public static void main(String[] args) {
        double salario = 3900.0;

        if (salario < 1800) {
            System.out.println("Você é isento.");
        }

        else if (salario >= 1800 && salario <= 2800) {
            System.out.println("Sua alíquota é de 7,5%");
            System.out.println("Você poderá ter restituição até 140,00 de restituição");

        } else if (salario > 2800 && salario <= 3751) {
            System.out.println("Sua alíquota é 15%, e você poderá ter até 350,00 de restituição "
            );
        } else  {
            System.out.println("Sua alíquota é de 27,5% e poderá ter até 636,00 de restituição");
        }
    }}
