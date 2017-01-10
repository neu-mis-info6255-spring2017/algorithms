package search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Binary Search Tests")
public class BinarySearchTest {
	private int[] values;
	
	@BeforeEach
	public void setUp() {
		values = new int[] {2,3,6,9,10,13,19,34};
	}
	
	@AfterEach
	public void tearDown() {
		values = null;
	}
	
	@Test
	@DisplayName("Test to find a value before mid")
	public void findValueBeforeMid() {
		int index = Arrays.binarySearch(values, 6);
		assertEquals(2, index, "Value index did not match");
	}
	
	@Test
	@DisplayName("Test to check the insertion point of not found value")
	public void checkInsertPointOfNotFoundValue() {
		int index = Arrays.binarySearch(values, 20);
		assertEquals(-8, index, "Insertion point is not correct");
	}

}
