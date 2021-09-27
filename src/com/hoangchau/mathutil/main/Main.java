/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangchau.mathutil.main;

import com.hoangchau.mathutil.core.MathUtil;

/**
 *
 * @author hoang
 */
public class Main {
     public static void main(String[] args) {
         
         
        // Test manual, đưa data, gọi hàm check, so sánh expected vs actual
        //tất cả, đặc biệt phần cmp phải là bằng mắt, cho từng tình huống
        
         System.out.println("0! = 1? " + MathUtil.getFactorial(0));
         System.out.println("1! = 1? " + MathUtil.getFactorial(1));
         System.out.println("2! = 2? " + MathUtil.getFactorial(2));
         System.out.println("3! = 6? " + MathUtil.getFactorial(3));
    }
}
