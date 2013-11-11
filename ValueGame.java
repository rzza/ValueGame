import java.util.Scanner;
import java.io.*;

public class ValueGame
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) throws java.io.FileNotFoundException
	{
		
		int RealValue;
		int FirstGuess;
		int SecondGuess;
		int ThirdGuess;
		int FourthGuess;
		int FifthGuess;

		Scanner fileIn = new Scanner (new FileReader("value.txt"));
		
		RealValue = fileIn.nextInt();
		System.out.print(" First guess: Please guess the number in the file: ");
		
		    FirstGuess = console.nextInt();
		

		if (FirstGuess == RealValue)
		   System.out.println("Winner, winner, chicken dinner!");
		else
		   System.out.print("Wrong number, please take a second guess:");
		
		   SecondGuess = console.nextInt();
		
		if (SecondGuess == RealValue)
		   System.out.println("Winner, winner, chicken dinner!");
		else
		   System.out.print("Wrong number, please try a third time:");
			
		   ThirdGuess = console.nextInt();

		if (ThirdGuess == RealValue)
		   System.out.println("Winner, winner, chicken dinner!");
		else
		   System.out.print("Wrong number, this is your fourth try:");

		  FourthGuess = console.nextInt();

		if (FourthGuess == RealValue)
		   System.out.println("Winner, winner, chicken dinner!");
		else
		   System.out.print("Wrong number, fifth and final try!");

		  FifthGuess = console.nextInt();

		if (FifthGuess == RealValue)
		   System.out.println("Winner, winner, chicken dinner!");
		else	
		   System.out.print(" Wrong number, game over! ");

		fileIn.close();
			
	}
}