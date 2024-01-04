
class IBE extends Exception {
	public IBE() {
		super("Insufficient Balance Exception");
	}
}
class SBI {
	public void withdrow(int amount) throws IBE {
		if(amount>10000) 
			throw new IBE();
		System.out.println("Withdraw success ");
	}
}

class Main {
	public static void main(String args[] ) throws IBE  {
		SBI obj = new SBI();
		obj.withdrow(100000);
	}
}