public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 20, 40, 10, 40 };
    int[] newarr = new int[arr.length];
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
        boolean duplicate = false;
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                duplicate = true;
                break;
            }
        }
        if (!duplicate) {
            newarr[count] = arr[i];
            count++;
        }

    }
    for (int j = 0; j < count; j++) {
        System.out.print(newarr[j] + " ");
    }
}