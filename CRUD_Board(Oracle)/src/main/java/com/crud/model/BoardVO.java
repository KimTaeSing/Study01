package com.crud.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class BoardVO {
	
//게시판 번호
private int bno;
//제목
private String title;
//내용
private String content;
//작가
private String writer;
//날짜
private Date regdate;
// 수정 날짜
private Date updatedate;

}
