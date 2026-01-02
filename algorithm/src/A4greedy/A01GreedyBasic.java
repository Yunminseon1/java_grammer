package A4greedy;

// greedy(탐욕법) : 현재로서 최적의 해를 선택했을때 전체의 최적해를 보장하는 알고리즘
public class A01GreedyBasic {
    public static void main(String[] args) {
//        1,5,10,20 동전이 있을떄 1을 조합하여 99를 만들수있는 조합중에 최소개수를 구하라
        int[] arr = {10,5,1,20};
        int money = 99;
        int count = 0;

        for(int coin : arr){
            int use = money / coin ;
            count += use;
            money %= coin;

        }
        System.out.println("최소 동전 개수 :" + count);
    }
}
