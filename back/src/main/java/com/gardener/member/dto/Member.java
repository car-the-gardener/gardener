package com.gardener.member.dto;

<<<<<<< HEAD
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Member {
   
   private int id;      //���̵�
   private String loginId; //�α��ξ��̵�
   private String pwd;     //�н�����
   private String email;   //�̸���
   private String name;    //�ʸ�
   private String intro;   //�ڱ�Ұ�
   private String joinDate;   //���Գ�¥
   private String profile; //�����ʻ��� 
   
   
=======
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Member {
	 private String id;      		//아이디
	 private String pwd;     		//패스워드
	 private String email;   		//이메일
	 private String name;   		//필명
	 private String intro;  		//자기소개
	 private String joinDate;   	//가입날짜
	 private String profile; 		//프로필사진 
>>>>>>> 21611a7624e77cf682f16ae501571903703724c6
}
