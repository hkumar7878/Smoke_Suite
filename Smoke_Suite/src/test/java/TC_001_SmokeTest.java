import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_SmokeTest {
	
	@Test
	public void smokeTest()
	{
		Assert.assertEquals(true, false);
	}

}
