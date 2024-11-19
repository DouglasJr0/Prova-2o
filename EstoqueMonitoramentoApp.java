public class EstoqueMonitoramentoApp {
    public static void main(String[] args) {
        ItemEstoque item1 = new ItemEstoque("Produto X", 150);

        Assinante sistemaAnalise = new AnaliseEstoque("Sistema de Análise Central");
        Assinante equipeMonitoramento = new EquipeMonitoramento("Equipe de Monitoramento A");

        item1.adicionarAssinante(sistemaAnalise);
        item1.adicionarAssinante(equipeMonitoramento);

        // Atualizando a quantidade do item
        item1.atualizarQuantidade(130);

        // Adicionando nova equipe
        Assinante equipeMonitoramentoB = new EquipeMonitoramento("Equipe de Monitoramento B");
        item1.adicionarAssinante(equipeMonitoramentoB);

        // Atualizando a quantidade do item novamente
        item1.atualizarQuantidade(90);
    }
}
