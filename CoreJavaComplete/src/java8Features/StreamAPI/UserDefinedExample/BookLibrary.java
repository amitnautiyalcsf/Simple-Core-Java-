package java8Features.StreamAPI.UserDefinedExample;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
	
	private static List<Book> bookList= new ArrayList<>();
	
	static
	{
		
		bookList.add(new Book("Java", new Author("Ammy", 8), 2017));
		bookList.add(new Book("SQL", new Author("Sonu", 2), 2010));
		bookList.add(new Book("Automation", new Author("Manu", 3), 1998));
		bookList.add(new Book("React", new Author("Varun", 9), 2002));
		bookList.add(new Book("Dotnet", new Author("Ankur", 7), 2003));
		bookList.add(new Book("SAP", new Author("Vishal", 6), 2006));
		
	}

	public static List<Book> getBookList() {
		
		return bookList;
	}

}
