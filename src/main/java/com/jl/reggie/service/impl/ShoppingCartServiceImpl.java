package com.jl.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jl.reggie.entity.ShoppingCart;
import com.jl.reggie.mapper.ShoppingCartMapper;
import com.jl.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
