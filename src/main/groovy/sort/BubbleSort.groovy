package sort

class BubbleSort {
    static int[] sort(int[] arr) {
        for (i in 0..<arr.length) {
            for (j in i + 1..<arr.length) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                }
            }
        }
        println arr
        return arr
    }

    static void main(String[] args) {
        sort(new int[] {10, 5, 7 , 8, 1, 6, 7, 9})
    }
}
