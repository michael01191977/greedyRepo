public class USMoneyChanger implements MoneyChanger {
	
	private double changeAmount;
	
	public USMoneyChanger(){};
	
	public USMoneyChanger(double changeAmount){
		this.changeAmount = changeAmount;
	}
	
	public void setChangeAmount(double changeAmount){
		this.changeAmount = changeAmount;
	}
	
	public String changeList(){		
		StringBuilder coinCountList = new StringBuilder();
		coinCountList.append(calculateDollars());
		coinCountList.append(", " + calculateQuarters());
		coinCountList.append(", " + calculateDimes());
		coinCountList.append(", " + calculateNickels());
		coinCountList.append(", " + calculatePennies());
		return coinCountList.toString();
	}
	
	private String calculateDollars(){
		int dollarCount = calculateDollarCount();
		String denomination = grammarizeDenomination("dollar", dollarCount);
		return Integer.toString(dollarCount) + " " + denomination;
	}
	
	private int calculateDollarCount(){
		return (int)changeAmount;
	}
	
	private String calculateQuarters(){
		int quarterCount = calculateQuarterCount();
		String denomination = grammarizeDenomination("quarter", quarterCount);
		return Integer.toString(quarterCount) + " " + denomination;
	}
	
	private int calculateQuarterCount(){
		return (int)((changeAmount % calculateDollarCount()) * 100) / 25;
	}
	
	private String calculateDimes(){
		int dimeCount = calculateDimeCount();
		String denomination = grammarizeDenomination("dime", dimeCount);
		return Integer.toString(dimeCount) + " " + denomination;
	}
	
	private int calculateDimeCount(){
		return (int)((changeAmount % (double)calculateDollarCount()) * 100 - (25 * calculateQuarterCount())) / 10;
	}
	
	private String calculateNickels(){
		int nickelCount = calculateNickelCount();
		String denomination = grammarizeDenomination("nickel", nickelCount);
		return Integer.toString(nickelCount) + " " + denomination;
	}
	
	private int calculateNickelCount(){
		return (int)((changeAmount % (double)calculateDollarCount()) * 100 - (25 * calculateQuarterCount()) - (10 * calculateDimeCount())) / 5;
	}

	private String calculatePennies(){
		int pennyCount = calculatePennyCount();
		String denomination = grammarizeDenomination("penny", pennyCount);
		return Integer.toString(pennyCount) + " " + denomination;
	}
	
	private int calculatePennyCount(){
		return (int)((changeAmount % (double)calculateDollarCount()) * 100 - (25 * calculateQuarterCount()) - (10 * calculateDimeCount()) - (5 * calculateNickelCount()));
	}
	
	private String grammarizeDenomination(String denomination, int count){
		
		if(count > 1 || count == 0){
			if(denomination.equals("penny")){
				return "pennies";
			}
			else{
				return denomination + "s";
			}
		}
		else{
			return denomination;
		}
	}
}
