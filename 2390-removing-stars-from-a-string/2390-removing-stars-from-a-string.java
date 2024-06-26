class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        char[] c=s.toCharArray();
        int n=c.length;
        for(int i=0;i<n;i++){
            if(c[i]=='*'){
                if(!stack.isEmpty()){
                stack.pop();
                }
            }
            else{
                stack.push(c[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}