import java.util.*;
import java.util.stream.*;

public class Char {
    public static void main(String[] args) {
        String[] survey = {"TR", "RT", "TR"};
        int[] choices ={7, 1, 3};

        Map<String, Integer> hMap = new HashMap<>();

        

        for(int i = 0; i < survey.length; i++) {
            String[] splited = survey[i].split("");
            String f = splited[0];
            String l = splited[1];
            int score = choices[i];
            if(score > 4) {
                hMap.put(l, hMap.getOrDefault(l, 0) + Math.abs(score - 4));
            }
            if(score < 4) {
                hMap.put(f, hMap.getOrDefault(f, 0) + Math.abs(score - 4));
            }
        }
        String[] s = new String[4];
        String[] idx = {"RT" , "CF" , "JM" , "AN"};
        StringBuilder sb = new StringBuilder();
        for(int l = 0; l < 4; l++) {
            String[] splitedIdx = idx[l].split("");
            Integer fScrore = hMap.getOrDefault(splitedIdx[0], 0);
            Integer lScore =  hMap.getOrDefault(splitedIdx[1], 0);
            if(fScrore > lScore) {
                sb.append(splitedIdx[0]);
            }
            if(fScrore < lScore) {
                sb.append(splitedIdx[1]);
            }
            if(fScrore == lScore) {
                sb.append(splitedIdx[0].compareTo(splitedIdx[1]) > -1 ? splitedIdx[1] : splitedIdx[0]);
            }
        }

        String answer = sb.toString();
    }
} 