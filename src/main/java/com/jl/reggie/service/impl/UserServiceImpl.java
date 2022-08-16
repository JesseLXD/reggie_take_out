package com.jl.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jl.reggie.entity.User;
import com.jl.reggie.mapper.UserMapper;
import com.jl.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
