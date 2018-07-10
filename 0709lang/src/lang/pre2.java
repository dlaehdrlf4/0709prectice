// 

package lang;

public class pre2 {

	public static void main(String[] args) {
		int i ,j;
		for(i=1; i<=5; i= i+1) {
			if(i<=3){
			for(j=1;j<=4-i;j=j+1) {
				System.out.print("*");
			} 
			System.out.println("");
		}	else {
			
				for(j=1;j<=i-2;j=j+1) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}

}

