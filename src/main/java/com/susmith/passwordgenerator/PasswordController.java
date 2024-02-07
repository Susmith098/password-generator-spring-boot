package com.susmith.passwordgenerator;


import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/password")
public class PasswordController {

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/generate")
    public String generatePassword(@RequestBody PasswordRequest passwordRequest){
        try{
            String generatedPassword = PasswordGenerator.generate(passwordRequest);
            return generatedPassword;
        }
        catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
}
