public class UaiBiMotors {
    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro();
        c2 = new Carro ();

        c1.marca = " Porsche";
        c1.modelo = "Cayenne";
        c1.ano = 2022;
        c1.km = 0;
        c1.cor = "Branca";
        c1.preco = 22000;

        c2.marca = "Chevrolet";
        c2.modelo = "Corsa";
        c2.ano = 1988;
        c2.km = 250000;
        c2.cor = "cinza";
        c2.preco = 8000;

        c1.exibirAnuncio();
        c2.exibirAnuncio();


    }
}