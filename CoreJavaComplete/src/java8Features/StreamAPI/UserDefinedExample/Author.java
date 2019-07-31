package java8Features.StreamAPI.UserDefinedExample;

public class Author {

	private String name;
	private int bookCount;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String name, int bookCount) {
		super();
		this.name = name;
		this.bookCount = bookCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", bookCount=" + bookCount + "]";
	}
	
	
	
	
}
