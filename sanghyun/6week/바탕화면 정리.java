import java.util.*;

public class Home {
    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};

        int[] start = {Integer.MAX_VALUE,Integer.MAX_VALUE };
        int[] end ={ 0 , 0};

        for(int i = 0; i < wallpaper.length; i++) {
            // i 중 가장 작은 값 y축 -> 처음 #가 존재하는 좌표 -> start[1]
            // indexList 중 가장 앞자리 -> x축 start[0]
            // i 중 가장 큰 값 y축 -> 가장 마지막에 #가 존재하는 좌표 -> end[1]
            // indexList 중 가장 뒷자리 -> x축 end[0]
            List<Integer> indexList = new ArrayList<Integer> ();
	        int index = wallpaper[i].indexOf("#");

	
	        while(index != -1) {
		        indexList.add(index);
                if(index +1 > wallpaper[i].length()) {
                    break;
                }
		        index = wallpaper[i].indexOf("#", index + 1);
                
	        }
            if(indexList.size()> 0) {
                start[1] = Math.min(start[1], i);
                start[0] = Math.min(start[0], indexList.get(0));
                end[1] = Math.max(end[1], i);
                end[0] =  Math.max(end[0], indexList.get(indexList.size()-1));
            }
        }


        int[] answer = { start[1],  start[0] ,  end[1]+1, end[0]+1  };
    }
}