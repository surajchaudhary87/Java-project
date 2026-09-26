// Counting how many positive, negative, and zero elements are present in an array.

class Logic {

    void count(int arr[]){

        int n = arr.length;
        int positive = 0, negative = 0, zero = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                positive++;
            }
            else if(arr[i] < 0){
                negative++;
            }
            else{
                zero++;
            }
        }

        System.out.println("Positive Number count: " + positive);
        System.out.println("Negative Number count: " + negative);
        System.out.println("Zero count: " + zero);
    }
}

class Main {
    public static void main(String[] args) {

        int arr[] = {10, -5, 0, 7, -2, 0, 15, -8};
        Logic obj = new Logic();
        obj.count(arr);

    }
}
