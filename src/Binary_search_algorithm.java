public static int binarySearch(int[] array, int value) {
  int left = 0;
  int right = 0;

  while (left <= right) {
    int middle = (left + right)/2;
    
    if (array[middle] == value) {
      return middle;
    } else if (array[middle] < x) {
      left = middle + 1;
    } else {
      right = middle - 1;
    }
  }
  return -1;
}
