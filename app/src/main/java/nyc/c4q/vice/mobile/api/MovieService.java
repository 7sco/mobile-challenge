package nyc.c4q.vice.mobile.api;

import nyc.c4q.vice.mobile.model.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {
  @GET("movie/now_playing")
  Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String key);

  @GET("movie/popular")
  Call<MovieResponse> getPopularMovies(@Query("api_key") String key);
}