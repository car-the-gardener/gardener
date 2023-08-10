package com.gardener.writer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gardener.exception.FindException;
import com.gardener.writer.service.WriterService;
import com.gardener.member.service.MemberService;
import com.gardener.member.dto.Member;

import com.google.gson.Gson;

@WebServlet("/writermember")
public class WriterMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WriterService service;	

    public WriterMemberController() {
    	service = WriterService.getInstance();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json; charset=UTF-8");
		
		int writerid = Integer.parseInt(request.getParameter("writerid"));
		System.out.println("writer:"+ writerid);
		
		HttpSession session = request.getSession();
		String memberJson = null;
		
		Member m = new Member();
		try {
			m = service.selectByWriter(writerid);
			session.setAttribute("writerid", writerid);
			Gson gson = new Gson();
			memberJson = gson.toJson(m);
			PrintWriter out;
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
        PrintWriter out = response.getWriter(); 
        out.print(memberJson);		
	}
}
