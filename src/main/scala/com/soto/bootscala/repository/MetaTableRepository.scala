package com.soto.bootscala.repository

import com.soto.bootscala.domain.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable,Integer]{

}
