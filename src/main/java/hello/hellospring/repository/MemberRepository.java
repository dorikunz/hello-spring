package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);  // optional은 자바8에 들어가있는 기능. null값을 가져왔을 때 optional로 감싸서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
