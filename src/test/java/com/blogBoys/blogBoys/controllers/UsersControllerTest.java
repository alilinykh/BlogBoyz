//package com.blogBoys.blogBoys.controllers;
//
//import com.blogBoys.blogBoys.models.Users;
//import com.blogBoys.blogBoys.services.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//@RunWith(MockitoJUnitRunner.class)
//public class UsersControllerTest {
//
//
//        @Mock
//        private UserService userService;
//
//        @InjectMocks
//        private UserController userController;
//
//        @Test
//        public void createUser() {
//        Users users = mockPerson();
//
//        when(userService.create(users)).thenReturn(users);
//        userController.createUser(users);
//
//        verify(userService, times(1)).create(users);
//        }
//
//
//        @Test
//        public void deleteUser() {
//        userController.deleteUser(1);
//        verify(userService, times(1)).deleteUser(1);
//
//        }
//
//        @Test
//        public void getAllUsers() {
//        when(userService.index()).thenReturn(subData());
//        userController.getAllUsers();
//        verify(userService,times(1)).index();
//
//        }
//
//        @Test
//        public void getUser() {
//
//        when(userService.getUserById(1)).thenReturn(subData().get(1));
//        userController.getUser(1);
//
//        verify(userService,times(1)).getUserById(1);
//        }
//
//        private List<Users> subData() {
//            Users person1 = new Users("Bob", "1234");
//            Users person2 = new Users("steve", "1234");
//
//            return Arrays.asList(person1, person2);
//        }
//
//        private Users mockPerson() {
//            return new Users("steve", "1234");
//        }
//    }
