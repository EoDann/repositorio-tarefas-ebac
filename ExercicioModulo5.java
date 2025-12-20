import java.util.Scanner;

public class ExercicioModulo5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = sc.nextLine();

        System.out.println("Seja muito bem vindo " + nome);

        System.out.println(nome + " para inicializarmos o seu cadastro vamos precisar de mais alguns dados");
        System.out.println("------------------------------------------");

        System.out.println("Me diga seu nome completo");
        String nome_completo = sc.nextLine();
        System.out.println("------------------------------------------");

        System.out.println("Me diga sua altura");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.println("------------------------------------------");

        System.out.println("Me diga seu peso [Kg]");
        double peso = sc.nextDouble();        
        sc.nextLine();
        System.out.println("------------------------------------------");

        System.out.println("Me diga seu estado civil");
        String estado_civil = sc.nextLine(); 
        System.out.println("------------------------------------------");

        System.out.println("Me diga seu cpf");
        String cpf = sc.nextLine();
        System.out.println("------------------------------------------");

        System.out.println("Cadastro Finalizado");
        System.out.println("Nome Completo: " + nome_completo);
        System.out.println("Altura: " + altura);
        System.out.println("Peso [Kg]: " + peso);
        System.out.println("Estato Civil: " + estado_civil);
        System.out.println("CPF: " + cpf);


    }
}