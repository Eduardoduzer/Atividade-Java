import java.util.Scanner;

public class Cashback {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double cashback;

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Digite o valoDaCompra: ");
        double valorDaCompra = leitor.nextDouble();

        if(idade >= 22 && valorDaCompra < 1000){
            cashback = 0.05;
        }else if (idade < 22 && valorDaCompra < 1000 || idade >= 21 && valorDaCompra > 1000) {
            cashback = 0.08;
        }else {
            cashback = 0.10;

        }

        double valorDoCashback = valorDaCompra * cashback;


        System.out.println("Olá" + nome + " o seu cashback é de " + valorDoCashback);

    }
}
