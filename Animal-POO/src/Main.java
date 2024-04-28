public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Astolfo", 5, "Vira-lata");
        Gato gato = new Gato("Garfield", 3, "Gato Laranja");
        Rato rato = new Rato("Remy", 1, "Rato Cozinheiro");

        cachorro.exibirDados();
        gato.exibirDados();
        rato.exibirDados();
    }
}
