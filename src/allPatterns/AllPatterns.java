package allPatterns;

import java.util.Scanner;

class Pattern1{
	void show(int n) {
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf(" *");
			}
			System.out.println();
		}
	}
}

class Pattern2{
	
	void show(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf(" %d",j);
			}
			System.out.println();
		}
	}
}

class Pattern3{
	
	void show(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf(" %d",i);
			}
			System.out.println();
		}
	}
}

class Pattern4{
	
	void show(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.printf(" *");
			}
			System.out.println();
		}
	}
}

class Pattern5{
	
	void show(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.printf(" %d",j);
			}
			System.out.println();
		}
	}
}

class Pattern6{
	
	void show(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				
				System.out.printf("   ");
			}
			for(int j=0;j<=i;j++) {
				System.out.printf(" * ");
			}
			System.out.println();
		}
	}
}

class Pattern7{
	
	void show(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				
				System.out.printf(" ");
			}
			for(int j=0;j<(2*i)+1;j++) {
				System.out.printf("*");
			}
			for(int j=0; j<n-i-1; j++) {
				System.out.printf(" ");
			}
			System.out.println();
		}
	}
}

class Pattern8{
	
	void show(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				
				System.out.printf("  ");
			}
			for(int j=0; j<(2*i)+1; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
	}
}

class Pattern9{
	
	void show(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				
				System.out.printf("  ");
			}
			for(int j=0; j<(2*n-(2*i+1)); j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
	}
}

class Pattern10{
	
	void show(int n) {
		for(int i=1; i<=2*n-1; i++) {
			int stars=i;
			if(i>n) {
				stars=(2*n)-i;
			}
			for(int j=1; j<=stars; j++) {
				
				System.out.printf("* ");
			}
			System.out.println();
		}
	}
}

class Pattern11{
	int num=1;
	void show(int n) {	
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				num=1;
			}
			else {
				num=0;
			}
			for(int j=0; j<=i; j++) {
				System.out.printf("%d ",num);
				num=1-num;
			}
			System.out.println();
		}
	}
}

class Pattern12{
	int num=1;
	void show(int n) {	
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ",j);
			}
			
			for(int j=1; j<=2*(n-i); j++) {
				System.out.printf("  ");
			}
			
			for(int j=i; j>=1; j--) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}
	
	/*====================================================*/
	
//	for(int i=1; i<=n; i++) {
//		
//		for(int j=1; j<=i; j++) {
//			
//			System.out.printf("* ");
//		}
//		for(int j=0; j<(2*n)-(2*i); j++) {
//			
//			System.out.printf("  ");
//		}
//		for(int j=1; j<=i; j++) {
//			
//			System.out.printf("* ");
//		}
//		System.out.println();
//	}
}


class Pattern13{
	int num=1;
	void show(int n) {	
		int num=1;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ",num++);
				
			}
			System.out.println();
		}
	}
}

class Pattern14{
	void show(int n) {	
		for(int i=1; i<=n; i++) {
			char ch='A';
			for(int j=1; j<=i; j++) {
				System.out.printf("%c ",ch++);
			}
			System.out.println();
		}
	}
}

class Pattern15{
	
	void show(int n) {	
		for(int i=1; i<=n; i++) {
			char ch='A';
			for(int j=0; j<=n-i; j++) {
				
				System.out.printf("%c ",ch++);
			}
			System.out.println();
		}
	}
}

class Pattern16{
	
	void show(int n) {	
		char ch='A';
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.printf("%c ",ch);
			}
			System.out.println();
			ch++;
		}
	}
}

class Pattern17{
	
	void show(int n) {	
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n-i; j++) {
				
				System.out.printf("  ");
			}
			char ch='A';
			int bp=(2*i+1)/2;
			for(int j=1; j<=(2*i)+1; j++) {
				System.out.printf("%c ",ch);
				if(j<=bp) {
					ch++;
				}
				else {
					ch--;
				}
			}
			System.out.println();
		}
	}
}

class Pattern18{
	
	void show(int n) {	
		for(int i=0; i<n; i++) {
			
			for(char ch=(char)('E'-i) ; ch<='E'; ch++) {
				
				System.out.printf("%c ",ch);
			}
			System.out.println();
		}
	}
}

class Pattern19{
	
	void show(int n) {
		//upper part
		int spaces=0;
		for(int i=0; i<n; i++) {
			
			for(int j=1; j<=n-i; j++) {
				
				System.out.printf("* ");
			}
			for(int j=0; j<spaces; j++) {
				System.out.printf("  ");
			}
			for(int j=1; j<=n-i; j++) {
				
				System.out.printf("* ");
			}
			System.out.println();
			spaces+=2;
		}
		
		//lower part
//		int space1=8;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.printf("* ");
			}
			for(int j=0; j<(2*n)-(2*i); j++) {
				
				System.out.printf("  ");
			}
			for(int j=1; j<=i; j++) {
				
				System.out.printf("* ");
			}
			System.out.println();
//			space1-=2;
		}
	}
}

class Pattern20{
	
	void show(int n) {	
		int space=2*n-2;
		for(int i=1; i<=2*n-1; i++) {
			
			int star=i;
			if(i>n) {
				star=2*n-i;
			}
			//stars
			for(int j=1; j<=star; j++) {
				
				System.out.printf("*");
			}
			//spaces
			for(int j=1; j<=space; j++) {
				System.out.printf(" ");
			}
			//stars
			for(int j=1; j<=star; j++) {
				System.out.printf("*");
			}
			if(i<n) {
				space-=2;
			}
			else {
				space+=2;
			}
			System.out.println();
		}
	}
}

class Pattern21{
	
	void show(int n) {	
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(i==0||j==0||i==n-1||j==n-1) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}


public class AllPatterns {

	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Number of Patterns:- ");
		Pattern1 p1=new Pattern1();
		Pattern2 p2=new Pattern2();
		Pattern3 p3=new Pattern3();
		Pattern4 p4=new Pattern4();
		Pattern5 p5=new Pattern5();
		Pattern6 p6=new Pattern6();
		Pattern7 p7=new Pattern7();
		Pattern8 p8=new Pattern8();
		Pattern9 p9=new Pattern9();
		Pattern10 p10=new Pattern10();
		Pattern11 p11=new Pattern11();
		Pattern12 p12=new Pattern12();
		Pattern13 p13=new Pattern13();
		Pattern14 p14=new Pattern14();
		Pattern15 p15=new Pattern15();
		Pattern16 p16=new Pattern16();
		Pattern17 p17=new Pattern17();
		Pattern18 p18=new Pattern18();
		Pattern19 p19=new Pattern19();
		Pattern20 p20=new Pattern20();
		Pattern21 p21=new Pattern21();
		int num=k.nextInt();
		System.out.println("Enter number of pattern:- ");
		
		for(int i=0; i<num; i++) {
			int n=k.nextInt();
			// just change the class,
            // and u get different Patterns...
			p21.show(n);		                         
		}
	}
}



