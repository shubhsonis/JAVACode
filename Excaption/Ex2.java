class Excep {
	public int m1() {
		try {
		return 100;
		}
		catch(Exception e) {
		return 200;
		}
		finally{
			return 300;
		}
	}
}
class Main {
	public static void main(String args[]) {
		Excep obj = new Excep();
		obj.m1();
	}
}