//package springsecurity.auth;



import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class CustomSimpleUrlAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
//
//	private RequestCache requestCache = new HttpSessionRequestCache();
//
//	@Override
//	public void onAuthenticationSuccess(
//			HttpServletRequest request,
//			HttpServletResponse response,
//			Authentication authentication)
//			throws ServletException, IOException {
//
//		SavedRequest savedRequest
//				= requestCache.getRequest(request, response);
//
//		if (savedRequest == null) {
//			clearAuthenticationAttributes(request);
//			return;
//		}
//		String targetUrlParam = getTargetUrlParameter();
//		if (isAlwaysUseDefaultTargetUrl()
//				|| (targetUrlParam != null
//				&& StringUtils.hasText(request.getParameter(targetUrlParam)))) {
//			requestCache.removeRequest(request, response);
//			clearAuthenticationAttributes(request);
//			return;
//		}
//
//		clearAuthenticationAttributes(request);
//	}
//
//	public void setRequestCache(RequestCache requestCache) {
//		this.requestCache = requestCache;
//	}
//}