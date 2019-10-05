package com.yang.uidgenerator.controller;

import com.yang.uidgenerator.service.UidGeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Yang
 * @date: 2019/10/5 03:51
 * @description:
 */
@RestController
@RequestMapping("/uid")
public class UidController {

    @Resource
    private UidGeneratorService uidGeneratorService;

    @GetMapping("/getUid")
    public Long getUid() {
        return this.uidGeneratorService.getUid();
    }

}
