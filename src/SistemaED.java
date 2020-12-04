import java.util.ArrayList;

public class SistemaED {

    public static void main(String[] args) {

        ArrayList<Cidade> cidades = new ArrayList<Cidade>();
        GrafoDeCidades grafo = new GrafoDeCidades();

        //Cidades instanciadas e adicionadas na lista de cidades
        cidades.add(new Cidade("Campinas"));    //0
        cidades.add(new Cidade("Indaiatuba"));  //1
        cidades.add(new Cidade("Salto"));       //2
        cidades.add(new Cidade("Itu"));         //3
        cidades.add(new Cidade("Jundiai"));     //4
        cidades.add(new Cidade("Vinhedo"));     //5

        //Rodovias instanciadas
        Rodovia rodovia01 = new Rodovia("Anhanguera");
        Rodovia rodovia02 = new Rodovia("Bandeirantes");
        Rodovia rodovia03 = new Rodovia("Raposo Tavares");
        Rodovia rodovia04 = new Rodovia("Castelo Branco");


        grafo.relacionarCidadeRodovia(cidades.get(0), rodovia01);
        grafo.relacionarCidadeRodovia(cidades.get(0), rodovia02);
        grafo.relacionarCidadeRodovia(cidades.get(1), rodovia01);
        grafo.relacionarCidadeRodovia(cidades.get(1), rodovia03);

        System.out.println("\nFunção/Método 1:");
        grafo.relacionarCidadeRodovia(cidades.get(2), rodovia04);
        grafo.relacionarCidadeRodovia(cidades.get(3), rodovia02);
        grafo.relacionarCidadeRodovia(cidades.get(4), rodovia03);
        grafo.relacionarCidadeRodovia(cidades.get(5), rodovia01);
        System.out.println("Cidades da rodovia " + rodovia04.toString() + ": " + rodovia04.getCidades());
        System.out.println("Cidades da rodovia " + rodovia02.toString() + ": " + rodovia02.getCidades());
        System.out.println("Cidades da rodovia " + rodovia03.toString() + ": " + rodovia03.getCidades());
        System.out.println("Cidades da rodovia " + rodovia01.toString() + ": " + rodovia01.getCidades());

        System.out.println("\nFunção/Método 2:");
        System.out.print("Cidade de " + cidades.get(0).toString());
        cidades.get(0).listaRodovias();
        System.out.print("Cidade de " + cidades.get(1).toString());
        cidades.get(1).listaRodovias();
        System.out.print("Cidade de " + cidades.get(2).toString());
        cidades.get(2).listaRodovias();
        System.out.print("Cidade de " + cidades.get(3).toString());
        cidades.get(3).listaRodovias();

        System.out.println("\nFunção/Método 3:");
        //Verificar se as rodovias se cruzam em uma determinada cidade
        System.out.println(rodovia01.toString() + " e " + rodovia02.toString() + " se cruzam na cidade de " + cidades.get(0).toString() + "? " + cidades.get(0).verificaCruzamento(rodovia01, rodovia02));
        System.out.println(rodovia01.toString() + " e " + rodovia03.toString() + " se cruzam na cidade de " + cidades.get(0).toString() + "? " + cidades.get(0).verificaCruzamento(rodovia01, rodovia03));
        System.out.println(rodovia01.toString() + " e " + rodovia03.toString() + " se cruzam na cidade de " + cidades.get(1).toString() + "? " + cidades.get(1).verificaCruzamento(rodovia01, rodovia03));



        grafo.relacionarCidade(cidades.get(0), cidades.get(1));
        grafo.relacionarCidade(cidades.get(1), cidades.get(2));
        grafo.relacionarCidade(cidades.get(2), cidades.get(3));
        grafo.relacionarCidade(cidades.get(3), cidades.get(4));
        grafo.relacionarCidade(cidades.get(4), cidades.get(5));
        grafo.relacionarCidade(cidades.get(5), cidades.get(0));
    }
}