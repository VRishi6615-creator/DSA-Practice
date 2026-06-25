class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int sum = 1,i = 1;
        while(i<n){
            if(ratings[i] == ratings[i-1]){
                sum += 1;
                i++;
                continue;
            }
            int peek = 1;
            while(i<n && ratings[i] > ratings[i-1]){
                peek += 1;
                sum += peek;
                i++;
            }
            int down = 1;
            while(i<n && ratings[i] < ratings[i-1]){
                sum += down;
                i++;
                down ++;
            }
            if(down > peek){
                sum += down - peek;
            }
        }
        return sum;
    }
} 
Add Candy Approach 2
