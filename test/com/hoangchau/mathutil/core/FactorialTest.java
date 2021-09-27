/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangchau.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author hoang
 */
public class FactorialTest {
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));


    }
    
    // check xem có ngoại lệ khi đưa data sai
    @Test(expected = IllegalArgumentException.class)
    public void checkFatorialGivenWrongArgumentThrowException(){
        // ta ko dùng asertEquals(2 value so sánh)
        // ngoại lệ chỉ có thể thấy nó xuất hiện hay ko ??
        MathUtil.getFactorial(-5);
    }
}
// quy tắc xanh đỏ:
//1. xanh, tất cả tình huống so sánh xài hàm phải cùng xanh
//2. đỏ., chỉ cần 1 tình huống xài hàm bị đỏ, coi như cả hàm đỏ
/////ĐỎ:
///// Hoặc bạn tính toán trong thuật tuán/hàm sai 
///// Hoặc expected cái kì vọng sai