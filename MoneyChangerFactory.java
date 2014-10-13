public class MoneyChangerFactory {
	
	public MoneyChangerFactory(){};
	
	public MoneyChanger changeInEuros(){
		return new EUMoneyChanger(0.00);
	}
	
	public MoneyChanger changeInDollars(){
		return new USMoneyChanger(0.00);
	}
	
	
}
