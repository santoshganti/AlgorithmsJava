package arrays.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SortDates {
    public static List<String> sortDates(List<String> dates) {

        // Sort list according to date.
        dates.sort(new Comparator<String>() {
            DateFormat df = new SimpleDateFormat("dd MMM yyyy");

            @Override
            public int compare(String s1, String s2) {
                try {
                    Date d1 = df.parse(s1);
                    Date d2 = df.parse(s2);
                    return d1.compareTo(d2);
                } catch (ParseException pe) {
                    System.out.println("erro: " + pe);
                    return 0;
                }
            }
        });



        return dates;
    }

    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.add("20 Oct 2052");
        string.add("06 Jun 1933");
        string.add("26 May 1960");
        string.add("20 Sep 1958");
        string.add("16 Mar 2068");
        string.add("25 May 1912");
        string.add("16 Dec 2018");
        string.add("26 Dec 2061");
        string.add("04 Nov 2030");
        string.add("28 Jul 1963");

//        string.add("01 Mar 2017");
//        string.add("03 Feb 2017");
//        string.add("15 Jan 1998");



        System.out.println(sortDates(string));
    }
}

