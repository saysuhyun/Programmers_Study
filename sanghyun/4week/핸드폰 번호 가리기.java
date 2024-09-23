public class PhoneNumber {
    public static void main(String[ ] args){ 
        String phone_number = "027778888";

        String[] numbers = phone_number.split("");

        StringBuilder sb = new StringBuilder();

        int numberIdx = numbers.length -4 ;

        for(int i = 0; i < numbers.length; i++) {
            if(i < numberIdx) {
                sb.append("*");
            } else {
                sb.append(numbers[i]);
            }
        }

        String answer = sb.toString();

        System.out.println(answer);
    }
}