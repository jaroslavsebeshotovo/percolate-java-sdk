package com.percolate.sdk.rxjava.request.preview;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Preview;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Percolate v5/preview API definition.
 */
interface PreviewServiceRx {

    @POST(Endpoints.API_V5_PATH + "/preview/")
    Observable<Preview> create(@Body Map body);

}
