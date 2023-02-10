



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BookService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
    private EntityManager em = emf.createEntityManager();

    private EntityTransaction tx= em.getTransaction();

    public Book creatBook (long id , String title , Float unitCoast ) {

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setUnitCoast(unitCoast);
        tx.begin();
        em.persist(book);
        tx.commit();

        return book;
    }

    public void raiseUnitCoast (long id , Float r){

        Book book = em.find(Book.class , id);
        if (book != null) {
            tx.begin();
            book.setUnitCoast(book.getUnitCoast() + r);
            tx.commit();
        }
    }
    public void remove (Book book){
        tx.begin();
        em.remove(em.merge(book));
        tx.commit();
    }
    public Book findBook (long id)
    {
        return em.find(Book.class , id);

    }
}
