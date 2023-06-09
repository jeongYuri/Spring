package hello.hellospring.repository;
import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long,Member> store = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public Member save(Member member){
        member.setId((++sequence));
        store.put(member.getId(), member);
        return member;
    }
    @Override
    public Optional<Member>findById(Long id){
        return Optional.ofNullable(store.get(id));
    }
    @Override
    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }
    @Override
    public Optional<Member>findByName(String name){
        return store.values().stream()
                .filter(member->member.getName().equals(name))
                .findAny();
    }
    @Override
    public Optional<Member>findByAdress(String adress){
        return store.values().stream()
                .filter(member->member.getAdress().equals(adress))
                .findAny();
    }
    @Override
    public Optional<Member> findByEmail(String email){
        return store.values().stream()
                .filter(member->member.getEmail().equals(email))
                .findAny();
    }
    public void clearStore(){
        store.clear();
    }


}
