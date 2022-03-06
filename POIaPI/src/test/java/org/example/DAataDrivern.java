package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DAataDrivern {
  public ArrayList<String> getData(String testcase) throws IOException {
        ArrayList<String> a = new ArrayList<String>();
        FileInputStream fis = new FileInputStream("C:\\Users\\Rohit\\Documents\\Demodata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            // System.out.println(workbook.getSheetName(i));
            if (workbook.getSheetName(i).equalsIgnoreCase("workspace")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstrow = rows.next();
                Iterator<Cell> ce = firstrow.cellIterator();
                int k = 0;
                int cploumn = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();
                    if (value.getStringCellValue().equalsIgnoreCase("testcases")) {
                        cploumn = k;
                    }
                    k++;
                }
                System.out.println(cploumn);
                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(cploumn).getStringCellValue().equalsIgnoreCase(testcase)) {
                        Iterator<Cell> cell = r.cellIterator();
                        while (cell.hasNext())
                        {
                            Cell c=cell.next();
                            if(c.getCellTypeEnum() == CellType.STRING)
                            {
                                a.add(c.getStringCellValue());
                            }
                            else
                            {
                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }
                        }
                    }
                }
            }

        }


//        for (String a1:a)
//        {
//            System.out.println(a1);
//
//        }

        return a;

    }

}

