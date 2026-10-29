import java.util.ArrayList;

class New {

    //Find the duplicate elements in array
    static void checkDuplicates(int arr[]) {

        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    // Add only if the element is not already present
                    if (!newArray.contains(arr[i])) {
                        newArray.add(arr[i]);
                    }

                    break;
                }
            }
        }

        System.out.println("Duplicate elements: " + newArray);
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 50, 10, 60, 20};

        checkDuplicates(arr);
    }
}
