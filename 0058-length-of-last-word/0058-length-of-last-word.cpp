class Solution {
public:
    int lengthOfLastWord(string s) {
        int j = 0;
        for(int i=s.size()-1;i>=0;--i){
            if(s[i] == ' ' && j > 0) return j;
            if(s[i] != ' ') j++;
        }
        return j;
    }
};