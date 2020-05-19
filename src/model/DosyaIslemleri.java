package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class DosyaIslemleri{
    static String path;
    
    private DosyaIslemleri(){
    }

    public static void dosyayaYaz(ObservableList list,String p) {
        path = p;
        try (BufferedWriter yazici = new BufferedWriter(new FileWriter(path))) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                yazici.write(list.get(i).toString());
                yazici.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static ObservableList dosyadanOku(String p) {
        path = p;
        ObservableList<Object> geciciList = FXCollections.observableArrayList();
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
