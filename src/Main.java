public class Main {
    public static void main(String[] args) {
        System.out.println("Level easy");
        Author stephenKing = new Author("Stephen", "King");
        Book firstBook = new Book("Desperation", stephenKing, 1997);
        System.out.println(firstBook.getPublishYear());

        Author joshuaBloch = new Author("Joshua", "Bloch");
        Book secondBook = new Book("Effective java", joshuaBloch, 2015);
        secondBook.setPublishYear(2020);
        System.out.println(secondBook.getPublishYear());

        System.out.println("Authors:");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("===============");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));

        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("================");

    }
}