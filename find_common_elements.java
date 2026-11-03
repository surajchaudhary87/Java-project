class Main {

    //Function to find common elements in two arrays
    static void commonElements(int arr1[], int arr2[]){
        System.out.println("Common elements:");

        for(int i = 0; i < arr1.length; i++){

            boolean found = false;

            // Check whether element exists in arr2
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            // Check whether element appeared previously in arr1
            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++){
                if(arr1[i] == arr1[k]){
                    alreadyPrinted = true;
                    break;
                }
            }

            if(found && !alreadyPrinted){
                System.out.print(arr1[i] + " ");
            }
        }
    }

    public static void main(String[] args){

        int arr1[] = {10, 20, 10, 30, 40, 20, 50};
        int arr2[] = {10, 20, 30, 40, 55, 80, 90};

        commonElements(arr1, arr2);
    }
}
