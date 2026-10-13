class Main {

    //Elements present in even index
    static void evenNum(int arr[]) {
        
        System.out.println("Elements present at even indexes: ");

        for(int i = 0; i < arr.length; i+=2){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    //Elements present in odd index
    static void oddNum(int arr[]) {
        
        System.out.println("Elements present at odd indexes: ");

        for(int i = 1; i < arr.length; i+=2){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        evenNum(arr);
        oddNum(arr);

    }
}
