package com.jl.reggie.dto;

import com.jl.reggie.entity.Setmeal;
import com.jl.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
