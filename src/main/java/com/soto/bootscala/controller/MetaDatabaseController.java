package com.soto.bootscala.controller;

import com.soto.bootscala.domain.MetaDatabase;
import com.soto.bootscala.service.MetaDatabaseService;
import com.soto.bootscala.utils.ResultVO;
import com.soto.bootscala.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/meta/database")
@RestController
public class MetaDatabaseController {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value="/",method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase) {
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();
    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public ResultVO query() {
        return ResultVOUtil.success(metaDatabaseService.query());
    }

}
