/**
 * 
 */
package com.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Docs
 * 
 * @author Akshit Kaushik Ctrl + Shit + O
 * 
 */
public class WelcomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		System.out.println("This goes to monitor");
		out.println("This goes to the client");
		
		out.println("<br>request.getAuthType(): "+request.getAuthType());
		out.println("<br>request.getCharacterEncoding(): "+request.getCharacterEncoding());
		out.println("<br>request.getContentLength(): "+request.getContentLength());
		out.println("<br>request.getContentType(): "+request.getContentType());
		out.println("<br>request.getLocalAddr(): "+request.getLocalAddr());
		out.println("<br>request.getLocalName(): "+request.getLocalName());
		out.println("<br>request.getLocalPort(): "+request.getLocalPort());
		out.println("<br>request.getMethod(): "+request.getMethod());
		out.println("<br>request.getPathInfo(): "+request.getPathInfo());
		out.println("<br>request.getPathTranslated(): "+request.getPathTranslated());
		out.println("<br>request.getProtocol(): "+request.getProtocol());
		out.println("<br>request.getQueryString(): "+request.getQueryString());
		out.println("<br>request.getRemoteAddr(): "+request.getRemoteAddr());
		out.println("<br>request.getRemoteHost(): "+request.getRemoteHost());
		out.println("<br>request.getRemotePort(): "+request.getRemotePort());
		out.println("<br>request.getRequestedSessionId(): "+request.getRequestedSessionId());
		out.println("<br>request.getRequestURI(): "+request.getRequestURI());
		out.println("<br>request.getScheme(): "+request.getScheme());
		out.println("<br>request.getServerName(): "+request.getServerName());
		out.println("<br>request.getServerPort(): "+request.getServerPort());
		out.println("<br>request.getServletPath(): "+request.getServletPath());
		
		
		Enumeration enumHeader = request.getHeaderNames();
		while(enumHeader.hasMoreElements()){
			String name = (String)enumHeader.nextElement();
			out.println("<br>" + name + " : " + request.getHeader(name));
		}
		out.println("<br>request.getLocale(): "+request.getLocale());
		out.close();
		
	}

}
