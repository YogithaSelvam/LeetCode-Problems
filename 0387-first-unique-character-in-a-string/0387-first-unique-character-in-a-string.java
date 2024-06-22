class Solution {
    public int firstUniqChar(String s) {
        char[] ch=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(ch[j]==ch[i] && i!=j){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
            return i;
            }
        }
        return -1;
    }
}