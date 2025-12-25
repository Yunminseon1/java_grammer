package C07ExceptionFileParsing.MemberException;


import java.util.ArrayList;
import java.util.List;

// MemberRepository : 저장소 역할을 하는 역할계층 DB의 CRUD를 수행하는 계층
public class MemberRepository {
    private List<Member> memberList = new ArrayList<>();

    public MemberRepository(){
        this.memberList = new ArrayList<>();
    }
    public void register(Member member){
        this.memberList.add(member);

    }
    public Member findByEmail(String eamil){
    Member member = null;
        return member;
    }

    public Member findById(long id){
        Member member = null;
        return member;
    }

    public List<Member> findAll(){
        return this.memberList;
    }

}

