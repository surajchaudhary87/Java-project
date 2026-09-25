class Main {

    static void linear_search(int arr[],int key) {
        int size = arr.length;

        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                System.out.println("Element found at position : " + (i+1));
                return;
            }
        }
        System.out.println("Element not found ");
    }

    public static void main(String[] args) {
       int arr[] = {10,20,30,40,5,-1,50,150,-12};
       linear_search(arr, 50);
    }
}
