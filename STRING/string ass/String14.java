//14. WAP check if a String contains only digits?
class Str14 {
	public static boolean onlyDigits(char arr[]) {
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >'0' && arr[i] <'9') {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
				return flag;
	}
	public static void main(String args[]) {
		String str = "12364";
		char ch[] = str.toCharArray();
		onlyDigits(ch);
		System.out.println(onlyDigits(ch));
	}
}