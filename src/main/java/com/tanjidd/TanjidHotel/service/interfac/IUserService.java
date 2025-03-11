package com.tanjidd.TanjidHotel.service.interfac;

import com.tanjidd.TanjidHotel.dto.LoginRequest;
import com.tanjidd.TanjidHotel.dto.Response;
import com.tanjidd.TanjidHotel.entity.User;



public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}