class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        
        for(int i=0;i<n;i++) {
            int tmp = 1 << i;
            int size = result.size();
            for(int j = size-1;j>=0;j--) {
                result.add(result.get(j) | tmp);
            }
        }
        
        return result;
    }
}