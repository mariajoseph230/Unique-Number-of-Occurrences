class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Arrays.sort(arr);
        
        int count =1;
        ArrayList<Integer> hs =new ArrayList<>();
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]==arr[i-1]){
                count++;
            }    
                else{
                    if(hs.contains(count)){
                        return false;
                    }
                    hs.add(count);
                    count=1;
                }
            if(arr.length -1 ==i){
                if(hs.contains(count)){
                        return false;
                    }
                hs.add(count);
            }           
        }
        
        return true;
    }
}
