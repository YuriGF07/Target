public class Questao4 {
    public static void main(String[] args) {
        // Definindo o faturamento mensal de cada estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
    
        // Calculando o faturamento total da distribuidora
        double total = sp + rj + mg + es + outros;
    
        // Calculando o percentual de representação de cada estado
        double pct_sp = (sp / total) * 100;
        double pct_rj = (rj / total) * 100;
        double pct_mg = (mg / total) * 100;
        double pct_es = (es / total) * 100;
        double pct_outros = (outros / total) * 100;
    
        // Exibindo os resultados
        System.out.printf("Percentual de faturamento por estado:\n");
        System.out.printf("SP: %.2f%%\n", pct_sp);
        System.out.printf("RJ: %.2f%%\n", pct_rj);
        System.out.printf("MG: %.2f%%\n", pct_mg);
        System.out.printf("ES: %.2f%%\n", pct_es);
        System.out.printf("Outros: %.2f%%\n", pct_outros);
    }
}
