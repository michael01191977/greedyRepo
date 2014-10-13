import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreedyMain {

	public static void main(String[] args){
		
		ApplicationContext promptContext = new ClassPathXmlApplicationContext("application.xml");
		UserPrompt currencyPrompt = (UserPrompt)promptContext.getBean("currencyPrompt");
		UserPrompt coinChangePrompt = (UserPrompt)promptContext.getBean("coinChangePrompt");
		String changeList = calculateChange(currencyPrompt.promptUser(), coinChangePrompt.promptUser());
		System.out.println(changeList);
	}
	
	public static String calculateChange(String currency, String changeAmount){
		
		MoneyChanger moneyChanger = null;		
		ApplicationContext moneyContext = new ClassPathXmlApplicationContext("application.xml");
		
		switch(currency){
		case "US":
			moneyChanger = (MoneyChanger)moneyContext.getBean("moneyChangerUS");
			moneyChanger.setChangeAmount(Double.parseDouble(changeAmount));
			break;
		case "EU":
			moneyChanger = (MoneyChanger)moneyContext.getBean("moneyChangerEU");
			moneyChanger.setChangeAmount(Double.parseDouble(changeAmount));
			break;
		}
		
		return moneyChanger.changeList();		
	}
}



