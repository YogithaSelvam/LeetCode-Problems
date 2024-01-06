class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int i=0,highpt=0,pt=0;
        while(i<gain.size()){
            pt+=gain[i];
            if(pt>=highpt){
                highpt=pt;
            }
            i++;
        }
        return highpt;
    }
};