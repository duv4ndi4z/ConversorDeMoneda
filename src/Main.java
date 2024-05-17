import com.alurachallenge.conversordemoneda.models.Converter;
import com.alurachallenge.conversordemoneda.models.SetCurrency;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numberToConvert;
        String currA="";
        String currB="";


        String menu = """
                *****************************************************************
                Bienvenido al Conversor de moneda!        $$$$                  *
                *****************************************************************
                
                1) Dólar ==> Peso Colombiano
                2) Peso Colombiano ==> Dólar
                3) Dólar ==> Peso Argentino
                4) Peso Argentino ==> Dólar
                5) Dólar ==> Real brasileño
                6) Real brasileño ==> Dólar
                7) Peso Chileno ==> Dólar
                8) Dólar ==> Peso Chileno
                9) Conversion manual (Agregas los códigos de las monedas disponibles de forma manual)
                10) Historial de conversiones (Muestra las ultimas conversiones realizadas)
                0) Salir
                
                Elige la opción que desees de las opciones disponibles:
                """;
        String ingresa = "Ingrese el valor a convertir: ";
        String question = """
                Que Deseas hacer a continuación:
                 1) Ingresar un nuevo valor en la conversion actual
                 2) Volver al menu principal
                 """;

        while (true) {
            System.out.println(menu);
            int numberUser = input.nextInt();
            //System.out.println(ingresa);1


            while (true) {
                switch (numberUser) {
                    case 1:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter usdtocop = new Converter("USD","COP"
                                ,numberToConvert);
                        usdtocop.Convert();
                        input.close();
                        break;
                    case 2:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter coptousd = new Converter("COP","USD"
                                ,numberToConvert);
                        coptousd.Convert();
                        input.close();
                        break;
                    case 3:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter usdtoars = new Converter("USD","ARS"
                                ,numberToConvert);
                        usdtoars.Convert();
                        input.close();
                        break;
                    case 4:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter arstousd = new Converter("ARG","USD"
                                ,numberToConvert);
                        arstousd.Convert();
                        input.close();
                        break;
                    case 5:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter brltousd = new Converter("BRL","USD"
                                ,numberToConvert);
                        brltousd.Convert();
                        input.close();
                        break;
                    case 6:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter usdtobrl = new Converter("USD","BRL"
                                ,numberToConvert);
                        usdtobrl.Convert();
                        break;
                    case 7:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter clptousd = new Converter("CLP","USD"
                                ,numberToConvert);
                        clptousd.Convert();
                        break;
                    case 8:
                        System.out.println(ingresa);
                        numberToConvert = input.nextDouble();
                        Converter usdtoclp = new Converter("USD","CLP"
                                ,numberToConvert);
                        usdtoclp.Convert();
                        break;
                    case 9:
                        System.out.println("Ingresa el código de la divisa base: (eje. 'USD')");
                        currA = input.next().toUpperCase();

                        System.out.println("Ingresa el código de la divisa a convertir: (eje. 'COP'");
                        currB = input.next().toUpperCase();

                        System.out.println("Ingresa el monto a conver9tir: ");
                        Double numbertoconvert = input.nextDouble();

                        if (currA.matches("[A-Z]{3}") && currB.matches("[A-Z]{3}")) {
                            Converter converter = new Converter(currA, currB
                                    , numbertoconvert);
                            converter.Convert();
                            break;
                        } else {
                            System.out.println("Al parecer ingresaste valores incorrectos");
                            break;
                        }
                    case 10:
                        System.out.println("Not implemented yet");
                        break;
                    default:
                        System.out.println("Se introdujo un valor incorrecto o desconocido!");

                }
                System.out.println(" ");
                System.out.println(question);
                int inputMenu2 = input.nextInt();
                if (inputMenu2 == 2) {
                    break;
                }
            }
        }
    }
}


