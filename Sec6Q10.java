
/**
 * Questions missed from Section 6, (Question 10) (score: 11/14)
 * Topic: Traversing Arrays & Enhanced For Loop Arrays
 * @Aashi
 * @04/17/2020
 */
public class Sec6Q10
{
    public static void printOne()
    {
        int[] arr = {1, 2, 3, 4, 5};
        for (int x = 0; x < arr.length; x++)
        {
            System.out.print(arr[x + 3]);
        }   
    }
    public static void printTwo()
    {
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int n : arr2)
        {
            System.out.print(n + 3);
        }
    }
    public static void main(String[] args)
    {
        printTwo();
        //printOne(); as seen if this is commented in & ran, this causes an index out of bounds
    }
}
