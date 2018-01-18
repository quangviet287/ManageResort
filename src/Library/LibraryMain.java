package Library;

public class LibraryMain {
	public static void main(String[] args) {
		Book book1 = new Book("book 1");
		Book book2 = new Book("book 2");
		Book book3 = new Book("book 3");
		Book book4 = new Book("book 4");
		Music music1 = new Music("music 1");
		Music music2 = new Music("music 2");
		Music music3 = new Music("music 3");
		Music music4 = new Music("music 4");
		Video video1 = new Video("video 1");
		Video video2 = new Video("video 2");
		Video video3 = new Video("video 3");
		Video video4 = new Video("video 4");
		
		Library<Book> bookService = new Library<Book>("Book Service");
		bookService.addType(book1);
		bookService.addType(book2);
		bookService.addType(book3);
		bookService.addType(book4);
		
		Library<Music> musicService = new Library<Music>("Music Service");
		musicService.addType(music1);
		musicService.addType(music2);
		musicService.addType(music3);
		musicService.addType(music4);
		
		Library<Video> videoService = new Library<Video>("Video Service");
		videoService.addType(video1);
		videoService.addType(video2);
		videoService.addType(video3);
		videoService.addType(video4);
		
		bookService.deltype(book1);
		musicService.deltype(music2);
		videoService.deltype(video3);
		
		System.out.println("~~~~~~~~List Service~~~~~~~~");
		bookService.printLibrary();
		musicService.printLibrary();
		videoService.printLibrary();
		

	}

}
