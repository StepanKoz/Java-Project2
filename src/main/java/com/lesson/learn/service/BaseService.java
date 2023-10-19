package com.lesson.learn.service;

import com.lesson.learn.entity.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseService {
private BaseEntity baseEntity;

    public Integer sum(){
        baseEntity.getId();
        int first = 1;
        int second= 4;

        return first + second;}

}
