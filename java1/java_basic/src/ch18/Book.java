package ch18;

public class Book {

	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title;
	}

	@Override
	public boolean equals(Object obj) {
		// 도전과제!
		// 1. 단계 this.title과 Object 녀석 title 값이 같다면 같은 책이라고 앞으로 판별 하겠어!
		// 2. Object 타입은 모든 클래스의 최상위 이기 때문에 아무것이든 들어 올 수 있다.
		//3. 추가적인 데이터가 필요하다면 코드를 추가하면 된다.
		if (obj instanceof Book) {
			Book temBook = (Book)obj;
			if (this.title == temBook.title && this.author == temBook.author) {
				return true;
			} 
		}
		return false;

	}

}
