
public class Book {
	
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	
	public Book() {};
	
	public Book(String author_name, String book_title, String book_description) {
		this.author = author_name;
		this.title = book_title;
		this.description = book_description;
				
	}
	
	public void getDisplayText() {
		
		System.out.println(author+" "+title+" \n"+description);
	}

	/**
	 * @return the title
	 */
	private String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	private void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	private String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	private void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the description
	 */
	private String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	private void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	private double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	private void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the isInStock
	 */
	private boolean isInStock() {
		return isInStock;
	}

	/**
	 * @param isInStock the isInStock to set
	 */
	private void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

}


