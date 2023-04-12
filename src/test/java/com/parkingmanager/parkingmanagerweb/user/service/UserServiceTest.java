package com.parkingmanager.parkingmanagerweb.user.service;

import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.user.domain.User;
import com.parkingmanager.parkingmanagerweb.user.domain.UserRepository;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {

    @Test
    void testReadAll() {
        // Arrange
        List<User> userMockedList = new ArrayList<>();
        userMockedList.add(new User("da@gmail.com", "David", "Hormigo", "Ramírez", 'P'));
        userMockedList.add(new User("jp@gmail.com", "Juan", "Perez", "Ramírez", 'P'));

        UserRepository mockedRepository = mock(UserRepository.class);

        when(mockedRepository.findAll()).thenReturn(userMockedList);
        UserService service = new UserServiceImpl(mockedRepository);
        // Act

        List<User> actualUsers = service.readAll();
        assertAll("Read Users",
                () -> {assertEquals(userMockedList, actualUsers);},
                () -> verify(mockedRepository).findAll());
    }
    
    @Test
    void testCreate() {

    }
}
