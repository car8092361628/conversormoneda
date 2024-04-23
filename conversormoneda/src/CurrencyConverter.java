import java.util.Scanner;
public class CurrencyConverter {
    // Tasas de conversión fijas (pueden cambiarse según las necesidades)
    private static final double USD_TO_EUR = 0.85; // Dólares a Euros
    private static final double EUR_TO_USD = 1.18; // Euros a Dólares
    private static final double USD_TO_GBP = 0.74; // Dólares a Libras Esterlinas
    private static final double GBP_TO_USD = 1.36; // Libras Esterlinas a Dólares

    // Función para convertir de una moneda a otra
    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double result = 0.0;

        switch (fromCurrency + " to " + toCurrency) {
            case "USD to EUR":
                result = amount * USD_TO_EUR;
                break;
            case "EUR to USD":
                result = amount * EUR_TO_USD;
                break;
            case "USD to GBP":
                result = amount * USD_TO_GBP;
                break;
            case "GBP to USD":
                result = amount * GBP_TO_USD;
                break;
            default:
                System.out.println("Conversión no soportada");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de moneda.");
        System.out.println("Ingrese el valor que desea convertir:");
        double amount = scanner.nextDouble();

        System.out.println("Seleccione la moneda de origen (USD/EUR/GBP):");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.println("Seleccione la moneda de destino (USD/EUR/GBP):");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        System.out.printf("%.2f %s es equivalente a %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);

        scanner.close();
    }
}

