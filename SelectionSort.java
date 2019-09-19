public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {

        for (int orig_index = 0; orig_index < a.length - 1; orig_index++) {

            //Find the Minimum val left not already moved in the array
            int index_of_lowest = orig_index;

            for (int index = orig_index + 1; index < a.length; index++) {
                //starting at the one after where we are in the other loop, loop and constantly update the min value
                if (a[index] < a[index_of_lowest]) {
                    index_of_lowest = index;
                }
            }

            //Do the swap
            int temp = a[orig_index];
            a[orig_index] = a[index_of_lowest];
            a[index_of_lowest] = temp;
        }
    }
}