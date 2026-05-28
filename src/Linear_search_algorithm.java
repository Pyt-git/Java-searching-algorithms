public static linearSearch(int[] array, int value) {
  for (index = 0; index < array.length; i++) {
    if (array[index] == value) {
      return index; 
    }
  }
  return -1;
}
