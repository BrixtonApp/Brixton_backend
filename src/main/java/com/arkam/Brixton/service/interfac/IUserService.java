package com.arkam.Brixton.service.interfac;

import com.arkam.Brixton.dto.LoginRequest;
import com.arkam.Brixton.dto.Response;
import com.arkam.Brixton.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
