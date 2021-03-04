package com.tts.swaggeruserlab.controller;

import com.tts.swaggeruserlab.model.UserV1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("/v1")
@Api(value="menuItems", description = "Operations pertaining to menu items")
@RestController
public class UserControllerV1 {
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved menu item"),
            @ApiResponse(code = 4-1, message = "You are not authorized to view the menu item")
    })

    @ApiOperation(value = "Get all menu items", response = UserV1.class,
            responseContainer = "List")
    @GetMapping("/user/all")
    public ResponseEntity<List<UserV1>> getAllItems() {
        return new ResponseEntity(new ArrayList<UserV1>(), HttpStatus.OK);
    }
}
