import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("istanbul");
        sehirler.add("ankara");
        sehirler.add("aydın");
        sehirler.add("izmir");

        sehirler.remove("istanbul");
        Collections.sort(sehirler);
        for(String sehir:sehirler){
        System.out.println(sehir);
        }


    }
}
