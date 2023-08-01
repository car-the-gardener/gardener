package com.gardener.member.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Member {
	
	private String id;      //아이디
	private String pwd;     //패스워드
	private String email;   //이메일
	private String name;    //필명
	private String intro;   //자기소개
	private String joinDate;   //가입날짜
	private String profile; //프로필사진 
	
	
}
