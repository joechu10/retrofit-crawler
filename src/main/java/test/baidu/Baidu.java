package test.baidu;

import com.github.qlone.Call;
import com.github.qlone.http.POST;
import com.github.qlone.http.RelativeUrl;

/**
 * @author heweinan
 * @date 2020-10-29 16:32
        */
public interface Baidu {

    @POST("/")
    Call<Accept> html();

    @POST()
    Call<GuoneiBean> guonei(@RelativeUrl String relative);
}
