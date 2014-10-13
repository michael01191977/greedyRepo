import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class GreedyTest {
	
	@Test
	public void dollarNinetyNineMeansOneDollar(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("US", "1.99");
		
		assertEquals("1 dollar", coinMessage.substring(0, 8));
	}
	
	@Test
	public void dollarNinetyNineMeansThreeQuarters(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("US", "1.99");
		
		assertEquals("3 quarters", coinMessage.substring(10,20));
		
	}
	
	@Test
	public void dollarNinetyNineMeansTwoDimes(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("US", "1.99");
		
		assertEquals("2 dimes", coinMessage.substring(22,29));
	}
	
	@Test
	public void dollarNinetyNineMeansZeroNickels(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("US", "1.99");
		
		assertEquals("0 nickels", coinMessage.substring(31,40));
	}
	
	@Test
	public void dollarThirtyMeansOneNickel(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("US", "1.30");
		
		assertEquals("1 nickel", coinMessage.substring(30,38));
	}
	
	@Test
	public void dollarNinetyNineMeansFourPennies(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("US", "1.99");
		
		assertEquals("4 pennies", coinMessage.substring(42));
	}
	
	@Test
	public void ThreeEightyEightMeansOneTwoEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");
		
		assertEquals("1 two euro coin", coinMessage.substring(0,15));
	}
	
	@Test
	public void ThreeEightyEightMeansOneOneEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");
		
		assertEquals("1 one euro coin", coinMessage.substring(17,32));
	}
	
	@Test
	public void ThreeEightyEightMeansOneFiftyCentEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");
		
		assertEquals("1 fifty cent euro", coinMessage.substring(34,51));
	}
	
	@Test
	public void ThreeEightyEightMeansOneTwentyCentEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");
		
		assertEquals("1 twenty cent euro", coinMessage.substring(53,71));
	}
	
	@Test
	public void ThreeEightyEightMeansOneTenCentEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");

		assertEquals("1 ten cent euro", coinMessage.substring(73,88));
	}
	
	@Test
	public void ThreeEightyEightMeansOneFiveCentEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");

		assertEquals("1 five cent euro", coinMessage.substring(90,106));
	}
	
	@Test
	public void ThreeEightyEightMeansOneTwoCentEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");

		assertEquals("1 two cent euro", coinMessage.substring(108,123));
	}
	
	@Test
	public void ThreeEightyEightMeansOneOneCentEuroCoin(){
		GreedyMain greedymain = new GreedyMain();
		
		String coinMessage = greedymain.calculateChange("EU", "3.88");

		assertEquals("1 one cent euro", coinMessage.substring(125));
	}
}
