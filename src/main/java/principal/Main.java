package principal;

import model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantos Funcionarios você deseja registrar ?? ");
        int qtdFuncionarios = sc.nextInt();
        for (int i = 0; i < qtdFuncionarios; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            Funcionario emp = new Funcionario(id, nome, salario);

            list.add(emp);
        }


        System.out.println("Digite o ID do usuario que você deseja aumentar o salario: ");
        int idSalario = sc.nextInt();
        Integer pos = acharID(list, idSalario);
        if (pos == null) {
            System.out.print("Usuario não encontrado!! ");
        } else {
            System.out.print("Digite a porcentagem que você deseja aumentar do salario: ");
            double porcentagem = sc.nextDouble();
            list.get(pos).aumentarSalario(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de Funcionarios");
        for (Funcionario funcionario : list) {
            System.out.println(funcionario);
        }


    }


    public static Integer acharID(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == id) {
                return i;
            }
        }
        return null;
    }

}