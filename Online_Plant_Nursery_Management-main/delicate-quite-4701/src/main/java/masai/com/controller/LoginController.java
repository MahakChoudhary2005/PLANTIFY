package masai.com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import masai.com.exception.LogInException;
import masai.com.model.LogInData;
import masai.com.service.LogInService;

@Controller
public class LoginController {

    @Autowired
    private LogInService loginService;

    /**
     * Show login page
     */
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("loginData", new LogInData());
        return "login";  // resolves to /WEB-INF/views/login.jsp
    }

    /**
     * Handle login form submit
     */
    @PostMapping("/login")
    public String loginHandler(
            @Valid @ModelAttribute("loginData") LogInData loginData,
            Model model) throws LogInException {

        try {
            // Call the service to log in and return the session key (UUID)
            String sessionKey = loginService.logInAccount(loginData);

            // Put a success message and session key into the model
            model.addAttribute("message", "Login successful!");
            model.addAttribute("sessionKey", sessionKey);

            return "home";  // forward to home.jsp
        } catch (LogInException e) {
            // Show the error on the login page
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }

    /**
     * Logout (by key param)
     */
    @GetMapping("/logout")
    public String logOutFromAccount(@RequestParam String key, Model model) throws LogInException {
        try {
            String msg = loginService.logOutFromAccount(key);
            model.addAttribute("message", msg);
        } catch (LogInException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "login";
    }
}