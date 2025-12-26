package C02MethodClass;

public class C04Person {
    // 객체변수는 일반적으로 변수의 안정성을 위해 private(클래스내에서만 접근 가능한 접근제어자)으로 설정
    private String name;
    private String email;
    private int age;

    // setter와 getter를 통해 외부에서 객체변수에 접근가능하도록 설정
    // setter, getter는 외부 접근이 가능하도록 일반적으로 public하게 설정
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }

    public String returnPersonInfo(){
        return "이름은 " + this.name + " 이메일은 " + this.email + "나이는 " + this.age + "입니다.";
    }

    // 객체 메서드들간의 호출은 문제없이 호출 가능.
    public void testMethod1(){
        String temp = this.returnPersonInfo();

    }

    // 클래스메서드는 기본적으로 객체생성을 가정하지 않으므로, 클래스메서드내에서 객체메서드를 호출하는 것은 불가능(논리적모순)
    public static void testMethod2(){
    // String temp = this.returnPersonInfo();

    }


}
