/**
 * 
 */
package com.LambdaExpressions;
interface Lambda{
	//void lambdaFun();
	int lambdaFun(int n);
}
/**
 * @author HP
 *
 */
//only for functional interfaces -> interface whterface which has single menthod(abstract)
public class LambdaEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda lambda = new Lambda() {

//			@Override
//			public void lambdaFun() {
//				System.out.println("Hi");
//				
//			}

			@Override
			public int lambdaFun(int n) {
				// TODO Auto-generated method stub
				System.out.println("n");
				return 2*n;
			}
			
		};
		lambda.lambdaFun(10);
		
//		Lambda lambda1 = ()->{
//				System.out.println("Hi Hello");				
//			};		
//		lambda1.lambdaFun();
		Lambda lambda1 = x->{
			System.out.println("Hi Hello"); return 2*x;				
		};	
		Lambda lambda2 = (x)->{
			System.out.println("Hi Hello");	return 2*x;			
		};
		Lambda lambda3 = (int x)->{
			System.out.println("Hi Hello");	return 2*x;
		};
		lambda1.lambdaFun(10);
		lambda2.lambdaFun(10);
		lambda3.lambdaFun(10);
	}

}
