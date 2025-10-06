public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, double preco, int numPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de Portas: " + this.numPortas);
    }
    public void mostrarDados(boolean mostrarPortas){
        super.mostrarDados();
        if (mostrarPortas) {
            System.out.println("Número de portas: " + this.numPortas);
        }
    }
}
