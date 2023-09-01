package oop;
import java.util.*;
 //no constructor in interface

// all lower classes should agree with rules of interface, if not than object of that class cannot be created
public interface CarInterface {
	public final String first_name="Honda";
	String last_name="Civic";    //by default its public and final
	
	 void carName();
	
}
