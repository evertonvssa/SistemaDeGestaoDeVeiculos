public class Moto extends Veiculo {
    private int cilindradas;

    // Construtor da Moto
    public Moto(String placa, String marca, double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + this.cilindradas + " cc");
    }

    public void mostrarDados(boolean converterCv) {
        super.mostrarDados();
        if (converterCv) {
            double cavalos = this.cilindradas / 16.0; // Fórmula aproximada
            System.out.printf("Potência: %.1f CV (aproximadamente)\n", cavalos);
        } else {
            System.out.println("Cilindradas: " + this.cilindradas + " cc");
        }
    }
}

