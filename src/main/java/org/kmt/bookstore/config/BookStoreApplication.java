/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kmt.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Admin
 */
//them cai nay
//ws - web service
//resful 
@ApplicationPath("api")
public class BookStoreApplication extends ResourceConfig {

    public BookStoreApplication() {
        packages("org.kmt.bookstore.resource");
    }
}
