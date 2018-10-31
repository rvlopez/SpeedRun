package test.speedrun.data

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import test.speedrun.BuildConfig
import test.speedrun.data.datasource.SpeedRunApi
import java.util.concurrent.TimeUnit

class ServiceFactory {

    companion object {

        @JvmStatic
        fun createRetrofitService(baseUrl: String): SpeedRunApi {
            val retrofitBuilder = Retrofit.Builder()

            retrofitBuilder.baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(createBaseClient())

            return retrofitBuilder.build().create(SpeedRunApi::class.java)
        }

        @JvmStatic
        private fun createBaseClient(): OkHttpClient {
            return OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = if (BuildConfig.DEBUG) {
                        HttpLoggingInterceptor.Level.BODY
                    } else {
                        HttpLoggingInterceptor.Level.NONE
                    }
                })
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build()
        }
    }
}