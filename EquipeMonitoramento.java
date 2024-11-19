public class EquipeMonitoramento implements Assinante {
    public String nomeEquipe;

    public EquipeMonitoramento(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    @Override
    public void receberAtualizacao(String produto, int quantidade) {
        System.out.println("Equipe " + nomeEquipe + " foi notificada: Produto " + produto + " atualizado para quantidade " + quantidade);
    }
}
