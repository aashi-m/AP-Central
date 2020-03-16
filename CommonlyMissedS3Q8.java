
/**
 * Required review for commonly missed questions (Section 3, Question 3)
 * Topic: else if Statements
 * @Aashi
 * @03/14/2020
 */
public class CommonlyMissedS3Q8
{
    public static void main(String[] args)
    {
        System.out.println("Method 1 (x = 2, y = 3) "); method1(2, 3);
        System.out.println("Method 1(x = 3, y = 2)"); method1(3, 2); 
        System.out.println("Method 1 (x = 3, y = 3)"); method1(3, 3); 
        System.out.println(); 
        System.out.println("Method 2 (x = 2, y = 3) "); method2(2, 3);
        System.out.println("Method 2(x = 3, y = 2)"); method2(3, 2); 
        System.out.println("Method 2 (x = 3, y = 3)"); method2(3, 3);
    }
    
    public static void method1(int x, int y)
    {
        int result = 0; 
        if(x>y)
        {
            result = x-y; 
            System.out.print(result); 
        }
        else if(x<y)
        {
            result = y-x; 
            System.out.print(result); 
        }
        else
        {
            System.out.print(result); 
        }
    }
    
    public static void method2(int x, int y)
    {
        if(x<y)
        {
            System.out.print(y-x);
        }
        else
        {
            System.out.print(x-y);
        }
    }
}
