class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int total = 0;
        for(String row : bank){
            int device = 0;
            for(char c : row.toCharArray()){
                if(c == '1') device ++;
            }
            if(device > 0){
                total += prev * device;
                prev = device;
            }
        }
        return total;
    }
}