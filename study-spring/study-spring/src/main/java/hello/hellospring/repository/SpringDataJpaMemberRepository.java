package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>,MemberRepository {
    Optional<Member>findByName(String name);
    Optional<Member>findByAdress(String adress);
    Optional<Member>findByEmail(String email);
}
