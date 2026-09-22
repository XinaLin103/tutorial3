package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    // ====== 修改新增的失败测试 ======
    @Test
    void testSubtraction() {
        // 修改成4-2=2
        assertEquals(2, c.subtract(4, 2));}
}

