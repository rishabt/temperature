/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

   @Test
   public void test_celsiusToKelvin(){
	   System.out.println("Test conversion from Celsius to Kelvin....") ;
	   
	   Temperature averageHighInOctober = new Temperature (0.0, Temperature.Units.CELSIUS);
	   Temperature converted = new Temperature(averageHighInOctober);
	   converted.changeUnits(Temperature.Units.KELVIN);
	   
	   assertTrue(converted.getValue() == 273.15) ;
   }

   @Test
   public void test_kelvinToCelsius(){
	   System.out.println("Test conversion from Kelvin to Celsius....") ;
	   
	   Temperature averageHighInOctober = new Temperature (273.15, Temperature.Units.KELVIN);
	   Temperature converted = new Temperature(averageHighInOctober);
	   converted.changeUnits(Temperature.Units.CELSIUS);
	   
	   assertTrue(converted.getValue() == 0.0) ;
      
   }
   
   @Test
   public void test_fahrenheitToKelvin(){
	   System.out.println("Test conversion from Fahrenheit to Kelvin....") ;
	   
	   Temperature averageHighInOctober = new Temperature (32.0, Temperature.Units.FAHRENHEIT);
	   Temperature converted = new Temperature(averageHighInOctober);
	   converted.changeUnits(Temperature.Units.KELVIN);
	   
	   assertTrue(converted.getValue() == 273.15) ;
   }
   
   @Test
   public void test_kelvinToFahrenheit(){
	   System.out.println("Test conversion from Kelvin to Fahrenheit....") ;
	   
	   Temperature averageHighInOctober = new Temperature (273.15, Temperature.Units.KELVIN);
	   Temperature converted = new Temperature(averageHighInOctober);
	   converted.changeUnits(Temperature.Units.FAHRENHEIT);
	   
	   assertTrue(converted.getValue() == 32.0) ;
   }
   
   @Test
   public void test_celsiusToFahrenheit(){
	   System.out.println("Test conversion from Celsius to Fahrenheit....") ;
	   
	   Temperature averageHighInOctober = new Temperature (0.0, Temperature.Units.CELSIUS);
	   Temperature converted = new Temperature(averageHighInOctober);
	   converted.changeUnits(Temperature.Units.FAHRENHEIT);
	   
	   assertTrue(converted.getValue() == 32.0) ;
   }
   
   @Test
   public void test_fahrenheitToCelsius(){
	   System.out.println("Test conversion from Fahrenheit to Celsius") ;
	   
	   Temperature averageHighInOctober = new Temperature (32.0, Temperature.Units.FAHRENHEIT);
	   Temperature converted = new Temperature(averageHighInOctober);
	   converted.changeUnits(Temperature.Units.CELSIUS);
	   
	   assertTrue(converted.getValue() == 0.0) ;
   }
   
}
