package com.gardener.member.dto;

<<<<<<< HEAD
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Member {
   
   private int id;      //아이디
   private String loginId; //로그인아이디
   private String pwd;     //패스워드
   private String email;   //이메일
   private String name;    //필명
   private String intro;   //자기소개
   private String joinDate;   //가입날짜
   private String profile; //프로필사진 
   
   
=======
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Member {
	 private String id;      		//�븘�씠�뵒
	 private String pwd;     		//�뙣�뒪�썙�뱶
	 private String email;   		//�씠硫붿씪
	 private String name;   		//�븘紐�
	 private String intro;  		//�옄湲곗냼媛�
	 private String joinDate;   	//媛��엯�궇吏�
	 private String profile; 		//�봽濡쒗븘�궗吏� 
>>>>>>> 21611a7624e77cf682f16ae501571903703724c6
}
