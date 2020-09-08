package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemberRepostory {

    MemoryMemberRepository repository = new MemoryMemberRepository();
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }
    @Test
    public void save() {
        Member member = new Member();
        member.setName("Spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        System.out.println("result = " + (result == member));
        assertThat(member).isEqualTo(result);
        //Assertions.assertEquals(result,member);
        //다르면 오류남
        //
    }
    @Test
    public void findByName(){
            Member member1 = new Member();
            member1.setName("Spring1");
            repository.save(member1);

            Member member2 = new Member();
            member2.setName("Spring2");
            repository.save(member2);

            Member result = repository.findByName("Spring1").get();

            assertThat(result).isEqualTo(member1);
        }

        @Test
    public void findAll(){
            Member member1 = new Member();
            member1.setName("Spring1");
            repository.save(member1);

            Member member2 = new Member();
            member2.setName("Spring2");
            repository.save(member2);

            List<Member> result = repository.findAll();

            assertThat(result.size()).isEqualTo(2);
    }


}
