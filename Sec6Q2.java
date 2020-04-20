
/**
 * Missed questions from Section 6, (Question 2) (score: 11/14)
 * Topic: Array Creation and Access
 * @Aashi 
 * @04/17/2020
 */
public class Sec6Q2
{
    public static int[] transform(int[] a)
    {
        a[0]++;
        a[2]++;
        return a;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {0, 0, 0, 0};
        int[] arr2 = new int[0];
        int[] arr3 = new int[4];
        arr1 = transform(arr1);
        //arr2 = transform(arr2); //causes error (index out of bounds)
        arr3 = transform(arr3);
        
        for(int i = 0; i<arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        /* System.out.println();
        for(int i = 0; i<arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        } */
        System.out.println();
        for(int i = 0; i<arr3.length; i++)
        {
            System.out.print(arr3[i] + " ");
        }
    }
}
