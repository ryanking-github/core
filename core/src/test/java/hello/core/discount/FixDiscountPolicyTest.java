package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.Test;

public class FixDiscountPolicyTest {

    @Test
    void FixDiscountTest() {
        Member member = new Member(1L,"Test1", Grade.VIP);

        FixDiscountPolicy fdp = new FixDiscountPolicy();

        int price = fdp.discount(member, 2000);
        System.out.println("price = " + price);

    }
}
