public class Main {
    public static void main(String[] args) {
        String str = "112";
        int n = str.length();

        System.out.println(myAtoiRecursive(str, n));
    }
    //helper function
    public static boolean isConsonant(char ch){
        //Convert character to Upper Case
        // return if the character not equal A or U or E or I or O
        return ch>=65 && ch<=90;
    }
    public static int totalConsonants(String str){
        int count=0;
        //loop through the string and call the isConsonant function in each iteration
        //if the function above returns true then increase the count by one
        return count;
    }
    public static int myAtoiRecursive(String str,int n){
        //if string is empty, return zero
        return 0;
        // if string has a length of 1, then return first character in the string and subtract '0'.

        //if the length is more than 1, then

    }
    public static int countSubstrs(String str, int i,
                                   int j, int n){
        //if n equal 1, then return 1
        if(n==1)
            return 1;
        // if n is less than or equal 0, return 0
        if(n<=0)
            return 0;
        // res is the summation of substring without the first character string
        //and substring without the last character string
        //, and substring without the first and last string with length n-2
        int res=0;
        // if character at i of the string is equal to character at j then increment res and return res outside the if condition
        

        return res;

    }
}