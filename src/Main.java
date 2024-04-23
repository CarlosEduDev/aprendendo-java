import java.util.ArrayList;

public class Main{

    public String name;

    static String nomePet = "Gnar";

    protected int Salary;

    public static void main(String[] args){
        Ser meuAnimal = new Cachorro("Nora", 5, "Carlos");
        Ser meuHumano = new Pessoa("Carlos", 19, "Eduardo");
        meuAnimal.setNome("Nora");
        meuHumano.setNome("Carlos");
        System.out.println(meuHumano.saudacao());
        System.out.println(meuAnimal.saudacao());
        System.out.println(nomePet);
    }

    private void atualizaSalario(){
        this.Salary = 4000;
    }

    public int getSalary(){
        this.atualizaSalario();
        return this.Salary;
    }

}