package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.Optional;

// 핵심로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        MemberRepository memberRepository = new MemberRepository();
    }


    public void register(String name, String email, String password) {
////        List(DB)에 이메일이 중복일경우 예외발생(Illegal arguments)
//        Member member = memberRepository.findByEmail(email);
//        if (member != null) {
//            throw new IllegalArgumentException("이미 가입된 이메일입니다.");
//        }
//
////        객체 조립 후 repository를 통해 저장
//        Member newmember = new Member(name, email, password);
//        memberRepository.register(newmember);
//    }
//
//    public Member findById(long id) throws NullPointerException {
//        Optional<Member> = memberRepository.findById(id);
//        Member member = Optional<Member>
//
//        if (member == null) {
//            throw new NoSuchFieldException("없는 사용자 입니다.");
//        }
//        return OptionalMember.get();
//    }
//
//    public List<Member> findAll() {
//        return memberRepository.findAll();
//    }

//    public void login(String email, String password)throws NoSuchFieldException {
//        Member member = memberRepository.findByEmail(email);
//        Optional<Member> member = memberRepository.findByEmail(email);
////        email이 있는지 확인후 없으면 예외 발생
//        if (member == null) {
//            throw new IllegalArgumentException("찾을 수 없는 이메일입니다.");
//        }
////        password가 일치한지 확인 후 일치하지않으면 예외 발생
//        if (!password.equals(member.getPassword())) {
//            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
//        }
    }
}