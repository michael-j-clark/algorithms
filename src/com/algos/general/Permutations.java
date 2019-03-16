package com.algos.general;

// Java program to print all permutations of a
// given string.
public class Permutations
{


    /**
     * permutation function
     * @param a char[] to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(char a[], int l, int r)
    {
        if (l == r)
            System.out.println(String.valueOf(a));
        else
        {
            for (int i = l; i <= r; i++)
            {
                swap(a,l,i);
                permute(a, l+1, r);
                swap(a,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a aing value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public void swap(char a[], int i, int j)
    {
        char temp;

        temp = a[i] ;
        a[i] = a[j];
        a[j] = temp;

    }

    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        Permutations permutation = new Permutations();
        permutation.permute(str.toCharArray(), 0, n-1);
    }

}

// This code is contributed by Mihir Joshi

