package hello.hellospring.Repository;

import hello.hellospring.domain.Member;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;
public interface MemberRepository {


    Member save(Member member);
    Optional<Member>findById(Long id);
    Optional<Member>findByName(String name);
    List<Member>findAll();
}
