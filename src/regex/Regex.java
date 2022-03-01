package regex;

import java.util.regex.*;

public class Regex {

    public static void main(String args[]) {
//matches -> Coincidencias
        System.out.println(
                Pattern.matches("geeksforge*ks", "geeksforgeeks"));
         System.out.println(
                 Pattern.matches("g*geeks*", "geeksfor"));

//find + Matcher + start + end -> con ciclo
//CASE_INSENSITIVE -> Búsqueda de patrones que no distingue entre mayúsculas y minúsculas
        Pattern pattern = Pattern.compile("anais", Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher("Belen Anais Ramirez Labastida Anais");

        while (m.find())
        System.out.println("Nombre en la posicion "
                    + m.start() + " a " + (m.end() - 1));

//split() para dividir un texto basado en un patrón delimitador.
        String text = "uno1dos2tres3cuatro4cinco5";
        String delimiter = "\\d";

        Pattern patron = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String[] result = patron.split(text);

        for (String tempStr : result)
            System.out.println("tempStr = " + tempStr);

//email validation example
    /* Otros Patrones de Diseño
    String PATRON_USERNAME = "^[a-z0-9_-]{3,15}$";
    String PATRON_CONTRASENIA = "((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
    String PATRON_EXTENSION_IMAGEN = "([^\s]+(\.(?i)(jpg|png|gif|bmp))$)";
    */
        String textoMail =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

            String email = "corre_prueba@dominio.com";

            Pattern pattern2 = Pattern.compile(textoMail);
            Matcher matcher = pattern2.matcher(email);
            boolean resultado = matcher.matches();
            System.out.println("el correo es valido?: "+ resultado);

//replaceAll
        String Data = "I am a change. You are change. Everybody is a change.";
        String dataPattern = "change";

        Pattern pattern5 = Pattern.compile(dataPattern);
        Matcher matcher5 = pattern5.matcher(Data);

        String newString = matcher5.replaceAll("kitty");
        System.out.println("newString: " + newString);

    }

}
