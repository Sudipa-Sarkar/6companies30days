class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ans = 0, product = 1;
        for (int l = 0, r = 0; r<n; r++) {
            product*=nums[r];
            while (product>=k && l<=r) {
                product/=nums[l];
                l++;
            }
            ans+=(r-l+1);
        }
        return ans;
    }
}
