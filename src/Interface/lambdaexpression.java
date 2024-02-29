package Interface;

public class lambdaexpression  extends odinarywithoutlambda implements java8interface{
	
	
	
//	 ()-> {
//		
//		System.out.println("Hello Printer");
//	}
	
	
	//
	
	public static void main(String[] args) {
			
		java8interface ja=new lambdaexpression();
		ja.green();
		
		
		java8interface jr=new odinarywithoutlambda();
		jr.green();
		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("hello green G");
	}
	
	

}
