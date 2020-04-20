
/**
 * Missed questions from Section 7 (Question 8), (Score: 16/18) 
 * Topic: Sorting 
 * @Aashi
 * @04/17/2020
 */
public class Sec7Q18
{
    public static int tally; 
    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            if (j != minIndex)
            {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp;  tally++; // line 19
            }
        }
        System.out.println(tally);
    }
    
    public static void main(String[] args)
    {
        int[] arr = {30, 40, 10, 50, 20};
        selectionSort(arr);
    }
}
