//Find the sum of all elements in an array.
class Main {

    static int elementsSum(int arr[]){

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,1,2,3,4,5,10,8,34,42,4};
        int sum = elementsSum(arr); 

        System.out.println("Sum of all elements: " + sum);
    }
}
