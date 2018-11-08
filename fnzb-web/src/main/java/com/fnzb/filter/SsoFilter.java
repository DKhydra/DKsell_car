package com.fnzb.filter;


import com.fnzb.common.httpclient.HttpClientInvoker;
import com.fnzb.exception.XbaseError;
import com.fnzb.result.ResultModel;
import com.fnzb.result.ResultModelBuilder;
import com.fnzb.utils.ResponseUtil;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * OncePerRequestFilter
 *
 * @author aff
 * @since 2018年03月26日19:52:05
 * @version v1.0
 *
 */
public class SsoFilter extends OncePerRequestFilter {

	private static String urlExclusion;

	private static HttpClientInvoker httpClientInvoker;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		//System.err.println(getUrlExclusion());
		List<String> notFilter = Arrays.asList(getUrlExclusion().split(";")); // 不过滤的uri
		String strUri = request.getRequestURI();
		if (notFilter.contains(strUri)) {
			filterChain.doFilter(request, response);
			return;
		}

		// User userInfo = (User) request.getSession().getAttribute("userInfo");
		String userInfo = null;
		if (userInfo == null) {
			// 需要登录
			ResultModel<Object> result = ResultModelBuilder.failure(XbaseError.SYS_SESSION_TIMEOUT);
			result.setReturnCode(XbaseError.NOT_LOGIN.getErrorCode());
			result.setReturnMessage(XbaseError.NOT_LOGIN.getError());
			ResponseUtil.responseResult(response, result);
			return ;
		} else {
			//TODO 更新session的生命周期
			filterChain.doFilter(request, response);
			return;
		}
	}

	public static String getUrlExclusion() {
		return urlExclusion;
	}

	public static void setUrlExclusion(String urlExclusion) {
		SsoFilter.urlExclusion = urlExclusion;
	}

	public static HttpClientInvoker getHttpClientInvoker() {
		return httpClientInvoker;
	}

	public static void setHttpClientInvoker(HttpClientInvoker httpClientInvoker) {
		SsoFilter.httpClientInvoker = httpClientInvoker;
	}

}