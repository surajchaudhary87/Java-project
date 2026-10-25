class Main {
    
    //Count the frequency of a given element
    static int frequency(int arr[], int element){

        int frequency = 0;

        //Check every elements in array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                frequency += 1;
            }
        }

        //Return the frequency
        return frequency;
    }


    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,1,3,5,10,15,215,61,16,25,2};
        int frequency = frequency(arr, 01);
        System.out.println("Frequency of 1 = "+ frequency);
    }
}
