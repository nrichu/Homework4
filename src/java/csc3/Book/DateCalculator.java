/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc3.Book;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateCalculator {

    
    public static String setDate (){
        Date dueDate = null;
        int noOfDays = 14;
       //String newDueDate = "";
    //change format of date: IMPORTANT
    String dateFormat = "MM-dd-YYYY";
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    
       Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
        dueDate = calendar.getTime();
       
       String newDueDate = sdf.format(dueDate);
  
        return newDueDate;
        }
    }

