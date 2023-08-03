package com.gardener.member.dto;

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
   
   
}
