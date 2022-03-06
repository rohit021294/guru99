//package org.example;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class ExcelSheet {
//    public ArrayList<String> property() throws IOException {
//        ArrayList a = new ArrayList();
//        FileInputStream fis = new FileInputStream("C:\\Users\\Rohit\\Documents\\Custom Office Templates.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//        int count = workbook.getNumberOfSheets();
//        for (int i = 0; i < count; i++) {
//            if (workbook.getSheetName(i).equalsIgnoreCase("workspace")) {
//                XSSFSheet sheet = workbook.getSheetAt(i);
//                Iterator<Row> rows = sheet.iterator();
//                Row firstrow = rows.next();
//                Iterator<Cell> ce = firstrow.cellIterator();
//                int k = 0;
//                int column = 0;
//                while (ce.hasNext()) {
//                    Cell value = ce.next();
//                    if (value.getStringCellValue().equalsIgnoreCase("address")) {
//                        column = k;
//                    }
//                    k++;
//
//                }
//                a.add(column);
//                System.out.println("column");
//            }
//
//        }
//
//    }
