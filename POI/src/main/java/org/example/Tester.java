package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
public static void main(String[] args) throws IOException {

   // ArrayList a=new ArrayList();
            FileInputStream fis=new FileInputStream("C:\\Users\\Rohit\\Documents\\Book1.xlsx");
            XSSFWorkbook workbook=  new XSSFWorkbook(fis);
            int count= workbook.getNumberOfSheets();
            for (int i = 0; i < count; i++)
            {
                if(workbook.getSheetName(i).equalsIgnoreCase("workspace"))
              {    System.out.println(i);
                  XSSFSheet sheet= workbook.getSheetAt(i);
                    Iterator<Row> rows= sheet.iterator();
                   // Row firstrow=rows.next();
                    //Iterator<Cell> ce=firstrow.cellIterator();
                   // int k=0;
                    //int column=0;
   //                 while(ce.hasNext())
                    {
//                        Cell value=ce.next();
//                        if(value.getStringCellValue().equalsIgnoreCase("address"))
//                        {
//                            column+=k;
//                        }
//                        k++;

                    }
                   // System.out.println("column");
                    System.out.println("fount the sheet");
                }

            }


        }

    }

