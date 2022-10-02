package search

class BiSearch {
    static int biSearch(int[] arr, int start, int end, int x) {
        int middle = (start + end) / 2
        if (arr[middle] == x) return middle
        if (arr[middle] < x) {
            return biSearch(arr, middle + 1, end, x)
        } else if (arr[middle] > x) {
            return biSearch(arr, start, middle - 1, x)
        }
    }


    static void main(String[] args) {
        println biSearch(new int[]{1, 2, 3, 6, 8, 25}, 0, 5, 8)
    }

}
