/*
 *  테스트 케이스 6번 반례
 *  video_len = "30:00";
 *  String pos = "29:55";
 *  String op_start = "01:00";
 *  String op_end = "01:30";
 */

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] str = pos.split(":");
        int currentMinute = Integer.parseInt(str[0]);
        int currentSec = Integer.parseInt(str[1]);
        str = video_len.split(":");
        int endingMinute = Integer.parseInt(str[0]);
        int endingSec = Integer.parseInt(str[1]);
        str = op_start.split(":");
        int opStartMinute = Integer.parseInt(str[0]);
        int opStartSec = Integer.parseInt(str[1]);
        str = op_end.split(":");
        int opEndMinute = Integer.parseInt(str[0]);
        int opEndSec = Integer.parseInt(str[1]);

        for (String input: commands) {
            // 오프닝인 경우 끝나는 위치로 이동
            if (60 * opStartMinute + opStartSec <= 60 * currentMinute + currentSec && 60 * currentMinute + currentSec <= 60 * opEndMinute + opEndSec) {
                currentMinute = opEndMinute;
                currentSec = opEndSec;
            }

            if (input.equals("next")) {
                if (currentMinute == endingMinute && currentSec + 10 >= endingSec) {
                    currentSec = endingSec;
                } else {
                    // 현재위치에서 10초 후로 이동
                    if (currentSec + 10 >= 60) {
                        currentMinute += 1;
                        currentSec = (currentSec + 10) % 60;

                        if (currentMinute == endingMinute && currentSec >= endingSec) {
                            currentSec = endingSec;
                        }
                    } else {
                        currentSec += 10;
                    }
                }

            } else if (input.equals("prev")) {
                // 현재위치가 10초 미만인 경우 영상의 처음 위치로 이동
                if (currentMinute == 0 && currentSec - 10 < 10) {
                    currentSec = 0;
                } else {
                    // 현재 위치에서 10초 전으로 이동
                    if (currentSec - 10 < 0) {
                        currentMinute -= 1;
                        currentSec = (60 - Math.abs(currentSec - 10));
                    } else {
                        currentSec -= 10;
                    }
                }
            }

            // 오프닝인 경우 끝나는 위치로 이동
            if (60 * opStartMinute + opStartSec <= 60 * currentMinute + currentSec && 60 * currentMinute + currentSec <= 60 * opEndMinute + opEndSec) {
                currentMinute = opEndMinute;
                currentSec = opEndSec;
            }
        }

        if (currentMinute == endingMinute && currentSec > endingSec) {
            currentSec = endingSec;
        }

        if (currentMinute < 10 && currentSec < 10) {
            answer = "0" + currentMinute + ":" + "0" + currentSec;
        } else if (currentMinute < 10) {
            answer = "0" + currentMinute + ":" + currentSec;
        } else if (currentSec < 10) {
            answer = currentMinute + ":" + "0" + currentSec;
        } else {
            answer = currentMinute + ":" + currentSec;
        }

        return answer;
    }
}
