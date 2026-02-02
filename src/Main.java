import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> alunos = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("\n 1 - listar \n 2 - adicionar \n 3 - remover \n 4 - atualizar \n 0 - Sair");
            System.out.println("digite uma opção: ");
            String opc = sc.nextLine();
            switch (opc) {
                case "1":
                    listar();
                    break;
                case "2":
                    adicionar();
                    break;
                case "3":
                    remover();
                    break;
                case "4":
                    atualizar();
                    break;
                case "0":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("digite uma opção válida");
                    break;
            }
        }

    }
    public static void listar(){
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + "-" + alunos.get(i));
        }
    }
    public static void adicionar(){
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        alunos.add(nome);
        System.out.println("adicionado");

    }
    public static void remover(){
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + "-" + alunos.get(i));
        }
        System.out.println("Digite o numero do aluno que deseja excluir: ");
        int delet = sc.nextInt();
        sc.nextLine();
        alunos.remove(delet);

    }

    public static void atualizar(){
        System.out.println("atualizar");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + "-" + alunos.get(i));
        }
        System.out.println("Digite o numero do aluno que deseja atualizar: ");
        int delet = sc.nextInt();
        sc.nextLine();
        System.out.println("atualize o nome: ");
        String nome = sc.nextLine();
        alunos.remove(delet);
        alunos.add(delet, nome);

    }
}