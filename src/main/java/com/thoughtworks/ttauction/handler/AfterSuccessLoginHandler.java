package com.thoughtworks.ttauction.handler;

import com.thoughtworks.ttauction.service.AccountService;
import com.thoughtworks.ttauction.service.AccountServiceImpl.java.AccountServiceImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;

@SuppressWarnings("ALL")
public class AfterSuccessLoginHandler implements AuthenticationSuccessHandler {

    AccountService accountService = new AccountServiceImpl();

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        handle(request,response, authentication);
        clearAuthenticationAttributes(request);
    }

    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        String targetUrl = determineTargetUrl(request, authentication);
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    protected String determineTargetUrl(HttpServletRequest request, Authentication authentication) {

        boolean isDeactivated = false;
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals("ROLE_DEACTIVATED_USER")) {
                isDeactivated = true;
                break;
            }
        }


        HttpSession session = request.getSession();

        DefaultSavedRequest savedRequest = (DefaultSavedRequest)session.getAttribute("SPRING_SECURITY_SAVED_REQUEST");
        if (savedRequest != null) {
            //noinspection UnnecessaryLocalVariable,UnnecessaryLocalVariable,UnnecessaryLocalVariable
            @SuppressWarnings("UnnecessaryLocalVariable") String requestUrl = savedRequest.getRequestURI();
            return requestUrl;
        }

        return "/";
    }

    protected void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
    }

}
