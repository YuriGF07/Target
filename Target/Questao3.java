import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;


public class Questao3 {

    public static void main(String[] args) {
        String filePath = "faturamento.json"; // caminho do arquivo
        List<Float> faturamentoDiario = lerFaturamento(filePath);
        float menorValor = calcularMenorValor(faturamentoDiario);
        float maiorValor = calcularMaiorValor(faturamentoDiario);
        float mediaMensal = calcularMediaMensal(faturamentoDiario);
        int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoDiario, mediaMensal);
        
        System.out.println("Menor valor: R$ " + menorValor);
        System.out.println("Maior valor: R$ " + maiorValor);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }

    public static float[] lerFaturamento() {
        JSONParser parser = new JSONParser();
        float[] faturamento = null;
        try {
            Object obj = parser.parse(new FileReader("faturamento.json"));
            JSONArray jsonFaturamento = (JSONArray) obj;
            faturamento = new float[jsonFaturamento.size()];
            for (int i = 0; i < jsonFaturamento.size(); i++) {
                faturamento[i] = ((Number) jsonFaturamento.get(i)).floatValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return faturamento;
    }
    

    private static float calcularMenorValor(List<Float> faturamento) {
        float menorValor = Float.MAX_VALUE;
        for (float valor : faturamento) {
            if (valor < menorValor) {
                menorValor = valor;
            }
        }
        return menorValor;
    }

    private static float calcularMaiorValor(List<Float> faturamento) {
        float maiorValor = Float.MIN_VALUE;
        for (float valor : faturamento) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }
        return maiorValor;
    }

    private static float calcularMediaMensal(List<Float> faturamento) {
        float total = 0;
        int diasUteis = 0;
        for (float valor : faturamento) {
            if (valor > 0) { // considera apenas os dias úteis com faturamento
                total += valor;
                diasUteis++;
            }
        }
        return total / diasUteis;
    }

    private static int contarDiasAcimaDaMedia(List<Float> faturamento, float mediaMensal) {
        int diasAcimaDaMedia = 0;
        for (float valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        return diasAcimaDaMedia;
    }

}
