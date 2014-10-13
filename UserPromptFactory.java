
public class UserPromptFactory {

	public UserPromptFactory(){};
	
	public UserPrompt coinChangePrompt(){
		return new UserPromptCoinChange();
	}
	
	public UserPrompt currencyPrompt(){
		return new UserPromptCurrency();
	}
	
}
