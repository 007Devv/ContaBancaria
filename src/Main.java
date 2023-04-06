import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome?");
        String userName = leitor.nextLine();

        double saldoConta = 1000;
        String tipoConta = "Corrente";


        System.out.println("*********************");
        System.out.println("Dados do usuário");
        System.out.println("Nome: " + userName);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoConta);
        System.out.println("*********************");

        System.out.println("Selecione a operação desejada");
        String menu = """                
                1 - Retirar valor
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                """;
        System.out.println(menu);
        int operacaoDesejada = leitor.nextInt();
        switch (operacaoDesejada) {
            case 4:
                System.out.println("O saldo atual da sua conta é :" + saldoConta);
                System.out.println("Até mais " + userName);
                break;
            case 1:
                System.out.println("Qual valor deseja retirar?");
                int valorRetirado = leitor.nextInt();
                saldoConta -= valorRetirado;
                System.out.println("O saldo atual da sua conta é :" + saldoConta);
                break;
            case 2:
                System.out.println("Qual valor deseja depositar?");
                int valorDepositado = leitor.nextInt();
                saldoConta += valorDepositado;
                System.out.println("O saldo atual da sua conta é :" + saldoConta);
                break;
            case 3:
                System.out.println("Qual valor deseja transferir?");
                int valorTransferido = leitor.nextInt();
                if (valorTransferido > saldoConta) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldoConta -= valorTransferido;
                    System.out.println("O saldo atual da sua conta é :" + saldoConta);
                }
                    break;
                    default:
                        System.out.println("Opção inválida");

                }
        }
    }
