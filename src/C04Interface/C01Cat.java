package C04Interface;

//인터페이스 상속(구현)시 implements 키워드 사용
//인터페이스 다중상속은 허용
public class C01Cat implements C01AnimalInterface1, C01AnimalInterface2{
    static void main(String[] args) {

        
    }

    @Override
    public void makeSound() {
        System.out.println("야옹야옹");
    }

    @Override
    public void eat(String food) {
        System.out.println(food + "를먹습니다.");

    }
}

