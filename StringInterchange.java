package Recurrsion;

import java.util.HashSet;
import java.util.Set;

public class StringInterchange {
    //After implementing this set we can see that if we repeat any character then it does not overwrite it.
   static Set<String> set = new HashSet<>();
    public static void main(String[] args) {

        permutation("abcc",1,3);
    }
    static void permutation (String s, int l, int r)
    {
        if (l==r)
        {
            //calling the set function to remove the redundant data.
            if (set.contains(s))
                return;
            set.add(s);
            System.out.println(s);
            return;
        }
        for (int i=l;i<=r;i++)
        {
            s=InterchangeChar(s,l, i);
            permutation(s,l+1,r);
            //Use of backtracking in this method.
            s=InterchangeChar(s,l,i);
        }
    }
    static String InterchangeChar(String s, int a , int b)
    {
        char array[]= s.toCharArray();
        char temp= array[a];
        array[a]=array[b];
        array[b]=temp;
        return String.valueOf(array);
    }
}
