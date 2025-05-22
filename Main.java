public class Main {

    public static void main(String[] args) {
        int marks = 75;


        if (marks >= 90) {
            System.out.println("A grade");
        } else if (marks >= 75) {
            System.out.println("B grade");
        } else if (marks >= 65) {
            System.out.println("C grade");
        } else if (marks >= 45) {
            System.out.println("D grade");
        } else {
            System.out.println("Grade: F");
        }
    }
}