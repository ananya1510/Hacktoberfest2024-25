class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxi=0;

        while(l<r)
        {
            int area=(r-l)* Math.min(height[l],height[r]);
            maxi=Math.max(maxi,area);
            if(height[l]<height[r]){l++;}
            else{r--;}
        }
        return maxi;
    }
}
