class Solution {
    public String solution(String s) {
        String answer = "";

        // 내가 이렇게 풀었는데 굳이 이렇게 풀지말고 String의 subString으로 그냥 잘랐으면 배열로 안 바꿔도 됐음
        // char[] chars = s.toCharArray();
        // int centerNumber = s.length()/2;
        // if(s.length()%2==0){
        // answer =
        // String.valueOf(chars[centerNumber-1])+String.valueOf(chars[centerNumber]);
        // }else{
        // answer = String.format("%s",chars[centerNumber]);
        // }

        int length = s.length();
        int midIndex = length / 2;
        return (length % 2 == 0) ? s.substring(midIndex - 1, midIndex + 1) : s.substring(midIndex, midIndex + 1);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("123");
    }
}