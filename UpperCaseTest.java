import static org.junit.Assert.*;

import org.junit.Test;

public class UpperCaseTest {

	@Test
	public void test() {
		UpperCase uc=new UpperCase();
		String result=uc.ctoUpperCase("we love seattle and will live here for a long time.");
		assertEquals("We Love Seattle And Will Live Here For A Long Time.",result);
	}

}
