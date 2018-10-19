package com.soto.bootscala.controller

import com.soto.bootscala.domain.MetaTable
import com.soto.bootscala.service.MetaTableService
import com.soto.bootscala.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService){


  @RequestMapping(value = Array("/"),method = Array(RequestMethod.POST))
  def save(@ModelAttribute metaTable:MetaTable)={
    metaTableService.save(metaTable)

    ResultVOUtil.success()  //此处就是Scala调用已有的Java代码
  }


  @RequestMapping(value = Array("/"),method = Array(RequestMethod.GET))
  def query()={
    ResultVOUtil.success(metaTableService.query())
  }
}
