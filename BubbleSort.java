public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        int temporary = 0; //Tem

        for(int i=0; i < a.length; i++){
            for(int j=1; j < (a.length-i); j++){
                if(a[j-1] > a[j]){
                    //If the current element is less than the prev element, swap it and keep goin
                    temporary = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temporary;
                }

            }
        }

    }
}
