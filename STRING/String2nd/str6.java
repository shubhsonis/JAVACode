// 6. Write a Java program to compare two strings lexicographically , ignoring case differences
class StrIgnoreLexicographically {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "Listen";

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        boolean flag = false;
        if (ch1.length == ch2.length) {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == ch2[i])
                    flag = true;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(flag);
            else
                System.out.println(flag);
        } else
            System.out.println(flag);
    }
}
