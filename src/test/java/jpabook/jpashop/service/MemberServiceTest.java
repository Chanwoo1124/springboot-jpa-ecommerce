package jpabook.jpashop.service;

import jakarta.persistence.Column;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.hibernate.validator.constraints.br.CPF;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    void 회원가입() throws Exception{
        Member member = new Member();
        member.setName("kim");

        //when
        Long saveId = memberService.join(member);

        //Then
        Assertions.assertThat(member.getId()).isEqualTo(saveId);

    }

    @Test
    void 중복_회원_예외() throws Exception{
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");

        memberService.join(member1);
        try {
            memberService.join(member2);
        }catch ( IllegalStateException e) {
            return;
        }

        fail("예외가 발생해야 한다.");

    }

}