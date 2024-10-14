public class SecretMap {
    public static void main(String[] args) {
        int n =6;
        int[] arr1 ={46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String binaryResult = Integer.toBinaryString(arr1[i] | arr2[i]);

            String formattedResult = String.format("%" + n + "s", binaryResult).replace(' ', '0');

            answer[i] = formattedResult.replace('1', '#').replace('0', ' ');
        }
    }
}