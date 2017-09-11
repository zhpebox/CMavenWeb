namespace java com.pengthrift.bookPro

struct BookModel {
        1: string bookName,
        2: string author,
		3: i32 year,
    }

service BookService {
    
	/**
	* get a book method
	*/
    string addBook(1:BookModel book),
	
	BookModel getBook(1:string bookName)
}
