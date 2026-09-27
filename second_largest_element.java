// Finding second largest element 
class SecondLargest {

    int second_Largest(int arr[]){
        int n = arr.length;

        int largest = arr[0];

        // Find largest
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        
        // Find largest element smaller than largest
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < largest && arr[i] > second_largest){
                second_largest = arr[i];
            }
        }

        return second_largest;
    }

}

class Main {
    public static void main(String[] args) {
        int arr[] = {10,20,7,50,39,45,10,35};
        SecondLargest obj = new SecondLargest();
        obj.second_Largest(arr);
    }
}
