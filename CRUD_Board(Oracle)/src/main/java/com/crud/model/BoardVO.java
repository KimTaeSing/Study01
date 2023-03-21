package com.crud.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// LomBok 라이브러리 사용하여 getter setter ToString 자동생성 하였음 
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
