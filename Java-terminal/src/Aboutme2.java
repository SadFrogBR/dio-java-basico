import java.util.Locale;
import java.util.Scanner;

public class Aboutme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome =  scanner.next();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura em cm: ");
        double altura = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();
        
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
