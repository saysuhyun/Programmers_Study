public class Smaller {
    public static void main(String args[] ){
        //t의 길이 ≤ 10,000 -> int 사용하면 에러 발생함
        String t = "500220839878"; 
        String p = "7";
        long compare = Long.parseLong(p);
        char[] cArr = t.toCharArray();

        int size = p.length();

        int total = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <= cArr.length-size; i++) {
            for(int j = 0; j < size; j++) {
                sb.append(cArr[i+j]);
            }
            long temp = Long.parseLong(sb.toString());
            if(temp <= compare) {
                total++;
            }
            sb.setLength(0); 
        }
        System.out.println(total);
    }
}