package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1,000 원 할인

    @Override
    public int discount(Member member, int price) {
//        Grade grade = member.getGrade();
//        int returnPrice = 0;
//
//        if(grade == Grade.BASIC) {
//            returnPrice = price;
//        } else if (grade == Grade.VIP) {
//            returnPrice = price - discountFixAmount;
//        }
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
