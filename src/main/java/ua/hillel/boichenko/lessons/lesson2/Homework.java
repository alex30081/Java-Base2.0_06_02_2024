package ua.hillel.boichenko.lessons.lesson2;

public class Homework {
    public static void main(String[] args) {
        int degres = 51;
        int degres1 = 10;
        int degres2 = 44;
        int degres3 = 1;
        int degres4 = 49;
        int degres5 = 34;
        char chary = '\u00B0';

        System.out.print("Stonehenge, UK, Geographic :" + "\n");
        System.out.print("DMS Lat " + degres
                + chary + degres1 + "." + degres2 + "''" + "N; "
                + "DMS Long " + degres3 + chary + degres4 + "."
                + degres5 + "''" + "W");
    }
}
