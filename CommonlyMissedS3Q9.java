
/**
 * Required review for commonly missed questions (Section 3, Question 4)
 * Topic: Equivalent Boolean Expressions
 * @Aashi
 * @03/14/2020
 */
public class CommonlyMissedS3Q9
{
    public static void main(String[] args)
    {
        tester(5, 6, 7);
        A(5, 6, 7); 
        B(5, 6, 7); 
        C(5, 6, 7);
        D(5, 6, 7); 
        E(5, 6, 7); //test many values to see
    }
    
    public static boolean tester(int j, int k, int m)
    {
        boolean test = !((j==k) && (k<m)); 
        return test; 
    }
    
    public static boolean A(int j, int k, int m) 
    {
        boolean test = (j!=k) || (k<m); 
        return test; 
    }
    
    public static boolean B(int j, int k, int m)
    {
        boolean test = (j!=k) || (k<=m); 
        return test; 
    }
    
    public static boolean C(int j, int k, int m)
    {
        boolean test = (j==k) || (k<m); 
        return test; 
    }
    
    public static boolean D(int j, int k, int m)
    {
        boolean test = (j!=k) && (k<=m); 
        return test; 
    }
    
    public static boolean E(int j, int k, int m)
    {
        boolean test = (j==k) && (k<m); 
        return test; 
    }
}
