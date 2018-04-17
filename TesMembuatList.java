/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author arrai
 */
public class TesMembuatList {
    public static void main(String[] args2){
        TesMembuatList baca = new TesMembuatList();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Akan menginput Berapa Data : ");
        int Jumlah = input.nextInt();
        
        List NamaCustomer = new ArrayList(Jumlah);
        int i;
        for(i=0 ; i<Jumlah ; i++){
            System.out.println("Masukan Nama Customer : ");
            String Nama = input.next();
            NamaCustomer.add(Nama);
        }
        System.out.println(NamaCustomer);
    }
    }
    

