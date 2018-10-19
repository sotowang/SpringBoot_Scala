package bootscala.controller

import bootscala.domain.MetaTable
import com.soto.bootscala.utils.ResultVOUtil
import bootscala.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService:MetaTableService) {


  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  def save(@ModelAttribute metaTable: MetaTable) = {
    metaTableService.save(metaTable)

    ResultVOUtil.success() //此处就是Scala调用已有的Java代码
  }

  @ResponseBody
  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }
}
