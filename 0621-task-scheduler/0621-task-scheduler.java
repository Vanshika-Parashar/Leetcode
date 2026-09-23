class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int maxfreq=list.get(0).getValue()-1;
        int idle=n*maxfreq;
        for(int i=1;i<list.size();i++){
            int val=list.get(i).getValue();
            idle-=Math.min(maxfreq,val);
        }
        if(idle<=0)return tasks.length;
        return idle+tasks.length;

    }
}