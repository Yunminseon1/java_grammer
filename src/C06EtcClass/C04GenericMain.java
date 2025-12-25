package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C04GenericMain {
    static void main(String[] args) {
//        String[] stArr = {"java", "python", "C++"};
//        stChange(stArr, 0, 1);
//        System.out.println(Arrays.toString(stArr));
//
//        Integer[] intArr = {10, 20, 30};
//        intChange(intArr, 0, 1);
//        System.out.println(Arrays.toString(intArr));
//
//        allchange(stArr, 1,2);
//        System.out.println(stArr);
//        allchange(intArr,0,2);
//        System.out.println(intArr);

//        제네릭을 사용한 객체 생성

        GenericPerson<String> p1 = new GenericPerson<>("hongildong");
        GenericPerson<Integer> p2 = new GenericPerson<>(10);
        System.out.println(p1.getValue());
        System.out.println(p2.getValue());

//       제네릭의 사용 예시
        List<String> mtList = new ArrayList<>();
        Stream<String> myStream;
        Optional<Student> myStudent;

    }

//    제네릭메서드는 반환타입 왼쪽에 <T>라고 선언.
//    이때 T는 참조형변수인 객체타입만을 허용
    static <T> void allchange(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void intChange(Integer[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void stChange(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }
    }


}

class GenericPerson<T>{
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }





}