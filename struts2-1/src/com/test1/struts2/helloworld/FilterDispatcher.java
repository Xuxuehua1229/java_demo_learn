package com.test1.struts2.helloworld;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterDispatcher
 */
@WebFilter({ "/FilterDispatcher", "*.action" })
public class FilterDispatcher implements Filter {

	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String path = null;
		// 1.��ȡ ServletPath
		String servletPath = req.getServletPath();
		System.out.println("servletPath:"+servletPath);
		// 2.�ж� ServletPath , ������� "/product-input.action",��ת���� WEB-INF/pages/input.jsp
		if("/product-input.action".equals(servletPath)) {
			path = "WEB-INF/pages/input.jsp";
		}
		// 3.������� "/product-save.action",��ת���� WEB-INF/pages/details.jsp
		if("/product-save.action".equals(servletPath)) {
			// 1) ��ȡ�������
			String productName = req.getParameter("productName");
			String productDesc = req.getParameter("productDesc");
			String productPrice = req.getParameter("productPrice");
			// 2) ��������Ϣ��װΪһ�� Product ����
			Product product = new Product(null, productName, productDesc, Double.parseDouble(productPrice));
			// 3) ִ�б������
			System.out.println("Save Product " + product);
			product.setProductId(1001);
			// 4) �� Product ���󱣴浽 request ��
			request.setAttribute("product", product);
			path = "WEB-INF/pages/details.jsp";
		}
		
		if(path != null) {
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
		
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
