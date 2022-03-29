package search;
public class Main {
    public static void main(String[] args) {
        int[] array = {-1,1,3,4,9,10};
        System.out.println(binarySearch(array,0,5,-1));
    }

    static int binarySearch(int[] arr, int first, int last, int value){
        if(last < first){
            return -1;
        }
        int x = (last + first) / 2;
        if(arr[x] == value) return x;
        else if(arr[x] > value) return binarySearch(arr,first , x-1, value);
        else return binarySearch(arr,x+1,last, value);
    }

}
