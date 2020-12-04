import java.util.ArrayList;

public class Cidade {

    private String nome;
    private ArrayList<Cidade> cidades = new ArrayList<>();
    private ArrayList<Rodovia> rodovias = new ArrayList<>();

    //Construtor
    public Cidade(String nome) {
        this.nome = nome;
    }

    public void fazerRelacao (Cidade a) {
        if(!isCidade(a)) {
            cidades.add(a);
        }
    }

    public boolean isCidade (Cidade a) {
        for (Cidade cidade : this.cidades) {
            if (cidade == a) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return this.nome;
    }

    public void listaRodovias () {
        for (Rodovia rodovia : this.rodovias) {
            System.out.print(" - " + rodovia.toString());
        }
        System.out.println("");
    }

    public void adicionaRodovia(Rodovia r) {
        rodovias.add(r);
    }

    public String verificaCruzamento(Rodovia a, Rodovia b){
        if (rodovias.contains(a) && rodovias.contains(b)){
            return "Cruzam";
        }
        return "Não cruzam";
    }

}