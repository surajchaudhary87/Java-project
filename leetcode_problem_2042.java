class Solution {
    public boolean areNumbersAscending(String s) {

        int a = 0;

        for (String word : s.split(" ")) {

            // Check if word is a number
            if (word.charAt(0) >= '0' && word.charAt(0) <= '9') {

                int b = Integer.parseInt(word);

                if (b <= a) {
                    return false;
                }

                a = b;
            }
        }

        return true;
    }
}
