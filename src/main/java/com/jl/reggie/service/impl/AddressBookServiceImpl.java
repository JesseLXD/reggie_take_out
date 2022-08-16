package com.jl.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jl.reggie.entity.AddressBook;
import com.jl.reggie.mapper.AddressBookMapper;
import com.jl.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
