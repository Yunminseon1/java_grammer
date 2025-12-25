package C07ExceptionFileParsing.MemberException;

// 객체 - 엔티티
// 맴버 클래스(Member)
public class Member{
    private String name;
    private String email;
    private String password;
    private Long id;
    private static Long staticId = 0L;

    public Member(String name, String email, String passowrd){
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = passowrd;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return  password;
    }
    public Long getId(){
        return id;
    }
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

}
