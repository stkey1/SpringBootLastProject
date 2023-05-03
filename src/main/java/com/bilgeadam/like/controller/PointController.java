package com.bilgeadam.like.controller;
import com.bilgeadam.like.dto.PointDto;
import com.bilgeadam.like.service.PointService;
import com.bilgeadam.like.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PointController {

    private final PointService pointService;
    private final UserService userService;

    public PointController(PointService  pointService, UserService userService) {

        this.pointService = pointService;
        this.userService = userService;
    }

    @GetMapping("/get-all-points")
    ResponseEntity<List<PointDto>> allPoints() {

        return new ResponseEntity<>(pointService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/welcome")
    public String showwelcomePage() {
        return "welcome jsp";
    }

//    @GetMapping("/get-by-category")
//    ResponseEntity<List<PointDto>> getByCategory(@RequestParam("categoryName") String categoryName) {
//
//        return new ResponseEntity<>(pointService.findByCategory(categoryName), HttpStatus.OK);
//    }

    @GetMapping("/search-points-by-name")
    ResponseEntity<PointDto> getByName(@RequestParam("name") String name) {

        return new ResponseEntity<>(pointService.findByName(name), HttpStatus.OK);
    }

    @PostMapping("/add-point")
    ResponseEntity<PointDto> addPoint(@RequestBody PointDto pointDto) {

        return new ResponseEntity<>(pointService.savePoint(pointDto), HttpStatus.CREATED);
    }

//    @GetMapping("/payment-action")
//    void paymentAction(HttpSession session) {
//
//        int spent = Integer.parseInt(session.getAttribute("price").toString());
//        userService.makePayment(spent);
//        session.removeAttribute("price");
//    }
}