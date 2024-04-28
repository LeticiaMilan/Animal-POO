import interfaces.Animal;
import interfaces.Locomocao;

public class Gato implements Animal, Locomocao {
    private String nome;
    private int idade;
    private String raca;

    public Gato(String nome, int idade, String raca) {
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
        System.out.println("Miau miau miau");
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Gato dormindo");
    }

    @Override
    public void moverParaFrente() {
        System.out.println("Gato se movendo para frente");
    }

    @Override
    public void moverParaTras() {
        System.out.println("Gato se movendo para trás");
    }

    public void subirEmArvore() {
        System.out.println("Gato subindo em árvore");
    }

    public void brincar() {
        System.out.println("Gato brincando");
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
        subirEmArvore();
        brincar();

        System.out.println();
    }
}
