# API Implementation Lab

In the lab, we'll update our Users API to include versioning and Swagger documentation.

1. Enable Swagger UI in the project
2. Add an `@Api` annotation to the controller, with a description
3. Add an `@ApiOperation` annotation to each controller method, with a value and response
4. Add an `@ApiResponses` annotation to each controller method, with a message for each applicable response code
5. Add an `@ApiModelProperty` annotation to each property in the user model, with notes describing each one
6. Rename `UsersController` to `UsersControllerV1`
7. Create a copy of `UsersControllerV1` called `UsersControllerV2`
8. Add `/v1` as a base route parameter for `UsersControllerV1`
9. Add `/v2` as a base route parameter for `UsersControllerV2`
10. Configure Swagger UI so that it displays the versioned endpoints in separate groups - "Version 1" and "Version 2". We now have two versions of the Users API, but the versions are identical.
11. In version 2 of the API, make the state request parameter for the `getUsers` method required. If a value for it is not specified, the API should return a bad request response code. There is no longer the ability to get all users at once.
12. Update the `@ApiResponses` annotation for this version 2 method to reflect the newly added potential response code
13. Use Swagger UI to make a few requests to each version of the API.