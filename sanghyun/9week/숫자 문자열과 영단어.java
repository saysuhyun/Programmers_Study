public class NumString {
    public static void main(String[] args) {
        String s = "oneoneoneoneoneone";

        char[] cArr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cArr.length; i++) {
            char temp = cArr[i];


            if(Character.isDigit(temp)) {
                sb.append(temp);
            } else {
                if(temp == 'z') {
                    sb.append('0');
                    i+=3;
                }
                if(temp == 'o') {
                    sb.append('1');
                    i+=2;
                }
                if(temp == 't') {
                    if(cArr[i+1] == 'w') {
                        sb.append('2');
                        i+=2;
                    }
                    if(cArr[i+1] == 'h') {
                        sb.append('3');
                        i+=4;
                    }
                }
                if(temp == 'f') {
                    if(cArr[i+1] == 'o') {
                        sb.append('4');
                        i+=3;
                    }
                    if(cArr[i+1] == 'i') {
                        sb.append('5');
                        i+=3;
                    }
                }
                if(temp == 's') {
                    if(cArr[i+1] == 'i'){
                        sb.append('6');
                        i+=2;
                    }
                    if(cArr[i+1] == 'e') {
                        sb.append('7');
                        i+=4;
                    }
                }
                if(temp == 'e'){
                    sb.append('8');
                    i+=4;
                }
                if(temp == 'n') {
                    sb.append('9');
                    i+=3;
                }
            }

            if(i >= cArr.length) {
                break;
            }

        }

        int answer = Integer.valueOf(sb.toString());

        System.out.println(answer);
    }
}