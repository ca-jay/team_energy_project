import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Test;

class energyTest {
	public static Questions questions = new Questions();

	@Test
	void testYes(){
		
		questions.setUserName("yes");
		assertEquals("yes", questions.getUserName(), "test yes");
		
	}
	
	@Test
	void testNo() {
		
		questions.setUserName("no");
		assertEquals("no", questions.getUserName(), "test no");

		
	}


}
