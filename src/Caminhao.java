public class Caminhao extends Veiculo {
    double capacidadeCarga;

    public Caminhao(String placa, String modelo, double preco, double capacidadeCarga) {
        super(placa, modelo, preco);
        this.capacidadeCarga = capacidadeCarga;
    }
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Capacidade da carga: " + this.capacidadeCarga);
    }
    public void mostrarDados(boolean toneladaOuQuilogramas){
        super.mostrarDados();
        if(toneladaOuQuilogramas){
            double cargaKg = this.capacidadeCarga * 1000;
            System.out.printf("A capacidade da carga em kg: %.0f kg\n", cargaKg);
        }else {
            System.out.println("A capacidade da carga em toneladas é: " + this.capacidadeCarga);
        }
    }
}
