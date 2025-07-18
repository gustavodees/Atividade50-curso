package model;

public class Funcionario {
    private Integer ID;
    private String nome;
    private Double salario;

    public Funcionario() {
        this(0, "", 0);
    }

    public Funcionario(int ID, String nome, double salario) {
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void aumentarSalario(double porcentagem) {
        salario = salario + (salario * porcentagem);

    }

    @Override
    public String toString() {
        return "Funcionario " +
                "ID: " + ID +
                ", nome: " + nome + '\'' +
                ", salario: " + salario;
    }
}
