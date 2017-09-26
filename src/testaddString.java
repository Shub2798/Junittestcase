import static org.junit.Assert.*;

import org.junit.Test;


public class testaddString {

	@Test
	public void test() {
		test tst=new test();
		String res=tst.addstring("Hello"," world");
		assertEquals(res,"Hello world");
	}
	

}
