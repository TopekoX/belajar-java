package com.topekox.retrofit.hookbin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HookbinRequest {
	
	private String id;
	private String name;

}
