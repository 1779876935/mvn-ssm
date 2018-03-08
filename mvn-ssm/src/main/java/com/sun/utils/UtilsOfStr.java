package com.sun.utils;

import com.alibaba.fastjson.JSON;

public class UtilsOfStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String getJsonStr4obj(Object obj){
		String jsonString = "";
		if(obj != null){
			jsonString = JSON.toJSONString(obj);
		}
		System.out.println(jsonString.hashCode());
		System.out.println(jsonString.hashCode());
		return jsonString;
	}

}
