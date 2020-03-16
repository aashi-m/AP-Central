
/**
 * Review for questions that I missed (Question 1)
 * Topic: For Loops
 * @Aashi 
 * @03/15/2020
 */
public class Sec4Q1
{
    public static void main(String[] args)
    {
        int total = 0;
        for(int k = 0; k<=100; k+=2)
        {
            total +=k; 
        }
        int totalA = 0; 
        for(int k = 0; k < 100; k += 2)
        {
            totalA += k + 1;
        }
        int totalB = 0;
        for (int k = 1; k < 101; k += 2)
        {
            totalB += k - 1;
        }
        int totalC = 0; 
        for (int k = 0; k <= 101; k += 2)
        {
            totalC += k + 1;
        }
        int totalD = 0; 
        for (int k = 1; k <= 101; k += 2)
        {
            totalD += k + 1;
        }   
        int totalE = 0; 
        for (int k = 1; k <= 101; k += 2)
        {
            total += k - 1;
        }
        
        System.out.println("Original stores value " + total + " in total"); 
        System.out.println("Option A stores value " + totalA + " in total");
        System.out.println("Option B stores value " + totalB + " in total");
        System.out.println("Option C stores value " + totalC + " in total");
        System.out.println("Option D stores value " + totalD + " in total");
        System.out.println("Option E stores value " + totalE + " in total");
    }
}
