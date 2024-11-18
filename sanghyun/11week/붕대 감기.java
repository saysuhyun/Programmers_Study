import java.util.*;
import java.util.stream.*;

public class Band {
    public static void main(String[] args) {
        int[] bandage = {1, 1, 1};
        int health = 5;
        int[][] attacks = {{1, 2}, {3, 2}};
        int attack = attacks[attacks.length-1][0];


        int bondTime = 0;
        int tempHealth = health;

        Map<Integer,Integer> map = new HashMap<>();

        // 공격이 들어오는 초와 데미지를 map에 기록
        for(int i = 0 ; i < attacks.length; i++) {
            map.put(attacks[i][0], i);
        }

        // attack -> 가장 마지막 공격 시간 
        // 가장 마지막 공격까지 1초씩 for loop
        for(int i = 0; i < attack+1; i++ ) {
            Integer isAttack = map.get(i);

            // get 값이 null 이 아니면 공격들어오는 구간
            if(isAttack != null) {
                bondTime = 0;
                tempHealth = tempHealth - attacks[isAttack][1];
        
                if(tempHealth < 1) {
                    tempHealth = -1;
                    break;
                }
                System.out.println(tempHealth);
                continue;
            }

            if(tempHealth <= health) {
                tempHealth = Math.min(health , tempHealth + bandage[1] );
                System.out.println("add " +tempHealth);
            }
            bondTime++;

            // 연속 성공
            if(bondTime >= bandage[0]) {
                bondTime = 0;
                tempHealth  = Math.min(health , tempHealth + bandage[2] );
                System.out.println("연속" +tempHealth);

            }

        
            System.out.println(tempHealth);
        }
        int answer = tempHealth;

        System.out.println(answer);

    }
}