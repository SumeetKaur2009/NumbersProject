import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberWordsTest {
	private NumberWords numberwords;
	
	@Before
	public void setUp() {
		numberwords = new NumberWords();
		}

	@Test
	public void testforOne() {
		System.out.println(numberwords.convert(1));
		Assert.assertEquals("1", "One", numberwords.convert(1));
	}
	@Test
	public void testforOnehundred() {
		System.out.println(numberwords.convert(500));
		Assert.assertEquals("500", "Five Hundred", numberwords.convert(500));
	}
	@Test
	public void testforSevenhundredandeightysix() {
		System.out.println(numberwords.convert(786));
		Assert.assertEquals("786", "Seven Hundred Eighty Six", numberwords.convert(786));
	}
	@Test
	public void testforInvalid() {
		System.out.println(numberwords.convert(-1));
		Assert.assertEquals("-1", "Invalid Number", numberwords.convert(-1));
	}
}
