package com.topekox.retrofit.hookbin;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class HookbinApp {
	
	public static void main(String[] args) throws IOException {
		
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://hookb.in")
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		
		HookbinService hookbinService = retrofit.create(HookbinService.class);
		
		HookbinRequest request = HookbinRequest.builder()
				.id("1")
				.name("Ucup")
				.build();
				
		Call<HookbinResponse> call = hookbinService.testPost(request);
		HookbinResponse response = call.execute().body();
		
		System.out.println(response);
	}

}
