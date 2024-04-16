import java.util.Scanner;

public class Desafio {
        public static void main(String[] args) {
            String nome = "Andie Reis";
            String conta = "corrente";
            double saldoInicial = 2500.00;
            double saldoAtualizado = saldoInicial;
            int opcaoEscolhida = 0;
            Scanner leitura = new Scanner(System.in);

            String dadosIniciais = """
                ***********************************************************
                Dados Iniciais do Cliente:
               \s
                Nome: %S
                Tipo de conta: %S
                Saldo Inicial: R$ %.2f         \s
                ***********************************************************\s
              """.formatted(nome, conta, saldoInicial);

            String mensagem = """
                     \s
                         Operações
                                        \s
                         1- Consultar saldos;
                         2- Receber valor;
                         3- Transferir valor;
                         4- Sair.
                                        \s
                         Digite a opção desejada:
                                       \s
                    \s""";

            System.out.println(dadosIniciais);

            while (opcaoEscolhida != 4) {
                System.out.println(mensagem);
                opcaoEscolhida = leitura.nextInt();

                switch (opcaoEscolhida) {
                    case 1:
                        System.out.println("Saldo atualizado: R$ %.2f. ".formatted(saldoAtualizado));
                        break;
                    case 2:
                        System.out.println("Informe o valor do depósito: ");
                        double valorDeposito = leitura.nextDouble();
                        saldoAtualizado += valorDeposito;
                        System.out.println("Saldo atualizado: R$ %.2f. ".formatted(saldoAtualizado));
                        break;
                    case 3:
                        System.out.println("Informe o valor da transferência: ");
                        double valorDaTransferencia = leitura.nextDouble();

                        if (valorDaTransferencia <= saldoAtualizado) {
                            saldoAtualizado -= valorDaTransferencia;
                            System.out.println("Saldo atualizado: R$ %.2f. ".formatted(saldoAtualizado));
                        } else {
                            System.out.println("Saldo insuficiente para efetuar a transação.");
                            System.out.println("Saldo disponível : R$%.2f".formatted(saldoAtualizado));
                        }

                        break;
                    case 4:
                        System.out.println("Operação finalizada. Tenha um ótimo dia!");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;

                }

            }

        }
    }

