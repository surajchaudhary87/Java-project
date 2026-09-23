//Two sum program 
// Main method
class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8};
        TwoSum obj = new TwoSum();
        obj.twoSum(arr,9);
    }
}


class TwoSum {
    public void twoSum(int arr[], int target) {
        int n = arr.length;

        // Two Sum Logic...
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Index of sum is : " + i +" "+ j);
                    return ;
                }
            }
        }
    }
}
