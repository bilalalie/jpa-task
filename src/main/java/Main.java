public class Main {
    public static void main(String[] args) {
        BookService bn = new BookService();
        Book book = bn.creatBook(12,"bilal",12.3F);
        book = bn.findBook(book.getId());
        System.out.println(book);

    }



}
