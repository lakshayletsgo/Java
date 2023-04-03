//import java.util.Objects;
//
//class Holiday{
//    private String name;
//    private int day;
//    private String month;
//    Holiday(String name, int day, String month){
//        this.name = name;
//        this.day = day;
//        this.month = month;
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public String getMonth() {
//        return month;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//}
//public class Java_40 {
//    public static boolean inSameMonth(Holiday h1, Holiday h2){
//        return Objects.equals(h1.getMonth(), h2.getMonth());
//
//    }
//    public static double avgDate(Holiday h1[]){
//        int sum = 0;
//        for(int i=0;i<h1.length;i++){
//            sum = sum +h1[i].getDay();
//        }
//        return (double)sum/h1.length;
//    }
//    public static void main(String[] args) {
//        Holiday h1 = new Holiday("Independence Day",4,"July");
//        System.out.println(h1.getName()+" is the name of the day and the date is "+h1.getDay()+" and the month is "+h1.getMonth());
//    }
//}

import java.util.Objects;

class Movie{
    private String title;
    private String studio;
    private String rating;
    Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating=  "PG";
    }

    public String getRating() {
        return rating;
    }

    public String getStudio() {
        return studio;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
public class Java_40 {
    public static Movie[] getPg(Movie m1[]){
        int m=0;
        Movie[] m2 = new Movie[m1.length];
        for(int i=0;i<m1.length;i++){

            if(Objects.equals(m1[i].getRating(), "PG")){
                m2[m].setRating( m1[i].getRating());
                m2[m].setStudio(m1[i].getStudio());
                m2[m].setTitle(m1[i].getTitle());
                m++;
            }else{
                continue;
            }
        }
        return m2;

    }
    public static void main(String[] args) {
        Movie m1  = new Movie("Casino Royale","Eon Production","PG-13");
    }
}

