public class AnaliseEstoque implements Assinante {
    public String nomeSistema;

    public AnaliseEstoque(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    @Override
    public void receberAtualizacao(String produto, int quantidade) {
        System.out.println("[" + nomeSistema + "] Atualização de estoque - Produto: " + produto + ", Quantidade: " + quantidade);
    }
}
