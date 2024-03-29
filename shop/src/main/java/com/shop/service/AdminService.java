package com.shop.service;


import com.commons.entity.Users;

import java.util.List;
import java.util.Map;

public interface AdminService {
    List<Users> getAllManagers();

    List<Users> selectNSearch(Map<String, Object> search);

    int editStatus(List<String> IDList, String status);

    int adminDelete(List<String> IDList);

    int adminDel(String userID);

    int adminSS(String userID, String status);
}
