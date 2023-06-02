package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class APIExample {
    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";

    String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODUwNTg1MTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NTEwMTcxMCwidXNlcklkIjoiNTI4NiJ9.4s4Z9Tf7Z8oZbWOcPhVr-R3iUKZQFQsRzE1xXPdtDiQ";
    @Test
    public void createAnEmployee(){

        RequestSpecification preparedRequest = given().header("Content-Type", "application/json").header("Authorization", token).body("{\n" +
                "  \"emp_firstname\": \"BEN\",\n" +
                "  \"emp_lastname\": \"50\",\n" +
                "  \"emp_middle_name\": \"10\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"2021-07-11\",\n" +
                "  \"emp_status\": \"Employee\",\n" +
                "  \"emp_job_title\": \"Cloud Architect\"\n" +
                "}");
//act as a send key
//        pepared request --> attached all the data for the request
        Response response = preparedRequest.when().post("/createEmployee.php");
        response.prettyPrint();


    }

}
