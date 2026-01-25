class Solution {
    public int compress(char[] arr) {
        StringBuilder sb=new StringBuilder();
        int n=arr.length;
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]==arr[i]){
                j++;
            }
            else{
                sb.append(arr[i]);
                int gap=j-i;
                if(gap>1){
                    sb.append(gap);
                    
                }
                i=j;
                j++;
                
            }
        }
        sb.append(arr[i]);
        int gap=j-i;
        if(gap>1){
            sb.append(gap);
        }
        for(i=0;i<sb.length();i++){
            arr[i]=sb.charAt(i);
        }
        return sb.length();

        
    }
}