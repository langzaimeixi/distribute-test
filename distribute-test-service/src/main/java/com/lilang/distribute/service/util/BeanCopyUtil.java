package com.lilang.distribute.service.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cglib.beans.BeanCopier;

/**
 * Created by lilang on 17/4/29.
 */
public class BeanCopyUtil {

    public static void beanCopy(Object source, Object target, Class clazz) {
        if (null == source) {
            return;
        }
        BeanCopier copier = BeanCopier.create(source.getClass(), clazz, false);
        copier.copy(source, target, null);
    }

    @Getter
    @Setter
    @ToString
    static class Person1{
        private String name;
        private int age;
    }
    @Getter
    @Setter
    @ToString
    static class Person2{
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Person2 person2 = new Person2();
        person1.setAge(10);
        person1.setName("lilang");
        beanCopy(person1, person2, Person2.class);
        System.out.println(person2);

    }

}
