import interfaces.Animal;
import interfaces.Locomocao;

public class Rato implements Animal, Locomocao {
    private String nome;
    private int idade;
    private String raca;

    public Rato(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Squeak squeak squeak");
    }

    @Override
    public void comer() {
        System.out.println("Rato comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Rato dormindo");
    }

    @Override
    public void moverParaFrente() {
        System.out.println("Rato se movendo para frente");
    }

    @Override
    public void moverParaTras() {
        System.out.println("Rato se movendo para trás");
    }

    public void roer() {
        System.out.println("Rato roendo");
    }

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Raça: " + getRaca());
        
        emitirSom();
        comer();
        dormir();
        moverParaFrente();
        moverParaTras();
        roer();

        System.out.println();
    }

}
