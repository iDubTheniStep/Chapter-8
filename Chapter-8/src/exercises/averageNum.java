package exercises;

public class averageNum 
{

	public static void main(String[] args)
	{
		
		int[] ranInt = {23, 6, 47, 35, 2, 14};
		int add = ranInt[0] +  ranInt[1] +  ranInt[2]+ ranInt[3] +  ranInt[4] +  ranInt[5];
		int avrg = add / 6; 
		int max = 0;
		System.out.println("your average is " + avrg);
		
		for (int counter = 1; counter < ranInt.length; counter++)
		{
		     if (ranInt[counter] > max)
		     {
		      max = ranInt[counter];
		     }
		}
		System.out.println("Your max number is "+ max);
        for(int p=0;p<ranInt.length;p++)
        {
            // check number is even or odd??
            if(ranInt[p]%2==0)

                System.out.println(ranInt[p]+ " is Even number");
            else
                System.out.println(ranInt[p]+" is odd umber");
        }
	}
    
}
