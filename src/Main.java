import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    ArrayList<Veiculo> veiculos=new ArrayList<>();
    String continuar;

    do {
        System.out.println("CADASTRO DE VEÍCULOS");
        System.out.println("Qual o tipo de veículo deseja cadastrar? (1 - Carro, 2 - Moto, 3 - Caminhão): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.println("Informe a marca do veículo: ");
        String marca = scanner.nextLine();
        System.out.println("Informe o valor do veículo: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Informe o número de portas: ");
                int numPortas = scanner.nextInt();
                scanner.nextLine();
                Carro carro = new Carro(placa, marca, preco, numPortas);
                veiculos.add(carro);
                break;
            case 2:
                System.out.println("Informe as cinlindradas: ");
                int cilindradas = scanner.nextInt();
                scanner.nextLine();
                Moto moto = new Moto(placa, marca, preco, cilindradas);
                veiculos.add(moto);
                break;
            case 3:
                System.out.println("Informe a capacidade da carga: ");
                double capacidade = scanner.nextDouble();
                scanner.nextLine();
                Caminhao caminhao = new Caminhao(placa, marca, preco, capacidade);
                veiculos.add(caminhao);
                break;
            default:
                System.out.println("Opção Inválida! ");
                break;
        }

        System.out.print("\nDeseja cadastrar outro veículo? S/N): ");
        continuar = scanner.nextLine();

    }while(continuar.equalsIgnoreCase("S"));

    System.out.println("\n VEÍCULOS CADASTRADOS");
    if(veiculos.isEmpty()){
        System.out.println("Nenhum veículo foi cadastrado. ");
    }else{
        for(Veiculo v : veiculos){
            v.mostrarDados();
            System.out.println("=========================");
        }
    }
    scanner.close();
    }
}