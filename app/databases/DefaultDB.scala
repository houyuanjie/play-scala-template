package databases

import io.getquill.*
import jakarta.inject.*
import play.api.db.*

@Singleton
class DefaultDB @Inject() (db: DBApi) extends H2JdbcContext(SnakeCase, db.database("default").dataSource)
