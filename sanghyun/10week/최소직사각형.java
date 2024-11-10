public class MinSquare {
    public static void  main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int xMax = 0;
        int yMax = 0;

        for(int[] size: sizes) {
            int tempXMax = Math.max(xMax, Math.min(size[0], size[1]));
            int tempYMax = Math.max(yMax, Math.max(size[0], size[1]));

            if(tempXMax > xMax) {
                xMax = tempXMax;
                
            }
            if(tempYMax > yMax) {
                yMax = tempYMax;
            }
        }
        System.out.println((xMax * yMax));
    }
}