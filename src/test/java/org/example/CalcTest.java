package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    // ====== 新增的失败测试 ======
    @Test
    void testSubtraction() {
        // 断言 c.subtract(4, 2) 等于 2
        assertEquals(2, c.subtract(4, 2));}
}

