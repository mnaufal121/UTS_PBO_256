/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Asus
 */
public class Rakitan {
    public static void main(String[]args){
        intel intel1 = new intel(2);
        CPU amd1 = new amd(3);
        Komputer komputer1 = new Komputer(intel1);
        
        komputer1.cetakinfo();
        komputer1.mencabut();
        komputer1.memasang(amd1);
        komputer1.cetakinfo();
        
    }
}
