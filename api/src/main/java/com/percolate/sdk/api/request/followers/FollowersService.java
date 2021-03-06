package com.percolate.sdk.api.request.followers;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Follower;
import com.percolate.sdk.dto.Followers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Percolate v4/followers API definition.
 */
interface FollowersService {

    @GET(Endpoints.API_V4_PATH + "/follower/")
    Call<Followers> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/follower/")
    Call<Followers> create(@Body List<Follower> followers);

    @DELETE(Endpoints.API_V4_PATH + "/follower/{follower_id}")
    Call<ResponseBody> delete(@Path("follower_id") String followerId);
}
