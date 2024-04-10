package in.ashokit.dto;
//This DTO for getting response from third party api
public class QuoteDto {
	private String text;
	private String quote;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	
}
