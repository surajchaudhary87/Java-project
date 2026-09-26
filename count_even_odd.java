// Count how many even and odd numbers are present in an array.

class Main {

    public static void main(String[] args) {

        int arr[] = {10,2,4,5,6,32,85,25,02,36,-1,45};
        
        int n = arr.length;

        int even_count = 0;
        int odd_count = 0;

        for(int i = 0; i < n; i++){
             if(arr[i] % 2 == 0){
                even_count += 1;
            }
            else{
                odd_count += 1;
            }
        }

        System.out.println("Even Number count is = " + even_count);
        System.out.println("Odd Number count is = " + odd_count);

    }
}
