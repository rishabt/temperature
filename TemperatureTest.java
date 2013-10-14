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
   public void test_celsiusToKelvin(){											//Tests conversion from Celsius to Kelvin
	   System.out.println("Test conversion from Celsius to Kelvin....") ;
	   
	   Temperature temp = new Temperature (0.0, Temperature.Units.CELSIUS);		//Easiest case of converting 0 Celcius
	   Temperature converted = new Temperature(temp);
	   converted.changeUnits(Temperature.Units.KELVIN);
	   
	   assertTrue(converted.getValue() == 273.15) ;								//Result should be 273.15 Kelvin 
   }

   @Test
   public void test_kelvinToCelsius(){											//Tests conversion from Kelvin to Celsius 
	   System.out.println("Test conversion from Kelvin to Celsius....") ;
	   
	   Temperature temp = new Temperature (273.15, Temperature.Units.KELVIN);	//Easiest case of converting 273.15 Kelvin
	   Temperature converted = new Temperature(temp);
	   converted.changeUnits(Temperature.Units.CELSIUS);
	   
	   assertTrue(converted.getValue() == 0.0) ;								//Result should be 0 Celsius 
      
   }
   
   @Test
   public void test_fahrenheitToKelvin(){										//Tests conversion from Fahrenheit to Kelvin
	   System.out.println("Test conversion from Fahrenheit to Kelvin....") ;
	   
	   Temperature temp = new Temperature (32.0, Temperature.Units.FAHRENHEIT);	//Easiest case of converting 32 Fahrenheit
	   Temperature converted = new Temperature(temp);
	   converted.changeUnits(Temperature.Units.KELVIN);
	   
	   assertTrue(converted.getValue() == 273.15) ;								//Result should be 273.15 Kelvin
   }
   
   @Test
   public void test_kelvinToFahrenheit(){										//Tests conversion from Kelvin to Fahrenheit
	   System.out.println("Test conversion from Kelvin to Fahrenheit....") ;
	   
	   Temperature temp = new Temperature (273.15, Temperature.Units.KELVIN);	//Easiest case of converting 273.15 Kelvin
	   Temperature converted = new Temperature(temp);
	   converted.changeUnits(Temperature.Units.FAHRENHEIT);
	   
	   assertTrue(converted.getValue() == 32.0) ;								//Result should be 32 Fahrenheit
   }
   
   @Test
   public void test_celsiusToFahrenheit(){										//Tests conversion from Celsius to Fahreheit 
	   System.out.println("Test conversion from Celsius to Fahrenheit....") ;
	   
	   Temperature temp = new Temperature (0.0, Temperature.Units.CELSIUS);		//Easiest case of converting 0 Celsius 
	   Temperature converted = new Temperature(temp);
	   converted.changeUnits(Temperature.Units.FAHRENHEIT);
	   
	   assertTrue(converted.getValue() == 32.0) ;								//Result should be 32 Fahrenheit 
   }
   
   @Test
   public void test_fahrenheitToCelsius(){										//Tests conversion from Fahrenheit to Celsius 
	   System.out.println("Test conversion from Fahrenheit to Celsius") ;
	   
	   Temperature temp = new Temperature (32.0, Temperature.Units.FAHRENHEIT);	//Easiest case of converting 32 Fahrenheit
	   Temperature converted = new Temperature(temp);
	   converted.changeUnits(Temperature.Units.CELSIUS);
	   
	   assertTrue(converted.getValue() == 0.0) ;								//Result should be 0 Celsius 
   }
   
}
