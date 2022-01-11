import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		String Name;
		int Age;
		int Month;
		int Day;
		int Year;
		double Dollar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?"); 
		Name = sc.nextLine();
		System.out.println("How old are you?"); 
		Age = sc.nextInt();
		System.out.println("What month were you born in (1-12)?"); 
		Month = sc.nextInt();
		System.out.println("What day were you born on (0-31)?"); 
		Day = sc.nextInt();
		System.out.println("What year were you born in?"); 
		Year = sc.nextInt();
		System.out.println("How much money do you want?");
		Dollar = sc.nextDouble();
		
		System.out.println("Your name is " + Name + " and you were born on " + Month + "/" + Day + "/" + Year + " .");
		System.out.println("You are " + Age + " years old!!!");
		System.out.println("You now have $" + Dollar + " in your account.");





	}
}
