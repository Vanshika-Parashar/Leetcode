class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int maxfreq=list.get(0).getValue();
        int idle=(maxfreq-1)*n;
        for(int i=1;i<list.size();i++){
            int val=list.get(i).getValue();
            idle-=Math.min(maxfreq-1,val);
        }
        if(idle<=0){
            return tasks.length;
        }
        return tasks.length+idle;

    }
}