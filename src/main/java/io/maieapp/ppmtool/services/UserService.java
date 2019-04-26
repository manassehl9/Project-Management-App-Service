package io.maieapp.ppmtool.services;

import io.maieapp.ppmtool.domain.User;
import io.maieapp.ppmtool.exceptions.UsernameAlreadyExistsException;
import io.maieapp.ppmtool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser(User newUser){

        try{
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));

            //Username has to be unique (custom exception)
            newUser.setUsername(newUser.getUsername());

            // Make sure that password and confirm password match


            //We don't persist or show the confirm password
            return userRepository.save(newUser);
        }catch(Exception e){
            throw new UsernameAlreadyExistsException("Username '"+newUser.getUsername() +"' already exits");
        }

    }
}
