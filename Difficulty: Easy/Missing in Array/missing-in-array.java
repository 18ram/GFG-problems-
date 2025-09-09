class Solution {
    int missingNum(int arr[]) {
        int ans = 0;
        int n = 1;
        for(int i = 0; i < arr.length; i++){
            ans ^= n ^ arr[i];
            n++;
        }
        ans^=n;
        return ans;
    }
}