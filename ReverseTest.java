import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		Reverse r=new Reverse();
		String result=r.SentenceReverse("I am a student from NEU");
		assertEquals(" NEU from student a am I",result);
	}

}
