import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

  @Test
  void testFindsElementInMiddle() {
    int [] arr = {1, 3, 5, 7, 9};
    assertEquals(2, linearSearch(arr, 5)); 
  }

  @Test
  void testFindsElementAtStart() {
    int [] arr = {3, -6, 2, 4};
    assertEquals(0, linearSearch(arr, 3)); 
  }

  @Test
  void testFindsElementAtEnd() {
    int [] arr = {2, 4, 6, 8}; 
    assertEquals(3, linearSearch(arr, 8)); 
  }

  @Test
  void testFindsElementInArray() { 
    int [] arr = {-7, 0, 2, -9, 6}; 
    assertEquals(1, linearSearch(arr, 0)); 
  }

  @Test
  void testElementNotFound() { 
    int [] arr = {1, 3, 5, 7, 9}; 
    assertEquals(-1, linearSearch(arr, 11)); 
  }

  @Test
  void testEmptyArray() { 
    int [] arr = {}; 
    assertEquals(-1, linearSearch(arr, 0)); 
  }

  @Test
  void testSingleElementArrayFound() {
    int [] arr = {7};
    assertEquals(0, linearSearch(7)); 
  }

  @Test
  void testSingleElementArrayNotFound() {
    int [] arr = {9}; 
    assertEquals(-1, linearSearch(4)); 
  }
}
