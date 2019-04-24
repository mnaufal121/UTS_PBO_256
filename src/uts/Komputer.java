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
public class Komputer {

    private CPU cp;

    public Komputer(CPU cp) {
        this.cp = cp;
    }

    public Komputer() {

    }

    public void memasang(CPU cp) {
        this.cp = cp;
        System.out.println("CPU : " + cp.getCPUData() + " GHz" + " dipasang");
    }

    public void mencabut() {

        System.out.println("CPU : " + cp.getCPUData() + " GHz" + " dicabut");
        this.cp = null;
    }

    public void cetakinfo() {
        System.out.println("Spesifikasi : " + cp.getCPUData() + " GHz");
    }
}
