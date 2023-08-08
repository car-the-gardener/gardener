package com.gardener.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gardener.exception.FindException;
import com.gardener.member.dto.Member;
import com.gardener.member.service.MemberService;
import com.google.gson.Gson;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service;
    public LoginController() {
       service = MemberService.getInstance();       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//��û���޵����� ���
		String loginId = request.getParameter("loginId");		//hello
		String pwd = request.getParameter("pwd");	//kitty
		
		//���Ǿ��
		HttpSession session = request.getSession();
		session.setAttribute("loginId", loginId);
		
		String memberJson = null;
		try {
			Member m = service.login(loginId, pwd);
			session.setAttribute("loginedId", loginId);
//			Gson gson = new Gson();
			System.out.println("test:" + m);		
//			memberJson = gson.toJson(m);
			memberJson = "1"; 			//�α��μ���
		} catch (FindException e) {			
			e.printStackTrace();
			memberJson = "0";			//�α��ν���
		}
		PrintWriter out = response.getWriter();		
		System.out.println(memberJson);
		out.print(memberJson);
//		response.getWriter().print(memberJson);
	}

}