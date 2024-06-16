class Solution {
    public String convert(String s, int n) {
        if(n==1) return s; //if input string has one row
        
        else{
            char[] c=s.toCharArray();
            int l=c.length;
            StringBuffer[] sb=new StringBuffer[n];
            for(int i=0;i<sb.length;i++){         //creates stringbuffer for each row
                sb[i]=new StringBuffer();
            }
            int i=0;
            while(i<l){
            for(int j=0;j<n && i<l;j++){    //vertically down
                sb[j].append(c[i++]);
            }
            for(int j=n-2;j>=1 && i<l;j--){ //obliquely up
                sb[j].append(c[i++]);
            }
            }
            for(int j=1;j<sb.length;j++){   //appending all the rows of each stringbuffer to row 0
                sb[0].append(sb[j]);
            }
            
            return sb[0].toString();
        }
    }
}