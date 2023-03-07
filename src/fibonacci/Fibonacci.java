package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(calcFibonacci(55));
        System.out.println(calcFibonacci(34));
        System.out.println(calcFibonacci(4));
        System.out.println(calcFibonacci(50));
        System.out.println(calcFibonacci(1));
    }

    public static String calcFibonacci(int number) {
        int aux = 0, indexZero = 0, indexOne = 1;
        if (number == indexZero || number == indexOne) {
            return "Pertence a sequencia Fibonacci";
        }
        while (aux < number) {
            aux = indexZero + indexOne;
            indexZero = indexOne;
            indexOne = aux;
        }
        if (aux == number) {
            return "Pertence a sequencia Fibonacci";
        } else {
            return "Não pertence a sequencia Fibonacci";
        }
    }
}