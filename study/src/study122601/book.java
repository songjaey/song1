package study122601;

public class book {
	
	static int cnt=0; //클래스 변수
	
	private String title;  //인스턴트 변수
	String writer; //인스턴트 변수
	final int book_num; //인스턴스 변수
	
	book(){//생성자 메서드
		book_num=10;
	}
	
	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		book.cnt = cnt;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getBook_num() {
		return book_num;
	}

	static void init() {
		System.out.println("책 등록 시작");
	}
	
	void create() { // 인스턴스 메서드
		title="C언어";
		System.out.println("책 등록");
	}
	
}
// 인스턴스 변수는 인스턴스(객체) 생성해야지만 사용할 수있는 변수다.