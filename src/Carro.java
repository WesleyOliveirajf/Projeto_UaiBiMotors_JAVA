import javax.sound.midi.Soundbank;

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

    // SIMULA SEGURO
    void simuladorSeguro(int perfil){
        if (perfil == 0) {
            System.out.println("Perfil: Idoso - 1.5%");
            System.out.println("R$" + preco*0.015);
        } else if (perfil == 1) {
            System.out.println("Perfil: Chefe de Familia - 2.5% ");
            System.out.println("R$" + preco * 0.025);
        } else if (perfil == 2) {
            System.out.println("Perfil: Jovem - 14.0% ");
            System.out.println("R$" + preco * 0.14);
        }
        else {
            System.out.println("Nao temos esse perfil");
        }
    }

    // CALCULA IPVA
    double calcularIpva() {
        double valorIPVA;
        if (ano <= 2022) {
            valorIPVA = 0;
        } else {
            valorIPVA = preco * 0.035;
        }
        return valorIPVA;
    }

}
