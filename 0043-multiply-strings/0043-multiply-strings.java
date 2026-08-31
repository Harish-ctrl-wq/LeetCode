class Solution {
    public String multiply(String num1, String num2) {
       if(num1.equals("0") || num2.equals("0"))return "0";
       int n1 = num1.length();
       int n2 = num2.length();
       int result[] = new int[n1+n2];
       for(int i = num1.length() - 1; i >= 0; i--){
         for(int j = num2.length() - 1; j >= 0; j--){
            int d1 = num1.charAt(i)-'0';
            int d2 = num2.charAt(j)-'0';

            int product = d1*d2;
            int p1 = i+j;
            int p2 = i+j+1;
            int sum = product + result[p2];
            result[p1] += sum/10; // carry wala int
            result[p2] = sum%10;  //last digit without carry
        }
       }
       StringBuilder sb = new StringBuilder();
       for(int d : result){
        if(sb.length() == 0 && d == 0){
            continue;
        }
        sb.append(d);
       } 
       
     return sb.toString();
        
    }
}