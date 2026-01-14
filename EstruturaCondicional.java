import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° numero");
        int Numero1 = sc.nextInt();

        System.out.println("Digite o 2° numero");
        int Numero2 = sc.nextInt();

        if (Numero1 > Numero2) {
            System.out.println("O 1° Numero: " + Numero1 + " é maior que o 2° Numero: " + Numero2);
        } else if (Numero2 > Numero1) {
            System.out.println("O 2° Numero: " + Numero2 + "é maior que o 1° Numero " + Numero1);
        } else {
            System.out.println("Anbos 1° e 2° Numeros tem o mesmo valor: " + Numero1);
        }
        
    }
}