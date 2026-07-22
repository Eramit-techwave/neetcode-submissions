class Solution {
    public int countDigits(int num) {
        int count  = 0;
        int numbers = num;
         while(num > 0){
            int digit = num%10;
            if(numbers % digit == 0){
                count ++;
            }
            num = num / 10;
        }
        return count;
    }
}
