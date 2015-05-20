package com.eventwarning.bean;

import java.util.List;
import java.util.Map;

import com.eventwarning.dbImpl.DBOperation;

public class KeyWord {
	public int keywordID;
	public String keyword;
	public int count;
	public int eventID;
	public String wordType;
	public int sumcount;
	
	public KeyWord(Map row){//�����ݿ�������ݣ�ͨ�������н����¼�����
		this.keywordID = Integer.parseInt(row.get("keywordID").toString());
		this.keyword = row.get("keyword").toString();
		this.count = Integer.parseInt(row.get("count").toString());
		this.eventID = Integer.parseInt(row.get("eventID").toString());
		this.wordType = row.get("wordType").toString();
		if(row.get("sum(count)")!=null)
			this.sumcount = Integer.parseInt(row.get("sum(count)").toString());
		else
			this.sumcount = count;
	}
	public static List<KeyWord> GetKeyWordList(int num){
		return DBOperation.GetKeyWordList(num, 0);
	}
}
