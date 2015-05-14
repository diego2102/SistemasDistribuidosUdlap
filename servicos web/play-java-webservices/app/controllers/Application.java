package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.api.libs.json.*;

import java.util.Vector;

public class Application extends Controller {

    /*
* El siguiente método solamente despliega
* un mensaje dentro del template index.
*/
    public static Result index() {
        return ok(index.render("Hola mundo, servicios web!!"));
    }

    /*
* El siguiente método hace una multiplicación de enteros.
* @param a el primer  entero.
* @param b el segundo entero.
* @return Resultado en formato Json.
*/
    public static Result getMultiplicacion(int a, int b){
        ObjectNode result = Json.newObject();
        result.put("resultado", a*b );
        return ok(result);
    }


    /*
* El siguiente método verifica si una cadena es un palíndromo.
* @param word la palabra a validar.
* @return true o false en formato Json.
*/


    public static Result getPesos(double dolares){
        ObjectNode result = Json.newObject();
        result.put("resultado", dolares * 14.96 );
        return ok(result);
    }

    public static Result getGrados(double fare){
        ObjectNode result = Json.newObject();
        result.put("resultado", (fare - 32)/1.8 );
        return ok(result);
    }
    public static Result getPalindromo(String word){
        ObjectNode result = Json.newObject();
        String myWord = word.replaceAll("\\s+","");
        String reverse = new StringBuffer(myWord).reverse().toString();
        result.put("resultado", reverse.equalsIgnoreCase(myWord));
        return ok(result);
    }

    public static Result getCapital(String pais){
        ObjectNode result = Json.newObject();

        String capital="NOO SE LOCALIZO EL PAIS O NO ESTA REGISTRADO";
        String[][] paises = new String[11][2];

        paises[0][0] = "Mexico";    paises[0][1] = "Mexico DF";
        paises[1][0] = "Alemania";  paises[1][1] = "Berlin";
        paises[2][0] = "Italia";    paises[2][1] = "Roma";
        paises[3][0] = "Argentina"; paises[3][1] = "Buenos Aires";
        paises[4][0] = "Kasajastan";paises[4][1] = "Almata";
        paises[5][0] = "Japon";     paises[5][1] = "Tokio";
        paises[6][0] = "Paraguay";  paises[6][1] = "Monte Video";
        paises[7][0] = "Egipto";    paises[7][1] = "EL Kairo";
        paises[8][0] = "Rusia";     paises[8][1] = "Moscu";
        paises[9][0] = "Turquia";   paises[9][1] = "Budapest";
        paises[10][0] = "Reino Unido";   paises[10][1] = "Inglaterra";


        for(int i = 0 ; i < 11; i++){

            if(paises[i][0].equals(pais)==true)

                capital = paises[i][1];
        }

        result.put("resultado", capital);
        return ok(result);
    }

    public static Result getEmbajada(String pais){
        ObjectNode result = Json.newObject();

        String capital="NO SE LOCALIZO EL PAIS O NO ESTA REGISTRADO E";
        String[][] paises = new String[11][2];

        paises[0][0] = "Mexico";    paises[0][1] = "Reforma 305. Colonia Cuauhtémoc 06500 México, D.F..";
        paises[1][0] = "Alemania";  paises[1][1] = "Berlin";
        paises[2][0] = "Italia";    paises[2][1] = "41.913325  12.509703a";
        paises[3][0] = "Argentina"; paises[3][1] = "Buenos Aires";
        paises[4][0] = "Kasajastan";paises[4][1] = "Almata";
        paises[5][0] = "Japon";     paises[5][1] = "Tokio";
        paises[6][0] = "Paraguay";  paises[6][1] = "Monte Video";
        paises[7][0] = "Egipto";    paises[7][1] = "EL Kairo";
        paises[8][0] = "Rusia";     paises[8][1] = "Moscu";
        paises[9][0] = "Turquia";   paises[9][1] = "Budapest";
        paises[10][0] = "Reino Unido";   paises[10][1] = "19.057151 -98.283782";


        for(int i = 0 ; i < 11; i++){

            if(paises[i][0].equals(pais)==true)

                capital = paises[i][1];
        }

        result.put("result", capital);
        return ok(result);
    }



}//end class
