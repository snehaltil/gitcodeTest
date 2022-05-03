package SampleJavaProgram;

public class SodAndRevNum {

	public static void main(String[] args) {
		
	int num = 371;  //  3 7 1 
	int num1 = num;
	int armstrnum = 0, rem;
	
	while(num1>0) { // 1+  27 + 343 == 371   
		
		rem = num1%10; // 1 7 3
		armstrnum = armstrnum + (rem*rem*rem); //  1 = 0+343 = 343+27 = 370
		num1 = num1/10; // 37 3 0
	}
	if (armstrnum == num) {
		System.out.println("armtstrong no =" + armstrnum);
	}
	else
	{
		System.out.println("not armstrong no =" + armstrnum);
	}
		
	}
}


