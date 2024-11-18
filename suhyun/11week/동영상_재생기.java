class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeToSeconds(video_len);
        int currentPosition = timeToSeconds(pos);
        int openingStart = timeToSeconds(op_start);
        int openingEnd = timeToSeconds(op_end);

        // 오프닝 구간에 있을 경우 바로 오프닝 끝 위치로 이동
        if (currentPosition >= openingStart && currentPosition <= openingEnd) {
            currentPosition = openingEnd;
        }

        for (String command : commands) {
            if (command.equals("prev")) {
                currentPosition = Math.max(0, currentPosition - 10);
            } else if (command.equals("next")) {
                currentPosition = Math.min(videoLength, currentPosition + 10);
            }

            // 이동 후 다시 오프닝 구간 체크
            if (currentPosition >= openingStart && currentPosition <= openingEnd) {
                currentPosition = openingEnd;
            }
        }

        return secondsToTime(currentPosition);
    }

    // mm:ss 형식을 초 단위로 변환
    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    // 초 단위를 mm:ss 형식으로 변환
    private String secondsToTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}