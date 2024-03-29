package com.shop.mapper;

import com.commons.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMapper {
    List<Users> getAllManagers();

    List<Users> selectNSearch(Map<String, Object> search);

    int editStatus(List<String> IDList, String status);

    int adminDelete(List<String> IDList);

    int adminDel(String userID);

    int adminSS(String userID, String status);
}
