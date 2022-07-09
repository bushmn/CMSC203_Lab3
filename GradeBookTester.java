import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester {
	
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	public void setUp() throws Exception 
	{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(30);
		g1.addScore(60);
		g2.addScore(90);
		g2.addScore(120);
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() 
	{
		assertTrue(g1.toString().equals("30.0 60.0 "));
		assertTrue(g2.toString().equals("90.0 120.0 "));
	}

	@Test
	public void testSum() {
		assertEquals(90, g1.sum(), .0001);
		assertEquals(210, g2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(30, g1.minimum(), .001);
		assertEquals(90, g2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(60, g1.finalScore(), .0001);
		assertEquals(120, g2.finalScore(), .0001);
	}

}
