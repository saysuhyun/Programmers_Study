import java.util.ArrayList;

public class 추억_점수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            ArrayList<Person> persons = new ArrayList<>();

            for (int i = 0 ; i < name.length ; i++){
                persons.add(new Person(name[i],yearning[i]));
            }
            for (int i = 0 ; i < photo.length ; i++){
                for (int k = 0 ; k < photo[i].length;k++){
                    String string = photo[i][k];
                    int finalI = i;
                    persons.stream()
                            .filter(person -> person.getName().equals(string))
                            .findFirst()
                            .ifPresent(person -> answer[finalI] += person.getYearning());
                }
            }


            return answer;
        }


        class Person {
            String name;
            int yearning;

            public Person(String name,int yearning){
                this.name = name;
                this.yearning = yearning;
            }
            public String getName() {
                return name;
            }
            public int getYearning() {
                return yearning;
            }
        }
    }

}