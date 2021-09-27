/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangchau.mathutil.core;

/**
 *
 * @author hoang
 */
public class MathUtil {
    // viết hàm tính n! - 1.2.3.4.5...n
    //0! =1! =1
    // 21! tràn kiểu long
    //<0 ! ko tính dc, ko có giai thừa cho số âm
    
    // static cho dùng chung
    public static long getFactorial(int n){
        long product =1; // tích dồn
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0... 20");
        if( n==0 || n ==1){
            return 1;
        }
        
        for(int i =2; i<=n;i++){
            product *=i;
        }
        return product;
    }
}
