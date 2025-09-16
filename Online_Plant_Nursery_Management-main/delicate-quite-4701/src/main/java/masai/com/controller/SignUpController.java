package masai.com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import masai.com.exception.LogInException;
import masai.com.model.SignUpData;
import masai.com.service.SignUpService;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    /**
     * Show signup page (GET /signup)
     */
    @GetMapping("/signup")
    public String showSignupPage(Model model) {
        model.addAttribute("signUpData", new SignUpData());
        return "signup"; // resolves to /WEB-INF/views/signup.jsp
    }

    /**
     * Handle signup form submit (POST /signup)
     */
    @PostMapping("/signup")
    public String createNewSignUpHandler(@Valid @ModelAttribute("signUpData") SignUpData newSignUp,
                                         Model model) {
        try {
            SignUpData saved = signUpService.createNewSignUp(newSignUp);
            model.addAttribute("message", "Signup successful! Please login.");
            return "login"; // forward to login.jsp
        } catch (LogInException e) {
            model.addAttribute("error", e.getMessage());
            return "signup"; // back to signup.jsp
        }
    }

    /**
     * Optional: Update user details (form-based, instead of JSON API)
     */
    @PostMapping("/updateSignUp")
    public String updateSignUpDetailsHandler(@ModelAttribute("signUpData") SignUpData signUp,
                                             @RequestParam String key,
                                             Model model) {
        try {
            SignUpData updated = signUpService.updateSignUpDetails(signUp, key);
            model.addAttribute("message", "Account updated successfully.");
            return "home"; // redirect to home.jsp
        } catch (LogInException e) {
            model.addAttribute("error", e.getMessage());
            return "signup"; // back to signup.jsp
        }
    }
}
