package Recurrsion;

public class aPwoerb {
    static int step, stepCount;
    public static void main(String[] args) {
      //  System.out.println(pow(3,1000));
      //  System.out.println(step);
        System.out.println(fast(3,10000));
        System.out.println(stepCount);
    }
    // This method take more steps to perform the program.
   /* static int pow(int a , int b){
        step++;
        if(b==0)
        {
            return 1;
        }
        return a*pow(a,b-1);
    }*/
    //This method takes less steps to calculate the power.
    static int fast(int a, int b){
        stepCount++;
        if (b==0)
        {
            return 1;
        }
        if (b%2==0)
        {
            return fast(a*a,b/2);

        }else{
        return a*fast(a,b-1);}
    }
}
