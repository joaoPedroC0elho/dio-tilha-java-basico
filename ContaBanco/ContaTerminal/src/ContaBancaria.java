import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String nome = args [0];
        String sobrenome = args [1];
        String agencia = args [2];
        Double saldo = Double.valueOf(args[3]);
        


        System.out.println("Bem vindo");

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();



        System.out.println("Olá " + nome + "" + sobrenome + ",");
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é, " + agencia +" , conta " + numero + ",");
        System.out.println("Seu saldo de " + saldo + " já está disponível");



    }
}
