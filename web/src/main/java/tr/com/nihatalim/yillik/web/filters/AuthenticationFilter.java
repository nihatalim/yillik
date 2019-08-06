package tr.com.nihatalim.yillik.web.filters;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class AuthenticationFilter extends BasicAuthenticationFilter {
    public AuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO GET AUTHENTICATION INFORMATION AND ROLES FROM DATABASE
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken("admin", "pass", Collections.emptyList());
        // FILL SECURITY CONTEXT WITH AUTHENTICATION
        SecurityContextHolder.getContext().setAuthentication(auth);
        // CHAIN AND FILTER FOR THIS REQUEST AND RESPONSE
        chain.doFilter(request,response);
    }
}
