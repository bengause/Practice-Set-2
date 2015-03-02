package MainPackage;

public class MyInteger {
	
	//Create a data field for the int
	
	private int value;
	
	//Getter
	
	public int getValue() {
		return value;
	}
	
	//Constructor that creates an object for value
	public MyInteger(int value) {
		this.value = value;
	
	}

	//Method IsEven
	
	public boolean IsEven() {
		
		//Modulus of 2 is used to test the value
		
		if (value % 2 == 0) 
			return true;
		else
			return false;
	}

	public boolean IsOdd() {
		
		//Nothing more is needed except opposite of IsEven()
		return !(IsEven());
	}
	
	public boolean IsPrime() {
		
		//Create a boolean as a flag variable
		
		boolean p = true;
		
		//from 2 to the value of the int, divide the value by the number
		//if any does not have a remainder, it is not prime
		
		for (int x = 2; x < value; x++) {
			if (value % x == 0) {
				p = false;
				break;
			}
		}
		return p;
	}

	//Call IsEven as a static method
	
	public static boolean IsEven(int value) {
		MyInteger myInt = new MyInteger(value);
		return myInt.IsEven();

	}
	
	//Call IsOdd as a static method
	
	public static boolean IsOdd(int value) {

		MyInteger myInt = new MyInteger(value);
		return myInt.IsEven();
	}

	//Call IsPrime as a static method
	
	public static boolean IsPrime(int value) {

		MyInteger myInt = new MyInteger(value);
		return myInt.IsPrime();
	}
	
	//Call the three again and evaluate using the object that was created
	
	public static boolean IsEven(MyInteger value) {
		return value.IsEven();
	}

	public static boolean IsOdd(MyInteger value) {
		return value.IsOdd();
	}

	public static boolean IsPrime(MyInteger value) {
		return value.IsPrime();
	}
	
	//Function to convert an array to one number

	public static int parseInt(char[] numarray) {
		
		//Create an int for the total
		int total = 0;
		
		//for loop to parse through the array and add the values to one total
		for (int x = 0; x < numarray.length; x++) {
			int item = numarray[x];
			total += item;
		}
		//return the total
		return total;

	}
	
	//Function to convert a string to an integer
	public static int parseInt(String mystring)
	{
		//Variable for the end result of the number
//		int mynumber = 0;
		
		
		/* Just a note, I wrote the code below this then
		 * I discovered that Jva had a method that automatically
		 * does all of this.  I commented out the code
		 * just in case that is actually what you wanted us to 
		 * do
		 */
		int mynumber = Integer.parseInt(mystring);
		
//		//For loop to parse through the string
//		for (int x = 0; x < mystring.length(); x++) {
//			
//			//Creates an int for each value in the string
//			int digit = mystring.charAt(x);
//			
//			/*Gives the proper value to each digit in the string
//			 *based on how long the string is
//			 *For example, if the string is 3 digits long,
//			 *it will assign the first digit to the hundreds 
//			 *place by multiplying it by 10^2.
//			 */
//			double strvalue = digit * Math.pow(10, ((mystring.length()-1) - x));
//			
//			//Adds the values together to recreate the string as an int
//			mynumber += strvalue;
//		}
		return mynumber;
	}
	

}
