
/**
 * Questions missed from Section 6, (Question 11) (score: 11/14)
 * Topic: Developing Algorithms Using Arrays
 * @Aashi
 * @04/17/2020
 */
public class Sec6Q11
{
    public static void main(String[] args)
    {
        int[] arr = {1, 1, 5, 6, 2};
        int[] arr2 = {1, 2, 5, 1, 6};
        int[] arr3 = {2, 5, 1, 1, 6};
        int[] arr4 = {2, 5, 6, 1, 1};
        int[] arr5 = {1, 2, 5, 6, 1};
        int[] arr6 = {1, 2, 5, 6, 7};
        System.out.println("Option B:");
        boolean duplicates = false;
        for (int x = 0; x < arr.length - 1; x++)
        {
            for (int y = 0; y < arr.length; y++)
            {
                if (arr[x] == arr[y])
                {
                    duplicates = true;
                }
            }
        }
        System.out.println(duplicates);
        boolean duplicates2 = false;
        for (int x = 0; x < arr2.length - 1; x++)
        {
            for (int y = 0; y < arr2.length; y++)
            {
                if (arr2[x] == arr2[y])
                {
                    duplicates2 = true;
                }
            }
        }
        System.out.println(duplicates2);
        boolean duplicates3 = false; 
        for (int x = 0; x < arr3.length - 1; x++)
        {
            for (int y = 0; y < arr3.length; y++)
            {
                if (arr3[x] == arr3[y])
                {
                    duplicates3 = true;
                }
            }
        }
        System.out.println(duplicates3);
        boolean duplicates4 = false;
        for (int x = 0; x < arr4.length - 1; x++)
        {
            for (int y = 0; y < arr4.length; y++)
            {
                if (arr4[x] == arr4[y])
                {
                    duplicates4 = true;
                }
            }
        }
        System.out.println(duplicates4);
        boolean duplicates5 = false; 
        for (int x = 0; x < arr5.length - 1; x++)
        {
            for (int y = 0; y < arr5.length; y++)
            {
                if (arr5[x] == arr5[y])
                {
                    duplicates5 = true;
                }
            }
        }
        System.out.println(duplicates5);
        boolean duplicates6 = false; 
        for (int x = 0; x < arr6.length - 1; x++)
        {
            for (int y = 0; y < arr6.length; y++)
            {
                if (arr6[x] == arr6[y])
                {
                    duplicates6 = true;
                }
            }
        }
        System.out.println(duplicates6);
        System.out.println();
        System.out.println("Option D:");
        boolean duplicates7 = false; 
        for (int x = 0; x < arr.length - 1; x++)
        {
            for (int y = x + 1; y < arr.length; y++)
            {
                if (arr[x] == arr[y])
                {
                    duplicates7 = true;
                }
            }
        }
        System.out.println(duplicates6);
        boolean duplicates8 = false; 
        for (int x = 0; x < arr2.length - 1; x++)
        {
            for (int y = x + 1; y < arr2.length; y++)
            {
                if (arr2[x] == arr2[y])
                {
                    duplicates8 = true;
                }
            }
        }
        System.out.println(duplicates7);
        boolean duplicates9 = false; 
        for (int x = 0; x < arr3.length - 1; x++)
        {
            for (int y = x + 1; y < arr3.length; y++)
            {
                if (arr3[x] == arr3[y])
                {
                    duplicates9 = true;
                }
            }
        }
        System.out.println(duplicates8);
        boolean duplicates10 = false; 
        for (int x = 0; x < arr4.length - 1; x++)
        {
            for (int y = x + 1; y < arr4.length; y++)
            {
                if (arr4[x] == arr4[y])
                {
                    duplicates10 = true;
                }
            }
        }
        System.out.println(duplicates9);
        boolean duplicates11 = false; 
        for (int x = 0; x < arr5.length - 1; x++)
        {
            for (int y = x + 1; y < arr5.length; y++)
            {
                if (arr5[x] == arr5[y])
                {
                    duplicates11 = true;
                }
            }
        }
        System.out.println(duplicates11);
        boolean duplicates12 = false; 
        for (int x = 0; x < arr6.length - 1; x++)
        {
            for (int y = x + 1; y < arr6.length; y++)
            {
                if (arr6[x] == arr6[y])
                {
                    duplicates12 = true;
                }
            }
        }
        System.out.println(duplicates12);
        System.out.println();
        System.out.println("The results of this show that only option D is correct, since Option B says true even when there are no duplicate values");
    }
}
