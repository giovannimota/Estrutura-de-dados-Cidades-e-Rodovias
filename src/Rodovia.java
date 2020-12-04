import java.util.ArrayList;

public class Rodovia {
    private String nome;
    private ArrayList<Cidade> cidadesRod = new ArrayList<Cidade>();

    //Construtor
    public Rodovia(String nome) {
        this.nome = nome;
    }

    public void fazerRelacao (Cidade a) {
        if(!isCidade(a)) {
            cidadesRod.add(a);
        }
    }

    public boolean isCidade (Cidade a) {
        for (Cidade cidade : this.cidadesRod) {
            if (cidade == a) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cidade> getCidades(){
        return this.cidadesRod;
    }

    public String toString(){
        return this.nome;
    }
}