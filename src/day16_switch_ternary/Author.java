package day16_switch_ternary;

public class Author {
    public static void main(String[] args) {
        String genre = "Fantasy";
        int pageLength=0;
        double profit=0;
        int sequels=0;
        int countries=0;

        if (genre.equals("Fantasy"));
        switch ("Fantasy") {
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                System.out.println(genre + " genre selected.");
                System.out.println("pageLength = " + pageLength);
                System.out.println("profit = " + profit);
                System.out.println("sequels = " + sequels);
                System.out.println("countries = " + countries);
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                System.out.println(genre + " genre selected.");
                System.out.println("pageLength = " + pageLength);
                System.out.println("profit = " + profit);
                System.out.println("sequels = " + sequels);
                System.out.println("countries = " + countries);
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 40;
                System.out.println(genre + " genre selected.");
                System.out.println("pageLength = " + pageLength);
                System.out.println("profit = " + profit);
                System.out.println("sequels = " + sequels);
                System.out.println("countries = " + countries);
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                System.out.println(genre + " genre selected.");
                System.out.println("pageLength = " + pageLength);
                System.out.println("profit = " + profit);
                System.out.println("sequels = " + sequels);
                System.out.println("countries = " + countries);
            default:
                System.out.println("Invalid genre..");
        }

        }
    }

