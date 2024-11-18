import java.time.Duration;

public class 동영상_재생기 {
    public static void main(String[] args) {

    }

    public class Solution {
        public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            int videoLength = timeToSeconds(video_len);
            int currentPosition = timeToSeconds(pos);
            int openingStart = timeToSeconds(op_start);
            int openingEnd = timeToSeconds(op_end);

            if (currentPosition >= openingStart && currentPosition <= openingEnd) {
                currentPosition = openingEnd;
            }

            for (String command : commands) {
                if (command.equals("prev")) {
                    currentPosition = Math.max(0, currentPosition - 10);
                } else if (command.equals("next")) {
                    currentPosition = Math.min(videoLength, currentPosition + 10);
                }
                if (currentPosition >= openingStart && currentPosition <= openingEnd) {
                    currentPosition = openingEnd;
                }
            }

            return secondsToTime(currentPosition);
        }

        private static int timeToSeconds(String time) {
            String[] parts = time.split(":");
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);
            return minutes * 60 + seconds;
        }
        private static String secondsToTime(int totalSeconds) {
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;
            return String.format("%02d:%02d", minutes, seconds);
        }


    }
}