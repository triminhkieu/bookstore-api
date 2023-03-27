/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kmt.bookstore.resource.v1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.kmt.bookstore.dto.Book;

/**
 *
 * @author Admin
 */
//them cai nay
@Path("v1/books") //localhost:6969/ten-app/api/v1/books
public class BookResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
//    http://localhost:6969/bookstore/api/v1/books
    public Book getABook() {
        return new Book("1234567899999", "Kieu Minh Tri");
    }
}
