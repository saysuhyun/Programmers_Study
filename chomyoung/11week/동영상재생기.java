public class 동영상재생기 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = convertToSeconds(video_len);
        int currentPosition = convertToSeconds(pos);
        int openingStart = convertToSeconds(op_start);
        int openingEnd = convertToSeconds(op_end);

        for (String command : commands) {
            if (currentPosition >= openingStart && currentPosition <= openingEnd) {
                currentPosition = openingEnd;
            }
            switch (command) {
                case "prev":
                    currentPosition = Math.max(currentPosition - 10, 0);
                    break;
                case "next":
                    currentPosition = Math.min(currentPosition + 10, videoLength);
                    break;
            }
            if (currentPosition >= openingStart && currentPosition <= openingEnd) {
                currentPosition = openingEnd;
            }

        }

        return convertToTimeFormat(currentPosition);
    }

    private int convertToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    private String convertToTimeFormat(int seconds) {
        int minutes = seconds / 60;
        seconds %= 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}