package C10Annotation;

import java.lang.reflect.Field;

public class C01Reflection {
    static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
       // 리플렉션 : 자바에서 런타임시점에 클래스, 변수, 메서드에 접근할수있는 기술
        Person p1 = new Person();
       // 아래와 같은 방식을 통해 private변수인 name변수에 직접 접근
        Field nameField = Person.class.getDeclaredField("name");
        nameField.trySetAccessible(); // private 이라 할지라도 접근가능하도록 세팅 가능.
        nameField.set(p1,"hongildong");
        System.out.println(p1);
    }
}

class Person{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
