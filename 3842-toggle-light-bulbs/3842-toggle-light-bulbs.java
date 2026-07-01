class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[]check=new boolean[101];
        for(int i=0;i<bulbs.size();i++){
            int j=bulbs.get(i);
            if(check[j]==false){
                check[j]=true;
            }
            else if(check[j]==true){
                check[j]=false;
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<=100;i++){
            
            if(check[i]==true){
                ans.add(i);
            }
        }
        
        return ans;
    }
}