package cn.edu.hnu.dubboprovider.service;

import cn.edu.hnu.dubbocommon.entity.People;
import cn.edu.hnu.dubbocommon.service.PeopleService;
import com.alibaba.dubbo.config.annotation.Service;


@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public People getPeople(People people) {
        return null;
    }
}
