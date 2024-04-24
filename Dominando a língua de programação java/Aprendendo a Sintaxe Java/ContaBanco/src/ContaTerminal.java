
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Seja bem vindo ao nosso banco!\nPor favor preencha os campos seguintes:");
        System.out.println("Seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Numero da tua conta");
        int numeroConta = scanner.nextInt();
        System.out.println("Sua agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.close();


        System.out.println("Olá " + nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", \nconta "+numeroConta+" e seu saldo" +saldo+ " já está disponível para saque");
        
    }
}
