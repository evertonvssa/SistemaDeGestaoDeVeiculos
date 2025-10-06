public class Veiculo {
    // Atributos comuns a todos os veículos
    protected String placa;
    protected String marca;
    protected double preco;

    // Construtor da classe base
    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
    }

    public void mostrarDados(double percentualDesconto) {
        double desconto = 1 - (percentualDesconto / 100.0);
        double precoComDesconto = this.preco * desconto;

        System.out.println("Placa: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.printf("Preço original: R$ %.2f\n", this.preco);
        System.out.printf("Preço com %.1f%% de desconto: R$ %.2f\n", percentualDesconto, precoComDesconto);
    }
}