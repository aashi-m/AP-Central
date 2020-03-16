
/**
 * Review for questions that I missed (Question 2)
 * Topic: Nested Iteration
 * @Aashi
 * @03/15/2020
 */
public class Sec4Q2
{
    public static void main(String[] args)
    {
        System.out.println("The following output should be produced: \n0\n11\n222\n3333");
        System.out.println("Option A output: "); 
        for(int k = 0; k < 4; k++)
        {
            for (int h = 0; h < k; h++)
            {
                System.out.print(k);
            }
            System.out.println(); 
        }
        
        System.out.println("\nOption B output: "); 
        for(int k = 0; k < 4; k++)
        {
            for (int h = 1; h < k + 1; h++)
            {
                System.out.print(k);
            }
            System.out.println(); 
        }
        
        System.out.println("\nOption C output: "); 
        for(int k = 0; k < 4; k++)
        {
            for (int h = 0; h < 3; h++)
            {
                System.out.print(k);
            }
            System.out.println(); 
        }
        
        System.out.println("\nOption D output: ");
        for(int k = 0; k < 4; k++)
        {
            for (int h = k; h >= 0; h--)
            {
                System.out.print(k);
            }
            System.out.println(); 
        }
        
        System.out.println("\nOption E output: \n[causes infinte loop]");
        
    }
}
