// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:
// DATE:

public class Main
{

	/**
	 * ALGORITHM:
	 * - Add total funds to taco stand
	 * - Order supplies
	 * - Print status of stand (when it opens)
	 * - Print welcome message
	 * - Take customer order
	 * - Print status of stand (when its closed)
	 */
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		TacoStand.initialize();

		//INPUT + CALCULATION + OUTPUT SECTION
		TacoStand.addTotalFunds(20);
		TacoStand.orderSupplies(15);

		System.out.println("OPENING UP THE STAND...");
		System.out.println( TacoStand.getStatus() +"\n\n");

		Main.printWelcome();
		System.out.println("\n");
		
		Main.takeOrder();
		//call takeOrder more times if you'd like! (once everything works once though!)

		System.out.println("--------CART IS CLOSED---------\n\n" + TacoStand.getStatus());
	}

	/**
	 * Outputs welcome message to start program that user sees
	 */
	public static void printWelcome()
	{
		UtilityBelt.printCentered(50, "Welcome to MCC Taco Stand!");
		UtilityBelt.printCentered(50, "┈┈┈┈╭╯╭╯╭╯┈┈┈┈┈");
		UtilityBelt.printCentered(50, "┈┈┈╱▔▔▔▔▔╲▔╲┈┈┈");
		UtilityBelt.printCentered(50, "┈┈╱┈╭╮┈╭╮┈╲╮╲┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈▂▂▂▂▂┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈╲▂▂▂╱┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈╲▂▂▂▂▂▂▂▂╲╱┈┈");
		//ascii art credit:
		//https://mizbizbby.tumblr.com/post/12937794639/happy-taco-ascii-art-for-taco-thursday
	}
	
	/**
	 * Prints menu and prompts user for input for kind of taco and number in order. If tacos are available,
	 * will update total funds and confirm order with user, otherwise error message given
	 */
	public static void takeOrder()
	{
		//DECLARATION + INITIALIZATION SECTION
		int option, numTacosOrdered;
		boolean tacosAvailable;

		//INPUT SECTION
		TacoStand.printMenu();
		option = UtilityBelt.readInt("Enter choice> ", 1, 4);
		numTacosOrdered = UtilityBelt.readInt("Enter number of tacos you want> ", 1, 50);

		//CALCULATION + OUTPUT SECTION
		tacosAvailable = TacoStand.areTacosAvailable(option, numTacosOrdered);
		if(tacosAvailable)
		{
			TacoStand.updateTotalFunds(option, numTacosOrdered);
			Main.printConfirmation(numTacosOrdered);
		}
		else
		{
			System.out.println("We don't have that many tacos, sorry! Try again :(");
		}
	}

	/**
	 * Prints confirmation message that varies based on number of tacos in order
	 * 
	 * @param numTacos
	 */
	public static void printConfirmation(int numTacos)
	{
		System.out.println("Here you go, buen provecho!");
		if(numTacos >= 1)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 2)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 3)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 4)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 5)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 6)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 7)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 8)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 9)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 10)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 11)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 12)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 13)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 14)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 15)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 16)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 17)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 18)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 19)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 20)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 21)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 22)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 23)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 24)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 25)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 26)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 27)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 28)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 29)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 30)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 31)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 32)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 33)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 34)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 35)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 36)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 37)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 38)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 39)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 40)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 41)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 42)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 43)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 44)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 45)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 46)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 47)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 48)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 49)
		{
			System.out.print("🌮");
		}
		if(numTacos >= 50)
		{
			System.out.print("🌮");
		}
		System.out.println();
		System.out.println();
	}
}
