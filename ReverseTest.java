import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		Reverse r=new Reverse();
		String result=r.SentenceReverse("I am a student from NEU");
		// can you re-factor your algorithm for this question?
		// I don't think padding a space at the head is what we want.
		assertEquals(" NEU from student a am I",result);
	}

}
