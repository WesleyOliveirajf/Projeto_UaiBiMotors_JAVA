import javax.sound.midi.Soundbank;

public class Carro {
    Carro c1, c2;

    // Caracteristicas
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int km;
    private double preco;


    public Carro getC1() {
        return c1;
    }

    public void setC1(Carro c1) {
        this.c1 = c1;
    }

    public Carro getC2() {
        return c2;
    }

    public void setC2(Carro c2) {
        this.c2 = c2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    // Criar um "BOTAO" para que eu possa execultar algo (Mostrar os dados)

    public void exibirAnuncio(){
        System.out.println("Anuncio do Carro");
        System.out.println(marca+"-"+modelo+" ("+ano+")" );
        System.out.println("cor: "+cor+ " KM: "+ km+" R$ "+preco);
    }

    // SIMULA SEGURO
    public void simuladorSeguro(int perfil){
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
    public double calcularIpva() {
        double valorIPVA;
        if (ano <= 2022) {
            valorIPVA = 0;
        } else {
            valorIPVA = preco * 0.035;
        }
        return valorIPVA;
    }

}
