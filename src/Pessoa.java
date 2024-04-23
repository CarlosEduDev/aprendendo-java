public class Pessoa extends Ser{
    String sobreNome;
    public Pessoa(String nome, int idade, String sobreNome){
        super(nome, idade);
        this.sobreNome = sobreNome;
    }
    void CriaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.Salary);

        this.idade = 19;
    }

    @Override
    public String saudacao(){
        return "Olá, meu nome é " + this.nome;
    }
}
