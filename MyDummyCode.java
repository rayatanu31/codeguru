import java.util.Scanner;

puclic class MyDummyCode {
	public static void main(String[] abc) {
        	/* This reads the input provided by user
         	* using keyboard
         	*/
        	Scanner scan = new Scanner(System.in);
        	System.out.print("Enter first number: ");

        	// This method reads the number provided using keyboard
        	int num1 = scan.nextInt();
        
        	System.out.print("Enter second number: ");
        	int num2 = scan.nextInt();

        	// Closing Scanner after the use
        	scan.close();
        
        	// Calculating product of two numbers
        	int product = num1*num2;
        
        	// Displaying the multiplication result
        	System.out.println("Output: "+product);

		try {
            		FileWriter myWriter = new FileWriter("filename.txt");
            		myWriter.write("Files in Java might be tricky, but it is fun enough!");
            		// myWriter.close();
            		System.out.println("Successfully wrote to the file.");
        	} catch (IOException e) {
            		System.out.println("An error occurred.");
            		e.printStackTrace();
        	}
	}
}
