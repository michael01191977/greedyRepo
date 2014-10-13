public class EUMoneyChanger implements MoneyChanger{

	private double changeAmount;
	private int twoEuroCount;
	private int oneEuroCount;
	private int fiftyCentCount;
	private int twentyCentCount;
	private int tenCentCount;
	private int fiveCentCount;
	private int twoCentCount;
	private int oneCentCount;
	
	public EUMoneyChanger(){};
	
	public EUMoneyChanger(double changeAmount){
		this.changeAmount = changeAmount;
	}
	
	public void setChangeAmount(double changeAmount){
		this.changeAmount = changeAmount;
	}
	
	public String changeList(){		
		StringBuilder coinCountList = new StringBuilder();
		calculateTwoEuroCoinCount();
		coinCountList.append(calculateTwoEuroCoins());
		calculateOneEuroCoinCount();
		coinCountList.append(", " + calculateOneEuroCoins());
		calculateFiftyCentEuroCoinCount();
		coinCountList.append(", " + calculateFiftyCentEuroCoins());
		calculateTwentyCentEuroCoinCount();
		coinCountList.append(", " + calculateTwentyCentEuroCoins());
		calculateTenCentEuroCoinCount();
		coinCountList.append(", " + calculateTenCentEuroCoins());
		calculateFiveCentEuroCoinCount();
		coinCountList.append(", " + calculateFiveCentEuroCoins());
		calculateTwoCentEuroCoinCount();
		coinCountList.append(", " + calculateTwoCentEuroCoins());
		calculateOneCentEuroCoinCount();
		coinCountList.append(", " + calculateOneCentEuroCoins());
		return coinCountList.toString();
	}
	
	private String calculateTwoEuroCoins(){
		return Integer.toString(this.twoEuroCount) + " " + grammarizeDenomination("two euro coin", this.twoEuroCount);
	}
	
	private void calculateTwoEuroCoinCount(){
		this.twoEuroCount = (int)changeAmount / 2;
	}
	
	private String calculateOneEuroCoins(){
		return Integer.toString(this.oneEuroCount) + " " + grammarizeDenomination("one euro coin", this.oneEuroCount);
	}
	
	private void calculateOneEuroCoinCount(){
		this.oneEuroCount = (int)changeAmount % 2;
	}
	
	private String calculateFiftyCentEuroCoins(){
		return Integer.toString(this.fiftyCentCount) + " " + grammarizeDenomination("fifty cent euro", this.fiftyCentCount);
	}
	
	private void calculateFiftyCentEuroCoinCount(){
		double changeAccountedFor = (double)(this.twoEuroCount * 2 + this.oneEuroCount * 1);
		int changeAccountedForWithRetainedPrecision = (int)(changeAccountedFor * 100);
		int changeNotAccountedForWithRetainedPrecision = (int)(this.changeAmount * 100) - changeAccountedForWithRetainedPrecision;
		this.fiftyCentCount = changeNotAccountedForWithRetainedPrecision / 50;
	}
	
	private String calculateTwentyCentEuroCoins(){
		return Integer.toString(this.twentyCentCount) + " " + grammarizeDenomination("twenty cent euro", this.twentyCentCount);
	}
	
	private void calculateTwentyCentEuroCoinCount(){
		double changeAccountedFor = (double)(this.twoEuroCount * 2 + this.oneEuroCount * 1);
		changeAccountedFor +=  (double)(this.fiftyCentCount * 50) / 100;
		int changeAccountedForWithRetainedPrecision = (int)(changeAccountedFor * 100);
		int changeNotAccountedForWithRetainedPrecision = (int)(this.changeAmount * 100) - changeAccountedForWithRetainedPrecision;
		this.twentyCentCount = changeNotAccountedForWithRetainedPrecision / 20;
	}
	
	private String calculateTenCentEuroCoins(){
		return Integer.toString(this.tenCentCount) + " " + grammarizeDenomination("ten cent euro", this.tenCentCount);
	}
	
	private void calculateTenCentEuroCoinCount(){
		double changeAccountedFor = (double)(this.twoEuroCount * 2 + this.oneEuroCount * 1);
		changeAccountedFor +=  (double)(this.fiftyCentCount * 50) / 100;
		changeAccountedFor +=  (double)(this.twentyCentCount * 20) / 100;
		int changeAccountedForWithRetainedPrecision = (int)(changeAccountedFor * 100);
		int changeNotAccountedForWithRetainedPrecision = (int)(this.changeAmount * 100) - changeAccountedForWithRetainedPrecision;
		this.tenCentCount = changeNotAccountedForWithRetainedPrecision / 10;
	}
		
	private String calculateFiveCentEuroCoins(){
		return Integer.toString(this.fiveCentCount) + " " + grammarizeDenomination("five cent euro", this.fiveCentCount);
	}
	
	private void calculateFiveCentEuroCoinCount(){
		double changeAccountedFor = (double)(this.twoEuroCount * 2 + this.oneEuroCount * 1);
		changeAccountedFor +=  (double)(this.fiftyCentCount * 50) / 100;
		changeAccountedFor +=  (double)(this.twentyCentCount * 20) / 100;
		changeAccountedFor +=  (double)(this.tenCentCount * 10) / 100;
		int changeAccountedForWithRetainedPrecision = (int)(changeAccountedFor * 100);
		int changeNotAccountedForWithRetainedPrecision = (int)(this.changeAmount * 100) - changeAccountedForWithRetainedPrecision;
		this.fiveCentCount = changeNotAccountedForWithRetainedPrecision / 5;
	}
	
	private String calculateTwoCentEuroCoins(){
		return Integer.toString(this.twoCentCount) + " " + grammarizeDenomination("two cent euro", this.twoCentCount);
	}
	
	private void calculateTwoCentEuroCoinCount(){
		double changeAccountedFor = (double)(this.twoEuroCount * 2 + this.oneEuroCount * 1);
		changeAccountedFor +=  (double)(this.fiftyCentCount * 50) / 100;
		changeAccountedFor +=  (double)(this.twentyCentCount * 20) / 100;
		changeAccountedFor += (double)(this.tenCentCount * 10) / 100;
		changeAccountedFor +=  (double)(this.fiveCentCount * 5) / 100;
		int changeAccountedForWithRetainedPrecision = (int)(changeAccountedFor * 100);
		int changeNotAccountedForWithRetainedPrecision = (int)(this.changeAmount * 100) - changeAccountedForWithRetainedPrecision;
		this.twoCentCount = changeNotAccountedForWithRetainedPrecision / 2;
	}
	
	private String calculateOneCentEuroCoins(){
		return Integer.toString(this.oneCentCount) + " " + grammarizeDenomination("one cent euro", this.oneCentCount);
	}
	
	private void calculateOneCentEuroCoinCount(){
		double changeAccountedFor = (double)(this.twoEuroCount * 2 + this.oneEuroCount * 1);
		changeAccountedFor +=  (double)(this.fiftyCentCount * 50) / 100;
		changeAccountedFor +=  (double)(this.twentyCentCount * 20) / 100;
		changeAccountedFor +=  (double)(this.tenCentCount * 10) / 100;
		changeAccountedFor +=  (double)(this.fiveCentCount * 5) / 100;
		changeAccountedFor +=  (double)(this.twoCentCount * 2) / 100;
		int changeAccountedForWithRetainedPrecision = (int)(changeAccountedFor * 100);
		this.oneCentCount = (int)(this.changeAmount * 100) - changeAccountedForWithRetainedPrecision;
	}
	
	private String grammarizeDenomination(String denomination, int count){
		
		if(count > 1 || count == 0){
				return denomination + "s";
		}
		else{
			return denomination;
		}
	}
}
