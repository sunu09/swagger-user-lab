package com.tts.swaggeruserlab.model;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class UserV2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The Long id is the users identification number")
    private Long Id;
    @ApiModelProperty(notes = "The first name is the users given name")
 //   @NotEmpty(message = "Please provide a firstname")
 //   @Length(max = 20, message = "Your firstname cannot have more than 20 characters")
    private String firstname;

    @ApiModelProperty(notes = "The last name is the users surname")
//    @NotEmpty(message = "Please provide a lastname")
  //  @Length(min = 2, message = "Your lastname must have at least 2 characters")
    private String lastname;

    @ApiModelProperty(notes = "The state is the users state of residence")
 //   @NotEmpty(message = "Please provide a state")
 //   @Length(min = 4, message = "Your State must have at least 4 characters")
  //  @Length(max = 20, message = "Your State cannot have more than 20 characters")
    private String state;
}

//public class UserV2 {
//@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private String state;

//    public Long getId() {
//        return id;
//    }

//    public void setId(Long id) {
//        this.id = id;
//    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public UserV2(Long id, String firstName, String lastName, String state) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.state = state;
//    }
//
//    public UserV2(){
//
//   }




