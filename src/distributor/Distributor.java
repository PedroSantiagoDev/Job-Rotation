package distributor;

public class Distributor {
    public static void main(String[] args) {
        double[] valueBilling = new double[]{22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
        System.out.println(billing(valueBilling));
    }

    public static String billing(double[] valueBilling) {
        double media = media(valueBilling);
        int days = 0;
        for (double num: valueBilling) {
            if (num > media) {
                ++days;
            }
        }
        return smallerLarger(valueBilling) + " Número de dias que o valor diario foi maior que o mensal: " + days;

    }

    public static String smallerLarger(double[] value) {
        double smaller = 0;
        double larger = 0;
        for (double num : value) {
            if (num < smaller) {
                smaller = num;
            }
            if (num > larger) {
                larger = num;
            }
        }
        return "O menor valor do faturamento: " + smaller + " e Maior valor do faturamento: " + larger;
    }

    public static double media(double[] value) {
        double sum = 0;
        double media = 0;
        for (double num : value) {
            sum += num;
        }
        return media = sum / value.length;
    }
}
