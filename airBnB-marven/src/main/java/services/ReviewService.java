package services;

import java.util.ArrayList;

import com.citadel.edu.model.Review;

public class ReviewService {
	public static ArrayList<Review> reviews = new ArrayList<Review>();
	
	public ReviewService() {
		
	}
	public ArrayList<Review> getReviews() {
		return reviews;
	}
	public void addReview(Review review) {
		reviews.add(review);
	}
}