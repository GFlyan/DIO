import java.util.Scanner;

public class Contador {

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExcpetion{
        if (parametroUm >= parametroDois) throw new ParametrosInvalidosExcpetion();
        else {
            int limite = parametroDois - parametroUm;
            System.out.println("-------------------------");
            for (int contador = 1 ; contador <= limite ; contador++)
                System.out.println("Imprimindo o número " + contador + ".");
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("Informe o primeiro parametro:");
        int primeiroValor = Integer.parseInt(scan.nextLine());
        System.out.println("-----------------------------");
        System.out.println("Informe o segundo parametro:");
        int segundoValor = Integer.parseInt(scan.nextLine());
        System.out.println("-----------------------------");

        try {
            contar(primeiroValor, segundoValor);
        }
        catch (ParametrosInvalidosExcpetion exception) {
            System.out.println(exception.getException());
        }
    }
}