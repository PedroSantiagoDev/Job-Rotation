package string;

public class RevertsString {
    public static void main(String[] args) {
        System.out.println(reverts("Pedro"));
    }

    public static StringBuilder reverts(String value) {
        StringBuilder aux = new StringBuilder();
        for (int i = (value.length() - 1); i >= 0; i--) {
            aux.append(value.charAt(i));
        }
        return aux;
    }
}
