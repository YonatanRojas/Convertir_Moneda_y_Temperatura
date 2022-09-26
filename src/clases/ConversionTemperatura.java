package clases;

import interfaces.InterfaceConvertir;

/**
 *
 * @author Luis Alfredo Romero
 */
public class ConversionTemperatura implements InterfaceConvertir {

    private double respuesta = 0;

    @Override
    public double conversion(String de, String para, double cantidad) {

        double temperaturafinal = 0;

        if (de.equals("Celcius") && para.equals("Kelvin")) {
            temperaturafinal = deCelciusaKelvin(cantidad);
        }
        if (de.equals("Celcius") && para.equals("Fahrenheit")) {
            temperaturafinal = deCelciusaFahrenheit(cantidad);

        }

        if (de.equals("Kelvin") && para.equals("Fahrenheit")) {
            temperaturafinal = deKelvinaFahrenheit(cantidad);

        }
        if (de.equals("Kelvin") && para.equals("Celcius")) {
            temperaturafinal = deKelvinaCelcius(cantidad);
        }
        if (de.equals("Fahrenheit") && para.equals("Kelvin")) {
            temperaturafinal = deFahrenheitaKelvin(cantidad);
        }
        if (de.equals("Fahrenheit") && para.equals("Celcius")) {
            temperaturafinal = deFahrenheitaCelcius(cantidad);
        }
        if(de.equals(para)){
             temperaturafinal=cantidad;
        }

        temperaturafinal = Math.round(temperaturafinal * 100.0) / 100.0;

        return temperaturafinal;
    }

    private double deCelciusaFahrenheit(double cantidad) {
        respuesta = ((cantidad * 9) / 5) + 32;
        return respuesta;
    }

    private double deCelciusaKelvin(double cantidad) {
        respuesta = cantidad + 273.15;
        return respuesta;
    }
    //de fareheiht a kelvin k=(f+459.67)*5/9

    private double deFahrenheitaKelvin(double cantidad) {
        respuesta = ((cantidad + 459.67) * 5) / 9;
        return respuesta;

    }

    private double deFahrenheitaCelcius(double cantidad) {
        respuesta = (cantidad - 32) * 0.5556;
        return respuesta;
    }

    private double deKelvinaFahrenheit(double cantidad) {
        respuesta = (1.8 * cantidad) - 459.67;
        return respuesta;

    }

    private double deKelvinaCelcius(double cantidad) {
        respuesta = cantidad - 273.15;
        return respuesta;
    }

}
