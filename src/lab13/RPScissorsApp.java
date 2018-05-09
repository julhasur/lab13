package lab13;


import java.util.Scanner;

public class RPScissorsApp {
	public static void main(String[] args) {
		// prompt player to enter a name

		System.out.println("please enter name");
		
		Scanner scan = new Scanner(System.in);
		Human human=new Human();
		// get user name input
		String name = scan.nextLine();

		// prompt for oponent
		System.out.println("which opponent do you want random or Rock(1/2)?:");
		// get user input - input
		int select = scan.nextInt();

		// display players choice


		System.out.println("Rock,Papper, or Scissors?(R/P/S):");
		String rps = scan.next();
		System.out.println(rps);
		System.out.println();
		
		
		
		Random random = null;
		Rock rock;
		
	 	if(select==1) {
		                        //create a random player object
			 random= new Random();
			 System.out.println("opponents choice 1"+random);//+random.generateRoshambo());
				
		}
		else if (select==2){    
			rock= new Rock();
			System.out.println(rock.generateRoshambo());
		}
		else {
			System.out.println("wrong inpput");
			
		}
	 	
	

		//display match result
	 	if(select==1) {                      //create a random player object
			 random= new Random();
			 System.out.println("opponents choice"+random.generateRoshambo());
				
	 		
	 		
	 	}	else if (select==2){    
				rock= new Rock();
				System.out.println(rock.generateRoshambo());}
		String result = matchResult(human,random);
			
		}

	
	
	 	
		// ask user to continue
	
	

	private static String matchResult(Player player, Player player2) {
		// TODO Auto-generated method stub
	return matchResult(player2, player2);
	}


}