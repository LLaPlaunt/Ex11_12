import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Ex_12Test {

	@Test
	void testMain() {

        Scanner userInput = new Scanner(System.in);        
        
        System.out.print("Enter 5 numbers you want the sum of: ");
        
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) 
        	list.add(userInput.nextDouble());

        System.out.println("The sum of the 5 numbers = " + sum(list));

    }

    private static double sum(ArrayList<Double> list) {

        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }

}
