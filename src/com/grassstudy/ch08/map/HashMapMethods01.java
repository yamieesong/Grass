package com.grassstudy.ch08.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapMethods01 {

	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("FileName", "LOVE");
		map1.put("FileType", "txt");
		map1.put("FIleSize", "5000");
		map1.put("FileMake", "20220715");
		
		
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("FileName", "study");
		map2.put("FileTYpe", "php");
		map2.put("FileSize", "5000");
		map2.put("FileMake", "20220214");
		
		
		List<Map> list = new ArrayList<Map>();
		list.add(map1);
		list.add(map2);
		
		//자료구조
		System.out.println(""+list.get(1).keySet());
		System.out.println((list.get(1)).get("FileTYpe"));
		System.out.println("입력된 리스트의 개수는 "+list.size()+"개");
		
		//Map2의 FileSize를 불러오기
		System.out.println(map2.get("FileSize"));
		
		
		// list<listVO> = listDAO.sqlid
		// return selectone.sqlid; (selectone은 쿼리 조회값이 1개만 나와야 함)
		

	}
	
	

	public  static Map selectOne() {
		Map<String, String> map2 = new HashMap<String, String>();
		return map2;
		
	}

	public static List selectList() {
		List<Map> list = new ArrayList<Map>();
		return list;
		
	}
}
