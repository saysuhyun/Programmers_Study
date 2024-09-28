public class Foodfight {
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            int temp = food[i] /2;
            for(int l = 0; l < temp; l++) {
                sb.append(i);
            }
        
        }
        String answer = sb.toString() + "0" + sb.reverse().toString();
        System.out.println(answer);
    }
}