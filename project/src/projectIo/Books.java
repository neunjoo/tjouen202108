package projectIo;

import java.io.Serializable;
import java.time.LocalDate;

public class Books implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String sub_Title;
	private String Writer;
	private String publisher;
	private int price;
	private LocalDate publication_Date;
	
	
	public Books(int id, String title, String sub_Title, String writer, String publisher, int price,
			LocalDate publication_Date) {
		super();
		this.id = id;
		this.title = title;
		this.sub_Title = sub_Title;
		Writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.publication_Date = publication_Date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSub_Title() {
		return sub_Title;
	}
	public void setSub_Title(String sub_Title) {
		this.sub_Title = sub_Title;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getPublication_Date() {
		return publication_Date;
	}
	public void setPublication_Date(LocalDate publication_Date) {
		this.publication_Date = publication_Date;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", sub_Title=" + sub_Title + ", Writer=" + Writer
				+ ", publisher=" + publisher + ", price=" + price + ", publication_Date=" + publication_Date + "]";
	}


}
