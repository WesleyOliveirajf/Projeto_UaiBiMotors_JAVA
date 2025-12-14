public class UaiBiMotors {
    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro();
        c2 = new Carro();

        c1.setMarca(" Porsche");
        c1.setModelo("Cayenne");
        c1.setAno(2024);
        c1.setKm(0);
        c1.setCor("Branca");
        c1.setPreco(2200000.0);

        c2.setMarca("Chevrolet");
        c2.setModelo("Corsa");
        c2.setAno(1988);
        c2.setKm(250000);
        c2.setCor("cinza");
        c2.setPreco(8000);

        System.out.println("===========================");
        c2.exibirAnuncio();

        System.out.println("------CALCULANDO IPVA ---------");
        double ipvaC1 = c1.calcularIpva();
        double ipvaC2 = c2.calcularIpva();

        if (ipvaC1 == 0) {
            System.out.println("Veiculo Insento");
        } else {
            System.out.println("O valor do IPva: " + ipvaC1);
        }

        if (ipvaC2 == 0) {
            System.out.println("Veiculo Insento DE IMPOSTO");
        } else {
            System.out.println("O valor do IPva: " + ipvaC2);
        }

    }
}