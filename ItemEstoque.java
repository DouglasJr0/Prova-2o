import java.util.ArrayList;
import java.util.List;

public class ItemEstoque {
    public String nome;
    public int quantidade;
    public List<Assinante> assinantes;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.assinantes = new ArrayList<>();
    }

    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    public void atualizarQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
        notificarAssinantes();
    }

    public void notificarAssinantes() {
        for (Assinante assinante : assinantes) {
            assinante.receberAtualizacao(nome, quantidade);
        }
    }
}
