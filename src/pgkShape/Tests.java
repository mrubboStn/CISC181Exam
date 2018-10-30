package pgkShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class Tests {

	@Test
	void testRectConstructor() {
		Rectangle rect = new Rectangle(3,3);
		if (rect == null) 
			fail("Constructor not working");
	}

	@Test
	void testGetiWidth() {
		Rectangle rect1 = new Rectangle(4,5);
		if (rect1.getiWidth() != 4)
			fail("getiWidth Failure");
	}
	
	@Test
	void testGetiLength() {
		Rectangle rect2 = new Rectangle(4,5);
		if (rect2.getiLength() != 5)
			fail("getiLength Failure");
	}
	
	@Test
	void testSetiWidth() {
		Rectangle rect3 = new Rectangle(4,5);
		rect3.setiWidth(7);
		if (rect3.getiWidth() != 7)
			fail("setiWidth Failure");
    }
	
	@Test
	void testSetiLength() {
		Rectangle rect4 = new Rectangle(4,5);
		rect4.setiLength(9);
		if (rect4.getiLength() != 9)
			fail("setiLength Failure");
    }
	
	@Test
	void testRectArea() {
		Rectangle rect5 = new Rectangle(3,7);
		assertEquals(rect5.area(), 21);
    }
	
	@Test
	void testRectPerimeter() {
		Rectangle rect6 = new Rectangle(3,7);
		assertEquals(rect6.perimeter(), 20);
    }
	
	@Test 
	void testRectCompare() {
		Rectangle rect7 = new Rectangle(4,5);
		Rectangle rect8 = new Rectangle(2,2);
		Rectangle rect9 = new Rectangle(5,4);
		
		assertEquals(rect7.compareTo(rect8),1);
		assertEquals(rect8.compareTo(rect7),-1);
		assertEquals(rect7.compareTo(rect9),0);
	}
	
	
	
	
	@Test
	void testCuboidConstructor() {
		Cuboid cube = new Cuboid(3,3,3);
		if (cube == null) 
			fail("Constructor not working");
	}

	@Test
	void testGetiDepth() {
		Cuboid cube1 = new Cuboid(3,3,8);
		assertEquals(cube1.getiDepth(), 8);
	}
	
	@Test
	void testSetiDepth() {
		Cuboid cube2 = new Cuboid(3,3,3);
		cube2.setiDepth(7);
		assertEquals(cube2.getiDepth(), 7);
    }
	
	@Test
	void testCuboidVolume() {
		Cuboid cube3 = new Cuboid(3,3,3);
		assertEquals(cube3.volume(), 27);
    }
	
	@Test
	void testCuboidArea() {
		Cuboid cube4 = new Cuboid(3,3,3);
		assertEquals(cube4.area(), 54);
    }
	
	
	/*
	@Test 
	void testCuboidPerimeter() {
		Cuboid cube5 = new Cuboid(3,3,3);
		assertThrows(UnsupportedOperationException.class, getMethod("perimeter", Cuboid.class));
		
    }
	*/
	@Test
	void testSortByArea() {
		Cuboid c1 = new Cuboid(2,2,2);
		Cuboid c2 = new Cuboid(3,3,3);
		Cuboid c3 = new Cuboid(4,4,4);
		Cuboid c4 = new Cuboid(5,5,5);
		
		
		
	}
}
