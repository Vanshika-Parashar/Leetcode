class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int max=0;
        int len=0;
        int i=0;
        int j=0;
        HashMap<Integer,Integer>m=new HashMap<>();
        while(j<n){
            if(m.containsKey(fruits[j])){
                m.put(fruits[j],m.get(fruits[j])+1);
            }
            else{
                m.put(fruits[j],1);
            }
            while(m.size()>2){
                int freq=m.get(fruits[i]);
                if(freq==1){
                m.remove(fruits[i]);
                }
                else{
                    m.put(fruits[i],freq-1);
                }
                i++;
            }
            len=j-i+1;
            max=Math.max(len,max);
            j++;
            }  
            return max;   
        }
        


    
}