package class1.ex;

public class MovieReviewMain {

	public static void main(String[] args) {

		MovieReview movieReview = new MovieReview();
		movieReview.review = "인생은 무한 루프";
		movieReview.title = "인셉션";

		MovieReview movieReview2 = new MovieReview();
		movieReview2.review = "인생 시간 영화!";
		movieReview2.title = "어바웃 타임";

		System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
		System.out.println("영화 제목: " + movieReview2.title + ", 리뷰: " + movieReview2.review);
	}

}
