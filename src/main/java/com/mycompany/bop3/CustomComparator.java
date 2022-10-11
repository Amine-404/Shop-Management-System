/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bop3;
import java.util.*;

/**
 *
 * @author mzagh
 */
public class CustomComparator implements Comparator<Book> {
    @Override
    public int compare(Book B1, Book B2) {
        if (B1.price>B2.price){
            return 1;
        }
        if (B1.price<B2.price){
            return -1;
        }
        else {
            return 0;
        }
       // return (B1.price).compareTo(B2.price);
    }
}

