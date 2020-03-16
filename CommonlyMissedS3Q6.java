
/**
 * Required review for commonly missed questions (Section 3, Question 1)
 * Topic: if-else Statements
 * @Aashi
 * @03/14/2020
 */
public class CommonlyMissedS3Q6
{
    public static void main(String[] args)
    {
        System.out.println("These are the Strings that should be printed for different temperature ranges:");
        System.out.println("Temp 31 and below: \"cold\"");
        System.out.println("Temp 31-50: \"cool\""); 
        System.out.println("Temp 51-70: \"moderate\""); 
        System.out.println("71 and above: \"warm\""); 
        System.out.println("Which value (30, 51, or 60), when tested as temperature, shows that this code does not work as intended?");
        int temp1 = 30; 
        int temp2 = 51; 
        int temp3 = 60; 
        
        System.out.println("Answer: "); 
        System.out.println("Test value temp = 30 produces String " + giveWeather(temp1));
        System.out.println("Test value temp = 51 produces String " + giveWeather(temp2));
        System.out.println("Test value temp = 60 produces String " + giveWeather(temp3));
    }
    
    public static String giveWeather(int temp)
    {
        String weather;
        if(temp<=31)
        {
            weather = "cold"; 
        }
        else
        {
            weather  = "cool"; 
        }
        
        if(temp >=51)
        {
            weather = "moderate"; 
        }
        else
        {
            weather = "warm"; 
        }
        
        return weather; 
    }
}
