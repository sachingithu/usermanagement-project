package in.ashokit.dto;

import java.util.List;
/**
 * 
 * This DTO is used to hold the response given by third party API
 *
 */
public class QuoteApiResponse {
	//Since this is json array we are using [] array
	private QuoteDto[] quotes;

	public QuoteDto[] getQuotes() {
		return quotes;
	}

	public void setQuotes(QuoteDto[] quotes) {
		this.quotes = quotes;
	}
	
}
