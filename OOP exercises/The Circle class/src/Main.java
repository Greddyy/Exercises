public class Main{
    public static void main(String[] args) {

//        Circle c1 = new Circle();
//
//        System.out.println("The circle has radius of "
//                + c1.getRadius() + " and area of " + c1.getArea());
//
//
//        Circle c2 = new Circle(2.0);
//
//        System.out.println("The circle has radius of "
//                + c2.getRadius() + " and area of " + c2.getArea());
//
//        Circle c4 = new Circle();   // construct an instance of Circle
//        c4.setRadius(5.5);          // change radius
//        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
//        c4.setColor("green");       // Change color
//        System.out.println("color is: " + c4.getColor());   // Print color via getter

        Author author = new Author("Tah an heck","tadas@one.lt",'m');
//        System.out.println(author);
//        author.setEmai("tadinis@onel.lt");
//        System.out.println("Name is " + author.getName());
//        System.out.println("email is " + author.getEmai());
//        System.out.println("gender is " + author.getGender());
        Book book = new Book("Java for dummies",  author, 20.5, 20);
        System.out.println(book);
        book.setPrice(28);
        book.setQuantity(21);
        System.out.println("name is: " + book.getName());
        System.out.println("author is: " + book.getAuthor());
        System.out.println("qty is :" + book.getQuantity());
        System.out.println("price is :" + book.getPrice());
        System.out.println("Authors name is " + book.getAuthor().getName());
        System.out.println("Authors email is " + book.getAuthor().getEmai());

        Book anotherbook = new Book("more java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);

    }
}