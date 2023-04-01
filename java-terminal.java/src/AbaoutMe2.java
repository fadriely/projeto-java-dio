import java.util.Locale;
import java.util.Scanner;


public class AbaoutMe2 {
    public static void main(String[] args) {
        //criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Diga seu nome ");
        String nome = scanner.next();               //next retorna uma string

        System.out.println("digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Diga sua altura");
        double altura = scanner.nextDouble();
        
        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");


    }
}

