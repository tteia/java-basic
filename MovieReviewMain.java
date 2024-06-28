package 클래스와_데이터;

import java.util.ArrayList;
import java.util.List;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        // 영화 리뷰 정보 출력
        List<MovieReview> movies = new ArrayList<>();

        MovieReview inception = new MovieReview();
        inception.setTitle("인셉션");
        inception.setReview("인생은 무한 루프");
        movies.add(inception);

        MovieReview aboutTime = new MovieReview();
        aboutTime.setTitle("어바웃 타임");
        aboutTime.setReview("인생 시간 영화!");
        movies.add(aboutTime);

        for (MovieReview movie : movies) {
            System.out.print("영화 제목 : " + movie.getTitle());
            System.out.println(", 영화 리뷰 : " + movie.getReview());
        }


    }
}
