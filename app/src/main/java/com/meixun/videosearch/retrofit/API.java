package com.meixun.videosearch.retrofit;


import com.meixun.videosearch.bean.AndroidPlayBannerBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * YONG_
 */
public interface API {

    /**
     * 玩安卓轮播图
     */
    @GET("banner/json")
    Observable<BaseResultBean<List<AndroidPlayBannerBean>>> getAndroidPlayBanner();
}
