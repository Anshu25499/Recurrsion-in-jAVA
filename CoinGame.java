package Recurrsion;

public class CoinGame {
    public static void main(String[] args) {
        int a[]={1,2,4,5,3,7};
        System.out.println(coinMax(a,0,a.length-1));
    }
    static int coinMax(int a[], int l, int r)
    {
        //Base case.
        if (l+1==r)
        {
            return Math.max(a[l],a[r]);
        }

       return Math.max(a[l]+Math.min(coinMax(a,l+2,r),coinMax(a,l+1,r-1)),
               a[r]+Math.min(coinMax(a,l+1,r-1),coinMax(a,l,r-2)));
    }
}
