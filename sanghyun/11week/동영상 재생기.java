public class Video {
    public static void main(String[] args) {
        String video_len = "10:55"; 
        String pos = "00:05"; 
        String op_start = "00:15";
        String op_end = "06:55"; 
        String[] commands = {"prev", "next", "next"};
 int total = 0;
        int total2 = 0;
        int op1 = 0;
        int op2 = 0;
        String[] splited = video_len.split(":");
        int h = Integer.parseInt(splited[0]);
        int m = Integer.parseInt(splited[1]);
        total = h * 60 + m;

        String[] splited2 = pos.split(":");
        int h2 = Integer.parseInt(splited2[0]);
        int m2 = Integer.parseInt(splited2[1]);
        total2 = h2 * 60 + m2;

        
        String[] splited3 = op_start.split(":");
        int h3 = Integer.parseInt(splited3[0]);
        int m3 = Integer.parseInt(splited3[1]);
        op1 = h3 * 60 + m3;

        String[] splited4 = op_end.split(":");
        int h4 = Integer.parseInt(splited4[0]);
        int m4 = Integer.parseInt(splited4[1]);
        op2 = h4 * 60 + m4;

  
         for(String command: commands) {
            // 버튼 누르기전
            if(total2 >= op1 && total2 <= op2) {
                total2 = op2;
            }
            if("prev".equals(command)) {
                total2 = Math.max(total2 - 10 , 0);
            }
            if("next".equals(command)) {
                total2 = Math.min(total2 + 10 , total);
            }
            // 버튼 누른 후 둘다 체크 필요
            if(total2 >= op1 && total2 <= op2) {
                total2 = op2;
            }
             
        }

        int hour = total2 / 60;
        int min = total2 - 60 * hour;

        StringBuilder sb = new StringBuilder();

        if(hour < 10) {
            sb.append("0");
        }
        sb.append(hour);
        sb.append(":");
        if(min < 10) {
            sb.append("0");
        }
        sb.append(min);

        String answer = sb.toString();
        System.out.println(answer); // 결과 출력
    }
}