class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b) -> b.getValue()-               a.getValue());
        
        pq.addAll(hm.entrySet());
        
        StringBuilder sb=new StringBuilder();
        
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> a=pq.poll();
            sb.append(String.valueOf(a.getKey()).repeat(a.getValue()));
        }
        
        return sb.toString();
        
        
    }
}