package com.bilgeadam.like.controller;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.dto.UserDto;
import com.bilgeadam.like.service.UserService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;
import java.util.Objects;

@Controller
public class MainController {
    private final UserService userService;

    public MainController(UserService userService) {

        this.userService = userService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

//    @GetMapping("/")
//    public String showWelcomePage() {
//
//        return "index";
//    }


    @GetMapping("/login-success")
    public String defaultAfterLogin(HttpServletRequest request) {

        if (request.isUserInRole("ADMIN")) {
            return "redirect:/dashboard";
        }
        return "redirect:/home";
    }

    @RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.POST})
    public String showHomePage() {

        return "Home";
    }

    @RequestMapping("/login")
    public String showLoginPage(Principal principal) {

        if (principal != null)
            return "redirect:/home";

        return "Login";
    }

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public String showRegisterPage(@ModelAttribute("user") UserDto userDto,
                                   Principal principal) {

        if (principal != null)
            return "redirect:/home";

        return "Register";
    }

    @RequestMapping("/register-action")
    public String register(@Valid @ModelAttribute("user") UserDto userDto,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors() || !Objects.equals(userDto.getPassword(), userDto.getCPassword()))
            return "redirect:/register?error";

        if (userService.findByUsername(userDto.getUsername()) != null)
            return "redirect:/register?duplicate";

        userService.registerUser(userDto);

        return "redirect:/login?regSuccess";
    }

    @GetMapping("/403")
    public String showDeniedPage() {
        return "403";
    }

    @GetMapping("/project-details")
    public String showDetailsPage() {
        return "projectDetails";
    }
}