class Solution {
    public String solution(String phone_number) {
        String prevNumber = phone_number.substring(0, phone_number.length() - 4).replaceAll(".", "*");
        String lastNumber = phone_number.substring(phone_number.length() - 4);

        return prevNumber + lastNumber;
    }
}
