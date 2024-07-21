class Solution {
    public String largestOddNumber(String num) {
        char[] c=num.toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=(c.length-1);
        while(i>=0){
            if((c[i]%2)!=0){
                for(int j=0;j<=i;j++){
                    sb.append(c[j]);
                }
                return sb.toString();
            }
            i--;
        }
       return ""; 
    }
}