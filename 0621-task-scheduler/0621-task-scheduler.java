class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(Character s:tasks){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int maxFreq=list.get(0).getValue();
        int idlespace=(maxFreq-1)*n;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            int curr=list.get(i).getValue();
            idlespace-=Math.min(curr,maxFreq-1);
            
        }
        if(idlespace<=0)return tasks.length;
        return tasks.length+idlespace;
    }
}