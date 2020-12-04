import java.util.ArrayDeque;
import java.util.ArrayList;

public class GrafoDeCidades {

    public void relacionarCidade(Cidade a, Cidade b) {
        a.fazerRelacao(b);
        b.fazerRelacao(a);
    }

    public void relacionarCidadeRodovia(Cidade c, Rodovia r){
        r.fazerRelacao(c);
        c.adicionaRodovia(r);
    }
}