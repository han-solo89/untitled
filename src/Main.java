public class Main {
    public static void main(String[] args) {

        System.out.println("lever easy");
        Author stepenKing = new Author("Stephen", "King");
        Book firstBook = new Book("Desperation",stepenKing, 1997);

        Book secondBook = new Book("Effective java", new Author("Joshua","Bloch"), 2015);
        firstBook.setPublishYear(2020);
        System.out.println(firstBook.getPublishYear());

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 =new Author("Stephen","King");
        Author stephenieMeyer =new Author("" + "Stephenie","Meyer");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCore: " + (stepenKing.hashCode() ==stephenKing2.hashCode()));
        System.out.println("Author equal: " + stepenKing.equals(stephenieMeyer));
        System.out.println("Author equal by hashCore: " + (stephenKing.hashCode() == stephenieMeyer.hashCode()));

        System.out.println(stephenKing);
        System.out.println(stephenieMeyer);

        System.out.println("==========================================");

        System.out.println("Books: ");
        Book carrie = new Book("Carrie", stephenKing, 1974);
        Book carrie2 = new Book("Carrie", stephenKing, 1974);
        Book twilight = new Book("Twilight", stephenieMeyer, 2005);
        System.out.println("Book copies equal: " + carrie.equals(carrie2));
        System.out.println("Book copies equal by hashCode: " + (carrie.hashCode() == carrie2.hashCode()));
        System.out.println("Book equal: " + carrie.equals(twilight));
        System.out.println("Book equal by hashCode: " + (carrie.hashCode() == twilight.hashCode()));
        System.out.println(carrie);
        System.out.println(twilight);

        System.out.println("===========================================");


    }
}
