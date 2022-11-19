package mr.sardorek.myonlinewallpaper.nutworking

import mr.sardorek.myonlinewallpaper.model.ResponseItem
import mr.sardorek.myonlinewallpaper.model.User
import mr.sardorek.myonlinewallpaper.modelSearch.Welcome
import mr.sardorek.myonlinewallpaper.modelSearchFrag.CollectionsModelItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HomeService {

    //fragment1 all
    @GET("photos/random?count=1000")
    fun listPhotos1(): Call<ArrayList<ResponseItem>>

    @GET("search/photos?page=1&per_page=19&query=")
    fun searchPhotos(@Query("page") page: Int, @Query("query") search: String): Call<Welcome>

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<User>

    @GET("photos/{id}")
    fun getImagesCategories(@Path("id") id: String): Call<Result>

    @GET("collections/")
    fun getCollections(): Call<List<CollectionsModelItem>>
}
