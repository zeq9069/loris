package org.kyrin.loris.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kyrin.loris.servlet.service.UserService;

@WebServlet("/user_create")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = -6101738315729178913L;

	private UserService userService;

	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}

	/**
	 * 进入 创建用户 页面
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	/**
	 * 处理 创建用户 请求
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
