package hello.servlet.basic;


import lombok.Getter;
import lombok.Setter;


/*
Getter, Setter는
자동으로 클래스의 생성자와 수정자를 넣는다
 */
@Getter
@Setter
public class HelloData {
    private String username;
    private int age;


}
