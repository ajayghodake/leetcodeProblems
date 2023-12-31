class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0){  // is the number is 0.
            return true;
        }

        if(x < 0 || x%10==0){    // number is negative or if the number ends with 0.
            return false;
        }
       
       int temp = x;
       int rem = 0;
       int rev = 0;
       while(temp != 0){
           rem = temp%10;
           rev = rev * 10 + rem;
           temp = temp/10;
       }

       if(rev == x){
           return true;
       }
       else{
           return false;
       }
    }
}