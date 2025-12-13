import java.sql.SQLOutput;

public class UaiBiMotors {
    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro();
        c2 = new Carro ();

        c1.marca = " Porsche";
        c1.modelo = "Cayenne";
        c1.ano = 2024;
        c1.km = 0;
        c1.cor = "Branca";
        c1.preco = 2200000.0;

        c2.marca = "Chevrolet";
        c2.modelo = "Corsa";
        c2.ano = 1988;
        c2.km = 250000;
        c2.cor = "cinza";
        c2.preco = 8000;

        c1.exibirAnuncio();
        c1.simuladorSeguro(3);

        System.out.println("===========================");
        c2.exibirAnuncio();

        System.out.println("------CALCULANDO IPVA ---------");
        double ipvaC1 = c1.calcularIpva();
        double ipvaC2 = c2.calcularIpva();

        if (ipvaC1 == 0) {
            System.out.println("Veiculo Insento");
        }
        else {
            System.out.println("O valor do IPva: "+ ipvaC1);
        }

        if (ipvaC2 == 0) {
            System.out.println("Veiculo Insento DE IMPOSTO");
        }
        else {
            System.out.println("O valor do IPva: "+ ipvaC2);
        }
    }
}