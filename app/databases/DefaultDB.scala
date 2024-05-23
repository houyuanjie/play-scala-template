package databases

import io.getquill.*

import play.api.db.*

import jakarta.inject.*

@Singleton
class DefaultDB @Inject() (db: DBApi) extends H2JdbcContext(SnakeCase, db.database("default").dataSource)
