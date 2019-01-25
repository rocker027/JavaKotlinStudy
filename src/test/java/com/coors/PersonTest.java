package com.coors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest() {
        Person person = new Person();
        person.setWeight(66.5f);
        person.setHeight(1.7f);

        // 左邊為 期待值 ， 右邊為實際
        Assertions.assertEquals(66.5f/(1.7f * 1.7f) , person.bmi());
    }
}
