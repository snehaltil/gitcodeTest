class str{

	public static void main(String[] args) {
	
	// largest no among 2 without if	
	/*	
	int n1 = 33 ,n2 = 55, n3; // result
	
	
//	res = if true ? op : else part     
	n3 = (n1 > n2) ? n1 : n2;  // condition n1>n2 if yes then n1 else n2
	
	System.out.println("LARGEST NO IS :" +n3); */
		
		
	/// count of upper and lower char in string	
	
	String s = "InternaL mOCK GROUP";    
	char[] st = s.toCharArray();
	int cUP = 0, clow=0;
	for (int i = 0; i < st.length; i++) {
		
		if (st[i] >='A' && st[i] <='Z') {
			cUP++; 
		}
		else if (st[i] >='a' && st[i] <='z'){
			clow++;
		}
	}
		System.out.println("Upper char count is :" +cUP);
		System.out.println("Lower char count is :" +clow);
	}

}
