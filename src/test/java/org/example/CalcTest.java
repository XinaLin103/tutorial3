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
        // 修改预期结果为8
        assertEquals(8, c.subtract(4, 2));}
}

