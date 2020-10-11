import junit.framework.TestCase;

public class GradeBookTest extends TestCase {

	GradeBook gb1;
	GradeBook gb2;
	
	protected void setUp() throws Exception {
		super.setUp();

		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		gb1.addScore(50);
		gb1.addScore(25);
		gb2.addScore(75);
		gb2.addScore(100);
	}

	protected void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
		super.tearDown();
		
	}

	public void testAddScore() {
		
		assertTrue(gb1.toString().equals("50.0 25.0 "));
		assertTrue(gb2.toString().equals("75.0 100.0 "));
		assertEquals(gb1.getScoreSize(), 2);
		assertEquals(gb2.getScoreSize(), 2);
		
	}

	public void testSum() {
		
		assertEquals(gb1.sum(), 75.0, 0);
		assertEquals(gb2.sum(), 175.0, 0);
		
	}

	public void testMinimum() {
		
		assertEquals(gb1.minimum(), 25.0, 0);
		assertEquals(gb2.minimum(), 75.0, 0);
	}

	public void testFinalScore() {
		assertEquals(gb1.finalScore(), 50.0 , 0);
		assertEquals(gb2.finalScore(), 100.0, 0);
	}

	public void testGetScoreSize() {
		fail("Not yet implemented");
	}

	public void testToString() {
		fail("Not yet implemented");
	}

}
