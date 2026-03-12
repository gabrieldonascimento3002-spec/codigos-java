public class InverterString {

    public static String inverter(String texto) {
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return invertida;
    }

    public static void main(String[] args) {
        String palavra = "Java";
        String resultado = inverter(palavra);

        System.out.println(resultado);
    }
}