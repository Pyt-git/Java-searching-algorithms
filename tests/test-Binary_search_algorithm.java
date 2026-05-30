import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

  void testFindsElementInMiddle() {
    int [] arr = {1, 3, 5, 7, 9};
    assertEquals(2, binarySearch(arr, 5)); 
  }

  void testFindsElementAtStart() {
    int [] arr = {3, -6, 2, 4};
    assertEquals(0, binarySearch(arr, 3)); 
  }

  void testFindsElementAtEnd() {
    int [] arr = {2, 4, 6, 8}; 
    assertEquals(3, binarySearch(arr, 8)); 
  }

  void testFindsElementInArray() { 
    int [] arr = {-7, 0, 2, -9, 6}; 
    assertEquals(1, binarySearch(arr, 0)); 
  }

  void testElementNotFound() { 
    int [] arr = {1, 3, 5, 7, 9}; 
    assertEquals(-1, binarySearch(arr, 11)); 
  }

  void testEmptyArray() { 
    int [] arr = {}; 
    assertEquals(-1, binarySearch(arr, 0)); 
  }

  void testSingleElementArrayFound() {
    int [] arr = {7};
    assertEquals(0, binarySearch(7)); 
  }

  void testSingleElementArrayNotFound() {
    int [] arr = {9}; 
    assertEquals(-1, binarySearch(4)); 
  }
}
    
      
