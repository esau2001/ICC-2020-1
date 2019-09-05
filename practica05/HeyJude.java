public class HeyJude {

	public static void main(String[] args) {

		String hey = "hey Jude";

		String dt = "don't";
		String make = "make it bad";
		String take = "take a sad a song and make it better";
		String be = "be afraid";
		String were = "you were made to go out and get her";
		String leet = "let me down";
		String you = "you have found her, now go and get her";

		String remember = "remember to";
		String let = "let her into you heart";
		String her = "let her under your skin";

		String then = "then you";
		String can = "can start";
		String beg = "begin";
		String to = "to make it better";

		String bet = "better";
		String wa = "waaa";
		String na = "na";

		int p = 0; 
		while (p<7) {
			if (p==0 || p==1 || p==3 || p==5){
				System.out.print(hey);
				System.out.print(" "); 
				System.out.print(dt);
				System.out.print(" ");
				System.out.println(remember);
				System.out.println(" ");  
				System.out.println(then); 
				System.out.println(" "); 
				System.out.print(to); 
				System.out.print(" ");   

			}

			if (p==0 || p==5){
				System.out.print(make);
				System.out.print(" "); 
				System.out.println(take);
				System.out.println(" ");
			}


			if (p==0 || p==3){
				System.out.print(let);
				System.out.print(" ");
				System.out.print(can);
				System.out.print(" ");


			}


			if (p==1){
				System.out.print(be);
				System.out.print(" ");
				System.out.println(were);
				System.out.println(" ");
			}



			if (p==1 || p==5){
				System.out.print(her);
				System.out.print(" ");
				System.out.print(beg);
				System.out.print(" ");
			}

			if (p==3){
				System.out.print(leet);
				System.out.print(" ");
				System.out.println(you);
				System.out.println(" ");
			}
int n = 0; 

		if (p==2 || p==4 || p==6){while (n<10){
			System.out.print(na);
			System.out.print(" ");
n++; 
		}

			
		}
		if (p==5){while (n<10){
			System.out.print(bet); 
			System.out.print(" ");
n++;
		}
			System.out.print(wa);
			System.out.print(" ");
			
		}

		if (p==6){while (n<10){
			System.out.print(hey);
			System.out.print(" ");
n++;
		}
			
		}

		p++;

		}


	}

}
