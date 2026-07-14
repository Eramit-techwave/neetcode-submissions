class Solution {
    public int[] sortArray(int[] nums) {
        // Arrays.sort(nums);
        // return nums;
        mergeSort(nums, 0, nums.length - 1);
            return nums;
    }
        
        void mergeSort(int nums[], int low, int high){
            if (low == high){
                return;
            }
            int mid = (low + high) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, high, mid);

        }
        void merge(int nums[], int low, int high, int mid){
            int i = low, j = mid+1, k =0;
            int result[] = new int[high - low + 1];


            while(i <= mid && j <= high){
                if(nums[i] < nums[j]){
                    result[k] = nums[i];
                    k++;
                    i++;
                }else{
                    result[k] = nums[j];
                    k++;
                    j++;
                }
            }
            while( i <= mid){
                result[k] = nums[i];
                k++;
                i++;
            }
            while(j <= high){
                result[k] = nums[j];
                j++;
                k++;
            }

        // }
        int trace = 0;

        // for storing our result into a single array we have to copy the result value to oour final result
        // low = 4, high = 7;
        // result = 7 8 11 9;
        for(int s = low; s <= high; s++){
            nums[s] = result[trace];
            trace ++;

        }
    }
}