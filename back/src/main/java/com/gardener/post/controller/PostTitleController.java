package com.gardener.post.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gardener.exception.FindException;
import com.gardener.post.dto.Post;
import com.gardener.post.service.myPostService;
import com.google.gson.Gson;


@WebServlet("/posttitle")
public class PostTitleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private myPostService service;
	
	public PostTitleController() {
		service = myPostService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");

		response.setContentType("application/json; charset=UTF-8");
		//요청 데이터 얻기
		

	//	String userNumStr = request.getParameter("userNum");
	//	int userNum = Integer.parseInt(userNumStr); 
	//	int userNum = Integer.parseInt(request.getParameter("userNum"));
	//	userNum = 4;
		String mainTitle = request.getParameter("mainTitle"); 

		System.out.println("maintitle:" + mainTitle);
		
		HttpSession session = request.getSession();
		String memberJson = null;
		
		List<Post> listPost = new ArrayList<Post>();
		try {
			listPost = service.selectById(mainTitle);
			session.setAttribute("listPost", listPost); 
			Gson gson = new Gson();
			memberJson = gson.toJson(listPost);
		} catch (FindException e) {
			e.printStackTrace();
		}
        		
        PrintWriter out = response.getWriter(); 
        out.print(memberJson);
	}
}


//ArrayList<Post> listPost = new ArrayList<Post>();
//repository.selectById(userNum);
//return listPost;