package C03Inheritance;

public class C03AnimalMain {
    static void main(String[] args) {
       Dog d1 = new Dog();
       d1.sound2();
       Cat c1 = new Cat();
       c1.sound();

     // 상속관계일떄는 부모클래스의 타입을 자식클래스의 객체 타입으로 지정가능
       Animal d2 = new Dog();
       d2.sound();
      // 부모클래스의 타입으로 지정시, 부모클래스의 객체에서 사용가능
      d2.sound2();
        

    }

    class Animal{
        
        public void sound(){
            System.out.println( "동물이 소리를 냅니다");
        }

    }

    class Dog extends Animal{
        @Override
        public void sound(){
            System.out.println("멍멍멍멍");
        }
        void sound2(){
            System.out.println("멍멍멍멍");
        }
    }

    class Cat extends Animal{

        void sound2(){
            System.out.println("야옹야옹");
        }

    }
}

