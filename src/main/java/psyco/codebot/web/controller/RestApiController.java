package psyco.codebot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import psyco.codebot.web.core.Consts;
import psyco.codebot.web.core.WebResponse;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * Created by peng on 15/10/25.
 */
@RestController
@RequestMapping("/api")
public class RestApiController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public WebResponse login(HttpServletRequest req, @RequestParam("name") String name, @RequestParam("password") String password) {
        if (Objects.equals(name, "root") && Objects.equals(password, "fuck")) {
            req.getSession().setAttribute(Consts.SESSION_USER, "");
            return WebResponse.success("/index");
        }
        return WebResponse.error("Incorrect username or password");
    }
    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public WebResponse signup(HttpServletRequest req, @RequestParam("name") String name, @RequestParam("password") String password) {
        if (Objects.equals(name, "root") && Objects.equals(password, "fuck")) {
            req.getSession().setAttribute(Consts.SESSION_USER, "");
            return WebResponse.success("/index");
        }
        return WebResponse.error("Incorrect username or password");
    }

}
