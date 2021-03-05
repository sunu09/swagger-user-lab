package com.tts.swaggeruserlab.model;


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

public class UserV1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The Long id is the users identification number")
    private Long id;

    @ApiModelProperty(notes = "The first name is the users given name")
    //@NotEmpty(message = "Please provide a firstname")
    //@Length(max = 20, message = "Your firstname cannot hae more than 20 characters")
    private String firstName;

    @ApiModelProperty(notes = "The last name is the users surname")
   // @NotEmpty(message = "Please provide a lastname")
    //@Length(min = 2, message = "Your lastname must have at least 2 characters")
    private String lastName;

    @ApiModelProperty(notes = "The state is the users state of residence")
    //@NotEmpty(message = "Please provide a state")
   // @Length(min = 4, message = "Your State must have at least 4 characters")
   // @Length(max = 20, message = "Your State cannot have more than 20 characters")
    private String state;


}
