class swaptemp{
	public static void main (String[]args){
		int a = 10;
		int b = 5;
		int temp = 0;
		
		System.out.println("Number for swap: a = "+a+" b = "+b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped Number : a = "+a+" b = "+b);
 }
}