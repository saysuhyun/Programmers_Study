class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pSize = p.length();
        long pNumber = Long.parseLong(p);
        for (int startIndex = 0; startIndex < t.length() - pSize + 1; startIndex++) {
            String substringT = t.substring(startIndex, startIndex + pSize);
            while (substringT.startsWith("0") && substringT.length() > 1) {
                substringT = substringT.replaceFirst("0", "");
            }

            long substringTNumber = Long.parseLong(substringT);
            if (substringTNumber <= pNumber) {
                answer++;
            }
        }

        return answer;
    }
}
