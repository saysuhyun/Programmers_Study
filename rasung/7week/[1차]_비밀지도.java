class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String map1 = makeSecretMap(n, arr1);
        String map2 = makeSecretMap(n, arr2);
        int index = 0;
        int cnt = 0;
        StringBuilder findAnswer = new StringBuilder();

        for (int i = 0; i < map1.length(); i++) {
            cnt++;
            if (Character.toString(map1.charAt(i)).equals("1") || Character.toString(map2.charAt(i)).equals("1")) {
                findAnswer.append("#");
            } else {
                findAnswer.append(" ");
            }

            if (cnt == n) {
                answer[index] = findAnswer.toString();
                index++;
                cnt = 0;
                findAnswer = new StringBuilder();
            }
        }

        return answer;
    }

    private static String makeSecretMap(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(num));
            if (binaryString.length() != n) {
                int length = binaryString.length();

                for (int i = 0; i < n - length; i++) {
                    binaryString.insert(0, "0");
                }
            }
            sb.append(binaryString);
        }
        return sb.toString();
    }
}
