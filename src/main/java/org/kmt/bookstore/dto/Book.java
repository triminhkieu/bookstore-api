/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kmt.bookstore.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
//them cai nay
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Serializable {
    private String isbn;
    private String title;
    
    //constructor, getter, setter, toString()
    
}
