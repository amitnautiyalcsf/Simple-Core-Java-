package java8Features.StreamAPI.UserDefinedExample;

import java.util.List;
import java.util.Objects;

public class TestBookDemo {

	public static void main(String[] args) {
		
		List<Book>booklist= BookLibrary.getBookList();
	// List of authors and books published after 2002
		
		for (Book book : booklist){
			
			if(book!=null && book.getYear()>2002)
			{
				System.out.println(book.getAuthor().getName()+ " : " + book.getYear());
				
			}
		}
		
		// Same thing using Stream
		
		
		booklist.stream()
		        .filter(b->b.getYear()>2002)
		        .map(Book::getAuthor)
		        .filter(Objects::nonNull)
		        .map(Author::getName)
		        .forEach(System.out::println);
		        
		
		
	}
}
