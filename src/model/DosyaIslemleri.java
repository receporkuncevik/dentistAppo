package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class DosyaIslemleri{
    static String path;

    public static void dosyayaYaz(ArrayList list,String p) {
        path = p;
        try (BufferedWriter yazici = new BufferedWriter(new FileWriter(path))) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                yazici.write(list.get(i).toString() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static ArrayList dosyadanOku(String p) {
        path = p;
        ArrayList geciciList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String oAnkiSatir;
            while ((oAnkiSatir = br.readLine()) != null) {
                geciciList.add(oAnkiSatir);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return geciciList;
    }
    
    
    
}
