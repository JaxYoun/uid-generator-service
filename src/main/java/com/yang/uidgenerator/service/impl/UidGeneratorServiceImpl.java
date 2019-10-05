package com.yang.uidgenerator.service.impl;

import com.yang.uidgenerator.uid.UidGenerator;
import com.yang.uidgenerator.service.UidGeneratorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Yang
 * @date: 2019/10/5 03:49
 * @description:
 */
@Service
public class UidGeneratorServiceImpl implements UidGeneratorService {

    @Resource
    private UidGenerator uidGenerator;

    @Override
    public Long getUid() {
        return this.uidGenerator.getUID();
    }

}
