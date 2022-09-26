package clases;

import interfaces.InterfaceConvertir;
import interfaces.InterfaceValoresMonedas;
import static interfaces.InterfaceValoresMonedas.DOLAR;
import static interfaces.InterfaceValoresMonedas.EURO;
import static interfaces.InterfaceValoresMonedas.LIBRAESTERLINA;
import static interfaces.InterfaceValoresMonedas.PESO;
import java.text.DecimalFormat;

/**
 *
 * @author Luis Alfredo Romero
 */
public class Conversion implements InterfaceConvertir {

    @Override
    public double conversion(String de, String para, double cantidad) {
        double resultado = 0;
        double valor1 = valorMoneda(de);
        double valor2 = valorMoneda(para);

        try {
            if (cantidad > 0 && !de.equals("Peso")) {

                resultado = resultadoConversion(valor1, valor2, cantidad);
                resultado = Math.round(resultado * 100.0) / 100.0;

            } else if ((cantidad > 10 || cantidad == 10) && de.equals("Peso")) {

                resultado = resultadoConversion(valor1, valor2, cantidad);
                resultado = Math.round(resultado * 1000.0) / 1000.0;

            } else if (cantidad < 10 && de.equals("Peso")) {

                resultado = resultadoConversion(valor1, valor2, cantidad);
                DecimalFormat df = new DecimalFormat("#0.####");
                String aux=df.format(resultado);
                String aux2=aux.replace(',', '.');
                resultado=Double.parseDouble(aux2);
            }
        } catch (Exception e) {
            System.out.println("error, no esta permitida"+e.getMessage());
        }

        return resultado;
    }

    private double resultadoConversion(double valor1, double valor2, double cantidad) {
        double resultadoConversion = 0;
        resultadoConversion = (valor1 * cantidad) / valor2;
        return resultadoConversion;

    }

    private double valorMoneda(String moneda) {
        double monedas = 0;
        if (moneda.equals("Dolar")) {
            monedas = DOLAR;
        } else if (moneda.equals("Euro")) {
            monedas = EURO;
        } else if (moneda.equals("Libra Esterlina")) {
            monedas = LIBRAESTERLINA;
        } else if (moneda.equals("Peso")) {
            monedas = PESO;
        }
        return monedas;
    }

}
