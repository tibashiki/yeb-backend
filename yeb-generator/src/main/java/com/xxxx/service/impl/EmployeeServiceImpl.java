package com.xxxx.service.impl;

import com.xxxx.pojo.Employee;
import com.xxxx.mapper.EmployeeMapper;
import com.xxxx.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tibashiki
 * @since 2023-07-07
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
