package C05AnonymousLamda;


// 내부 클래스 : 클래스안에 클래스의 존재
//1) static 내부클래스 2) 익명내부클래스

public class C01innerClass {
    static void main(String[] args) {
//    AbstractAnimal를 상속한 클래스가 별도로 존재하지않고,
//    내부에 익명클래스가 만들어짐과 동시에 익명객체가 생성
//     AbstractAnimal aa = new AbstractAnimal(){
//        @Override
//            void makeSound() {
//                System.out.println("멍멍");
//            }
//        };
//
        Member.MemberInner mi = new Member.MemberInner(20);
        System.out.println(mi.getB());
    }
}

class Member{
    private int a;

    public void setA(int a){
        this.a = a;
    }

    public Member(int a) {
        this.a = a;
    }

//    static 내부클래스 : Member의 static 변수처럼 활용

    static class MemberInner{
        private int b;

        public MemberInner(int i) {
        }

        public int getB(){
            return b;
        }

    }


}