package arraylists;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runners.Parameterized.Parameters;

public class ArrayIntListTest {

	private Collection collection;
	 
	private int number;
	 
	 //public  void ArrayIntListTest(int number) {
	//   this.number = number;
	// }

	 @Parameters
	 public static Collection<Object[]> data() {
	   Object[][] data = new Object[][] { { 1 }, { 2 }, { 3 }, { 4 } };
	   return Arrays.asList(data);
	 }

	 @Test
	 public void pushTest() {
	   System.out.println("Parameterized Number is : " + number);
	 }
	 
	 
    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("@AfterClass - oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
        collection = new ArrayList();
        System.out.println("@Before - setUp");
    }
 
    @After
    public void tearDown() {
        collection.clear();
        System.out.println("@After - tearDown");
    }
 
    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
        System.out.println("@Test - testEmptyCollection");
    }
 
    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
        System.out.println("@Test - testOneItemCollection");
    }
    
    @Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
    	System.out.println("@Test - ArithmeticException");
	  int i = 1/0;
	}  
    
    @Ignore("Not Ready to Run")  
	@Test
	public void divisionWithExceptions() {  
	  System.out.println("Method is not ready yet");
	//  int i = 1/0;
	}  
    
    @Test(timeout = 1000)  
	public void infinity() {  
		while (true);  
	}  
    
    
    
    
    
  /*  
	@Test
	public void testIndexOf() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAddInt() {
	//	fail("Not yet implemented");
	}

	
	@Test
	public void testAddAndGet1() {
	    ArrayIntList list = new ArrayIntList();
	    list.add(42);
	    list.add(-3);
	    list.add(17);
	    list.add(99);
	    assertEquals(42, list.get(0));
	    assertEquals(-3, list.get(1));
	    assertEquals(17, list.get(2));
	    assertEquals(99, list.get(3));

	    assertEquals("second attempt", 42, list.get(0));   // make sure I can get them a second time
	    assertEquals("second attempt", 99, list.get(3));
	}

	@Test
	public void testSize1() {
	    ArrayIntList list = new ArrayIntList();
	    assertEquals(0, list.size());
	    list.add(42);
	    assertEquals(1, list.size());
	    list.add(-3);
	    assertEquals(2, list.size());
	    list.add(17);
	    assertEquals(3, list.size());
	    list.add(99);
	    assertEquals(4, list.size());
	    assertEquals("second attempt", 4, list.size());   // make sure I can get it a second time
	}

	@Test
	public void testIsEmpty1() {
	    ArrayIntList list = new ArrayIntList();
	    assertTrue(list.isEmpty());
	    list.add(42);
	    assertFalse("should have one element", list.isEmpty());
	    list.add(-3);
	    assertFalse("should have two elements", list.isEmpty());
	}

	@Test
	public void testIsEmpty2() {
	    ArrayIntList list = new ArrayIntList();
	    list.add(42);
	    list.add(-3);
	    assertFalse("should have two elements", list.isEmpty());
	    list.remove(1);
	    list.remove(0);
	    assertTrue("after removing all elements", list.isEmpty());
	    list.add(42);
	    assertFalse("should have one element", list.isEmpty());
	}*/
}
