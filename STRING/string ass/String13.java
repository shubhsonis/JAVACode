class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SIENTL";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (char c : str1.toCharArray()) {
            charCount[c - 'A']++;
        }

        for (char c : str2.toCharArray()) {
            charCount[c - 'A']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
