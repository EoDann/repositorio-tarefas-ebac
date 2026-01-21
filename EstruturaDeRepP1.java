import java.util.Scanner;

public class EstruturaDeRepP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o seu nome:");
        String Nome = sc.nextLine();

        System.out.println("Qual sua idade?:");
        int Idade = sc.nextInt();

        System.out.println("---------------------------");
        
        for (int x = 0; x <= Idade; x++) {
            System.out.println(x);
        }
        System.out.println("---------------------------");

        for (int y = Idade; y >= 0; y--) {
            System.out.println(y);
        }

        System.out.println("---------------------------");

        int NumeroDeLetras = Nome.length();

        if (NumeroDeLetras >= 6) {
            for (int x = 0; x < NumeroDeLetras; x++) {
                System.out.println(Nome);
            }
        } else {
            System.out.println(Nome);
        }
    }
    
}