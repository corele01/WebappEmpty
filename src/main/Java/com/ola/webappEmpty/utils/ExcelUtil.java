package com.ola.webappEmpty.utils;

import com.ola.workOrder.model.WorkOrder;
import com.ola.workOrder.utils.dataConst.DataConst_1;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelUtil {
    public static String exportExecl(List<WorkOrder> list, String path){
        String[] strings= DataConst_1.EXECL_TITLE;

        FileOutputStream fileOutputStream =null;

        HSSFWorkbook workbook = new HSSFWorkbook();

        HSSFSheet sheet = workbook.createSheet();

        sheet.setDefaultColumnWidth((short)15);

        HSSFRow row = sheet.createRow(0);
        System.out.println(strings.length);
        for (int i=0;i<strings.length;i++){

            HSSFCell cell= row.createCell(i);
            cell.setCellValue(strings[i]);
        }

        for (int i = 1;i<=list.size();i++){
            HSSFRow row1= sheet.createRow(i);
            //Field[] fields=WorkOrder.class.getDeclaredFields();
//            for (int j=0;i<21;j++){
//                HSSFCell cell = row1.createCell(j);
//                cell.setCellValue(list.get(i-1).getId());
//            }
            row1.createCell(0).setCellValue(list.get(i-1).getId());
            row1.createCell(1).setCellValue(list.get(i-1).getCreateDate());
            row1.createCell(2).setCellValue(list.get(i-1).getCreateTime());
            row1.createCell(3).setCellValue(list.get(i-1).getName());
            row1.createCell(4).setCellValue(list.get(i-1).getTel());
            row1.createCell(5).setCellValue(list.get(i-1).getCarnum());
            int mileage=0;
            if ((list.get(i-1).getMileage()) != null){
                mileage=list.get(i-1).getMileage();
            }
            row1.createCell(6).setCellValue(mileage);
            row1.createCell(7).setCellValue(list.get(1-1).getOrders());
            row1.createCell(8).setCellValue(list.get(1-1).getWorkorderpro());
            row1.createCell(9).setCellValue(list.get(1-1).getProblemtype());
            row1.createCell(10).setCellValue(list.get(i-1).getProblem());
            row1.createCell(11).setCellValue(list.get(i-1).getCustomerrequest());
            row1.createCell(12).setCellValue(list.get(i-1).getAcceptancer());
            row1.createCell(13).setCellValue(list.get(i-1).getDepartment());
            row1.createCell(14).setCellValue(list.get(i-1).getOrderser());
            row1.createCell(15).setCellValue(list.get(i-1).getOpinion());
            row1.createCell(16).setCellValue(list.get(i-1).getReplydate());
            row1.createCell(17).setCellValue(list.get(i-1).getReplytime());
            row1.createCell(18).setCellValue(list.get(i-1).getActualreplydate());
            row1.createCell(19).setCellValue(list.get(i-1).getActualreplytime());
            row1.createCell(20).setCellValue(list.get(i-1).getSturts());

        }
//        HSSFRow row = sheet.createRow(0);
//
//        HSSFCell cell = row.createCell(0);
//
//        cell.setCellValue("12323");

        //String path=DataConst_2.FILE_EXCEL_PATH+DateUtil.getDates()+".xls";

        try {
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream !=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return path;
    }
}
