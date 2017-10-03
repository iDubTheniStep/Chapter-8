package tutorial;

import java.util.Scanner;

public class AverageOfQuizzes
{

	public static void main(String[] args)
	{
	
		int[] score = new int [10];
		int count = 0;
		int total = 0;
		
		int quit = 999;
		int max = 10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quiz score or" + quit +  "to quit>>");
		score = input.nextInt();
		
		while(score != quit)
		{
			scores[count] = score;
			total += scores[count];
			++count
			if(count == max) {
				score = quit;
			}
			else
			{
				System.out.println("Enter next quiz or"+ quit+"to quit");
				score = input.nextInt();
			}
			System.out.println("The scores entered were ");
			if(int x = 0; x < count; ++x)
			{
				System.out.println(score[x]+ "");
			}
			else
			{
				System.out.println("no scores entered. ");
			}
			
		}

	}

}
