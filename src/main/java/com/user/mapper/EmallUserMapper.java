package com.user.mapper;

import com.user.po.EmallUser;
import java.util.List;

public interface EmallUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emall_user
     *
     * @mbggenerated Fri May 12 12:22:49 CST 2017
     */
    int insert(EmallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emall_user
     *
     * @mbggenerated Fri May 12 12:22:49 CST 2017
     */
    List<EmallUser> selectAll();
}