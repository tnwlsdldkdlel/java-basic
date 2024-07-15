package class1.ex;

public class MovieReviewMain2 {

	public static void main(String[] args) {

		MovieReview[] movieReviews = new MovieReview[2];

		MovieReview movieReview = new MovieReview();
		movieReview.review = "인생은 무한 루프";
		movieReview.title = "인셉션";
		movieReviews[0] = movieReview;

		MovieReview movieReview2 = new MovieReview();
		movieReview2.review = "인생 시간 영화!";
		movieReview2.title = "어바웃 타임";
		movieReviews[1] = movieReview2;

		for (MovieReview review : movieReviews) {
			System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
		}
	}

}
