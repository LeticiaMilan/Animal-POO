import interfaces.Animal;
import interfaces.Locomocao;

public class Cachorro implements Animal, Locomocao {
    private String nome;
    private int idade;
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
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
        System.out.println("Au au au");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dormindo");
    }

    @Override
    public void moverParaFrente() {
        System.out.println("Cachorro se movendo para frente");
    }

    @Override
    public void moverParaTras() {
        System.out.println("Cachorro se movendo para trás");
    }

    public void cavarBuraco() {
        System.out.println("Cachorro cavando buraco");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Raça: " + getRaca());

        emitirSom();
        comer();
        dormir();
        moverParaFrente();
        moverParaTras();
        cavarBuraco();
        abanarRabo();

        System.out.println();
    }
}
