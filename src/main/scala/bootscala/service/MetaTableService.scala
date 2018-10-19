package bootscala.service

import bootscala.domain.MetaTable
import bootscala.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MetaTableService  @Autowired()(metaTableRepository:MetaTableRepository){

  def save(metaTable:MetaTable)={
    metaTableRepository.save(metaTable)
  }

  def query() = {
    metaTableRepository.findAll()
  }
}
