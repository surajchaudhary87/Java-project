// Finding unique elements count in a sorted array
public class Main {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4};

        Unique obj = new Unique();
        obj.uniqueElement(arr);
    }
}

class Unique {

    public void uniqueElement(int arr[]) {

        int i = 0;
        int j = 1;
        int n = arr.length;

        while (j < n) {

            if (arr[i] == arr[j]) {
                j++;
            } 
            else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Unique elements count is: " + (i + 1));
    }
}
