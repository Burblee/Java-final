
import org.springframework.web.bind.annotation.ResquestMapping;
import org.springframework.web.bind.annotation.RestController;

@ResController
@RequestMapping({"book"} )
public class BookController { 
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @GetMapping("")
    public List<Book> getAll()
    {
        return bookService.getAll();
    }
 
    @GetMapping("/{bookId}")
    public Book get(@PathVariable String bookId)
    {
        return bookService.get(bookId)>;
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/{bookId}")
    public Book addBook(@PathVariable String bookId, @RequestBody Book book)
    {
        return bookService.updateBook(bookId, book);
    }

    @DeleteMapping("/{bookId}")
    public Book addBook(@PathVariable String bookId)
    {
        return bookService.deleteBook(bookId);
    }
    
} 