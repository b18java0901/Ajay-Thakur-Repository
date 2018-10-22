

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author john
 */

class HDTV {
private int size;
private String brand;
public HDTV(int size, String brand) {
                this.size = size;
                this.brand = brand;
        }
public int getSize() {
                return size;
        }
public void setSize(int size) {
                this.size = size;
        }
public String getBrand() {
                return brand;
        }
public void setBrand(String brand) {
                this.brand = brand;
        }
}




class BrandComparator implements Comparator<HDTV> {
@Override
public int compare(HDTV tv1, HDTV tv2) {
                String tv1brand=tv1.getBrand();
         String tv2brand=tv2.getBrand();
                
           int i=tv1brand.compareToIgnoreCase(tv2brand);
                
           
return i;

}
}
class SizeComparator implements Comparator<HDTV> {
@Override
public int compare(HDTV tv1, HDTV tv2) {
                int tv1size=tv1.getSize();
                int tv2size=tv2.getSize();
                
        if(tv1size<tv2size)
            return -1;
        else if(tv1size>tv2size)
            return 1;
        else
            return 0;
}
} 

public class SortDemo {
    public static void main(String[] args) {
                HDTV tv1 = new HDTV(55, "Samsung");
                HDTV tv2 = new HDTV(60, "LG");
                HDTV tv3 = new HDTV(42, "Panasonic");
                HDTV tv4 = new HDTV(32, "Micromax");
ArrayList<HDTV> al = new ArrayList<HDTV>();
                al.add(tv1);
                al.add(tv2);
                al.add(tv3);
                al.add(tv4);
                System.out.println(al);
                
               
            //BrandComparator sc=new BrandComparator();
            SizeComparator sc=new SizeComparator();
Collections.sort(al,sc);
                for (HDTV a : al) {
                        System.out.println(a.getBrand()+a.getSize());
                }
        }
    
}




