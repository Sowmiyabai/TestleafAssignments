package week2.day1;

public class Library {
	
	public String addBook()
	{
		System.out.println("Book added successfully");
		return "myBook";
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		
		Library books = new Library();
		String newBook = books.addBook();
		System.out.println(newBook);
		books.issueBook();

	}
	

}
