class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch :tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        
        int idlespace=n*(list.get(0).getValue()-1);
        int p=0;
        int maxfreq=list.get(0).getValue();
        for(int i=1;i<list.size();i++){
            p=list.get(i).getValue();
            idlespace-=Math.min(maxfreq-1,p);
        }
        if(idlespace<=0)return tasks.length;
        return tasks.length+idlespace;
    }
}