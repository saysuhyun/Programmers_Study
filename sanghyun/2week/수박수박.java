public class Watermellon {
    public static void main(String[] args) {
        int n = 12;

    

        StringBuilder stringBuilder = new StringBuilder();
        String waterMellon = "수박";
        String water = "수";
     
        for(int i = 0; i < n / 2; i++) {
            stringBuilder.append(waterMellon);
        }
    
        if (n % 2 == 1) {
            stringBuilder.append(water);
        }
        
        String answer = stringBuilder.toString();
        System.out.println(answer);
    }
}
