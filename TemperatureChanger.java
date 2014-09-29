/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Jordi Albanell
*  @version 25 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {


System.out.println ("Please insert the temparature that you want to convert to either Celsius or Fahrenheit, but please include the variables, for example: '38 C will be 100.4 F'");

Scanner temperatureReader = new Scanner (System.in);

Boolean done = false;

while (!done) {

String tempDegree = temperatureReader.next();

double temp = Double.parseDouble(tempDegree.substring(0, tempDegree.length() - 1));

String unit =  tempDegree.substring(tempDegree.length() - 1, tempDegree.length());

 if (unit.equals("F")) {

double convertedFtoC = (temp-32.0)/1.8;

   System.out.println (tempDegree + " is " + convertedFtoC + "C" );
 
done = true;

} else if (unit.equals("C")) {

double convertedCtoF = (temp*1.8) + 32;

   System.out.println (tempDegree + " is " + convertedCtoF +  "F");

done = true;

} else {
  
    System.out.println ("You didn't do what I asked, please follow instructions");    
      
      }

    }
  
  }

}
