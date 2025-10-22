import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fila filaAtendimento = new Fila();
        Pilha historicoSolicitacoes = new Pilha();

        int opcao = 0;

        // do while só pra n ter q colocar o menu em uma função e chamar dentro e fora
        // do while normal
        do {
            System.out.println("\n=== Sistema de Atendimento ===");
            System.out.println("1. Adicionar cliente à fila");
            System.out.println("2. Atender próximo cliente");
            System.out.println("3. Mostrar fila atual");
            System.out.println("4. Mostrar histórico de atendimentos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do cliente (Cxxx): ");
                    String id = scanner.nextLine();

                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o motivo do atendimento: ");
                    String motivo = scanner.nextLine();

                    filaAtendimento.adicionar(new Elemento(id, nome, motivo));
                    System.out.println("Cliente adicionado à fila!");
                    break;

                case 2:
                    if (!filaAtendimento.estaVazia()) {
                        Elemento cliente = filaAtendimento.atenderProximo();
                        String idSolicitacao = "R" + cliente.id.substring(1);
                        System.out.print("Digite a descrição do atendimento: ");
                        String descricao = scanner.nextLine();
                        String dataHora = "22/10/2025 " + java.time.LocalTime.now().toString().substring(0, 5);

                        historicoSolicitacoes.push(new Elemento(idSolicitacao, descricao, dataHora));
                        System.out.println("Cliente atendido e registrado no histórico!");
                    } else {
                        System.out.println("Não há clientes na fila!");
                    }
                    break;

                case 3:
                    System.out.println("\n=== Fila de Atendimento ===");
                    filaAtendimento.mostrarFila();
                    break;

                case 4:
                    System.out.println("\n=== Histórico de Atendimentos ===");
                    historicoSolicitacoes.mostrarHistorico();
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        scanner.close();
    }
}