
/**
 * Missed questions and tests for Section 6
 * @Aashi
 * @03/11/2020
 */
public class Sec6General
{
    //  Question 3
    public static int checkString(String[] arr)
{   
    int count = 0;
    for (int k = 0; k < arr.length; k++)
    {
        if (arr[k].length() >= 3)
        {
            count++;
        }
    }
    return count;
}
public static void main(String[] args)
{
    //this one does not compile, because array dimension is missing: checkString(new String[]);
    checkString(new String[0]);
    String[] str = {"cat", "dog"};
    checkString(str);
    
    int[] arr = {4, 3, 2, 1, 0};
int total = 0;
for (int k = 0; k <= total; k++)
{
if (arr[k] % 2 == 0)
{
total += arr[k];
}
else
{
total -= arr[k];
}
}
System.out.println(total);

System.out.print(positionOfFirstNegative(arr));
}

public static int positionOfFirstNegative(int[] values)
{
int index = 0;
while (values[index] >= 0)
{
index++;
}
return index;
}
}

