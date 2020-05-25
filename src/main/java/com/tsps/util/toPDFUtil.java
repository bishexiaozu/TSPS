package com.tsps.util;

import com.aspose.cells.Workbook;
import com.aspose.slides.Presentation;
import com.aspose.words.Document;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author: luxinnan
 * @Date: 2020/5/25 17:44
 * @Discription:
 * @Modified:
 */
public class toPDFUtil {
    public static void transDOC(String fromPath,String toPath) {
        try {
            Document document = new Document(new FileInputStream(fromPath));
            document.save(toPath, com.aspose.words.SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void transPPT(String fromPath,String toPath){
        try {
            Presentation presentation = new Presentation(new FileInputStream(fromPath));
            presentation.save(toPath, com.aspose.slides.SaveFormat.Pdf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void transXLS(String fromPath,String toPath) {
        try {
            Workbook workbook = new Workbook(new FileInputStream(fromPath));
            workbook.save(toPath, com.aspose.cells.SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
