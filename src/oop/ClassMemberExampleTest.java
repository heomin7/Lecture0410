package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ClassMemberExampleTest {

    public static void main(String[] args){
        ClassMemberExample cme = new ClassMemberExample();

        int a = ClassMemberExample.CLASS_MEMBER;

        System.out.println(a);

        ClassMemberExample.getStaticTest(); //객체가 아니라 class를 통해 직접 메소드를 접근

        int r = (int)(Math.random() * 6 + 1);
        System.out.println(r);

    }
}
