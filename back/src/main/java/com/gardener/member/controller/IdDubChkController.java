package com.gardener.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gardener.exception.FindException;
import com.gardener.member.dto.Member;
import com.gardener.member.service.MemberService;

@WebServlet("/iddupchk")
public class IdDubChkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService service;      
    public IdDubChkController() {
        service = MemberService.getInstance();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String loginId=request.getParameter("idcheck");
		String memberJson = null;
		try {
			service.idDupChk(loginId);
			memberJson = "1";		//사용 가능한 아이디
			System.out.println("사용 가능한 아이디 입니다");
		} catch (FindException e) {
			memberJson = "0";		//중복 아이디
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		System.out.println(memberJson);
		out.print(memberJson);		
	}
}
