package ins.platform.common.web;

import ins.framework.common.ServiceFactory;
import ins.platform.schema.model.PrpDuser;
import ins.platform.service.facade.CompanyService;
import ins.platform.service.facade.UserService;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SessionFilter
  implements Filter
{
  public void init(FilterConfig filterconfig)
    throws ServletException
  {
  }

  public void destroy()
  {
  }

  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException
  {
    initSession((HttpServletRequest)request);
    chain.doFilter(request, response);
  }

  private void initSession(HttpServletRequest request) {
    HttpSession session = request.getSession();
    if ((SecurityContextHolder.getContext() == null) || (SecurityContextHolder.getContext().getAuthentication() == null))
      return;
    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    if (principal instanceof UserDetails) {
      UserDetails ud = (UserDetails)principal;
      String userCode = ud.getUsername();
      String oldUserCode = (String)session.getAttribute("UserCode");
      if (userCode.equals(oldUserCode)) {
        return;
      }
      UserService userService = (UserService)ServiceFactory.getService("userService");
      CompanyService companyService = (CompanyService)ServiceFactory.getService("companyService");
      PrpDuser prpDuser = userService.findUserByUserCode(userCode);
      String comCName = companyService.findComCNameByComCode(prpDuser.getPrpDcompany().getComCode());

      String sessionIdForIdentify = "" + new Date().getTime() + new Random().nextInt(1000);

      session.setAttribute("sessionID", sessionIdForIdentify);
      session.setAttribute("UserCode", userCode);
      session.setAttribute("UserName", prpDuser.getUserName());
      session.setAttribute("ComCode", prpDuser.getPrpDcompany().getComCode());
      session.setAttribute("ComCName", comCName);
    }
  }
}