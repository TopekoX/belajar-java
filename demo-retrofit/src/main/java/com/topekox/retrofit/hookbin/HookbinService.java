package com.topekox.retrofit.hookbin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface HookbinService {
	
	@POST("/yDOl8xg6R8sGkPZGapeE")
	Call<HookbinResponse> testPost(@Body HookbinRequest request);

}
