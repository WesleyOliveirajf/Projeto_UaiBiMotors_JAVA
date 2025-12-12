public class Carro {
    Carro c1, c2;

    // Caracteristicas
    String marca;
    String modelo;
    int ano;
    String cor;
    int km;
    double preco;

    // Criar um "BOTAO" para que eu possa execultar algo (Mostrar os dados)

    void exibirAnuncio(){
        System.out.println("Anuncio do Carro");
        System.out.println(marca+"-"+modelo+" ("+ano+")" );
        System.out.println("cor: "+cor+ " KM: "+ km+" R$ "+preco);
    }


}
