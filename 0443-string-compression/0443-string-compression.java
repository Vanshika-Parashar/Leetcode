class Solution {
    public int compress(char[] arr) {
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            int count=0;
            while(i<arr.length && arr[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                arr[idx++]=ch;
            }
            else{
                arr[idx++]=ch;
                String s=Integer.toString(count);
                for(char c:s.toCharArray()){
                    arr[idx++]=c;
                }
            }
            i--;
        }
        return idx;

    }
}