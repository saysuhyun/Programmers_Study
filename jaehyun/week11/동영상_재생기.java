public class 동영상_재생기 {
    public static void main(String[] args) {
        System.out.println(solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"})); // 결과: "13:00"
        System.out.println(solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"})); // 결과: "06:55"
        System.out.println(solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"})); // 결과: "04:17"
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeToSeconds(video_len); // 동영상 길이
        int currentPosition = timeToSeconds(pos); // 현재 위치
        int opStart = timeToSeconds(op_start); // 오프닝 시작
        int opEnd = timeToSeconds(op_end); // 오프닝 끝

        for (String command : commands) {
            if (opStart <= currentPosition && currentPosition <= opEnd) {
                currentPosition = opEnd;
            }

            if (command.equals("prev")) {
                currentPosition = Math.max(currentPosition - 10, 0);
            } else if (command.equals("next")) {
                currentPosition = Math.min(currentPosition + 10, videoLength);
            }
        }

        if (opStart <= currentPosition && currentPosition <= opEnd) {
            currentPosition = opEnd;
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
