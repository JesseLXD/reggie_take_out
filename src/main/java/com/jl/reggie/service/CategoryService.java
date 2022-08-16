package com.jl.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jl.reggie.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);
}
