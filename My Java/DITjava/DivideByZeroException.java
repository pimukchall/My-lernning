class DivideByZeroException {

	public static void main(String[] args){

		int a = 100,b=0;

	try{

		System.out.println("a/b is" + a/b);

	}

	catch(ArithmeticException e){
	 System.out.println("This line will not printed");
	 return;
	}

	}

	
}
