package com.parkingmanager.parkingmanagerweb.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.parkingmanager.parkingmanagerweb.user.domain.User;
import com.parkingmanager.parkingmanagerweb.user.domain.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
    private UserRepository userRepository;

    public UserServiceImpl(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User getById(Long id) {
        return this.userRepository.findById(id).orElseThrow();
    }
    @Override
    public List<User> readAll() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public void create(User entity) {
        this.userRepository.save(entity);
        
    }
    @Override
    public void update(User entity) {
        //User user = this.userRepository.findById(entity.getId()).orElseThrow();
        userRepository.save(entity);
        
    }
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
        
    }
}
