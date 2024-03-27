import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gerente:");

        System.out.print("Insira o nome: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioGerente = scanner.nextDouble();
        System.out.print("Departamento: ");
        scanner.nextLine();
        String departamentoGerente = scanner.nextLine();

        Gerente gerente = new Gerente(nomeGerente, salarioGerente, departamentoGerente);

        System.out.printf("Bonus do Gerente: %.2f\n", gerente.calcularBonus());

        System.out.println("\nDiretor:");
        System.out.print("Insira o nome: ");
        scanner.nextLine();
        String nomeDiretor = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioDiretor = scanner.nextDouble();
        System.out.print("Número de ações: ");
        int acoesDiretor = scanner.nextInt();

        Diretor diretor = new Diretor(nomeDiretor, salarioDiretor, acoesDiretor);

        System.out.printf("Funcionário: %s\nSalário: %.2f\n", diretor.getNome(), diretor.getSalario());
    }
}