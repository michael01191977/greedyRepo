import java.util.Scanner;


public class UserPromptCurrency implements UserPrompt {

	public UserPromptCurrency(){};
	
	public String promptUser(){
		String currency = null;
		Scanner scanner;
		do{
			System.out.println("Please enter currency (US or EU): ");
			scanner = new Scanner(System.in);
			currency = scanner.next();
		} while(!currency.equals("EU") && !currency.equals("US"));
				
		return currency;
	}
}
