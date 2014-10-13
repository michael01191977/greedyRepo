import java.util.Scanner;


public class UserPromptCoinChange implements UserPrompt {

	public UserPromptCoinChange(){};
	
	public String promptUser(){
		String changeAmount = null;
		Scanner scanner;
		do{
			System.out.println("Please enter change amount: ");
			scanner = new Scanner(System.in);
			changeAmount = scanner.next();
		} while(!scanner.hasNextDouble() && !scanner.hasNextInt());
		
		scanner.close();
		
		return changeAmount;
	}
	
}
