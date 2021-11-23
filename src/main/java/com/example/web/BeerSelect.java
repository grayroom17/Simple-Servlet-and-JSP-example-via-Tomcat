package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;

public class BeerSelect extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("text/html");
        String color = req.getParameter("color");

        BeerExpert beerExpert = new BeerExpert();
        List<String> brands = beerExpert.getBrands(color);

        //        PrintWriter writer = resp.getWriter();
//        writer.println("Beer Selection Advice<br>");
//        writer.println(String.format("<br>Got beer color %s",color));
//        writer.println("You should try beer below:<br>");
//        for (String brand : brands) {
//            writer.println(brand + "<br>");
//        }

        req.setAttribute("brands", brands);
        req.getRequestDispatcher("result.jsp").forward(req, resp);


    }
}
