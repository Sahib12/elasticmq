package org.elasticmq.storage.squeryl

import org.elasticmq.storage.MessageStatisticsStorageModule
import org.elasticmq.{NeverReceived, MessageStatistics, IdentifiableMessage}

trait SquerylMessageStatisticsStorageModule extends MessageStatisticsStorageModule {
  this: SquerylSchemaModule =>

  object squerylMessageStatisticsStorage extends MessageStatisticsStorage {
    def messageReceived(message: IdentifiableMessage, when: Long) {
    }

    def messageStatistics(message: IdentifiableMessage) = MessageStatistics(message, NeverReceived, 0)
  }

  def messageStatisticsStorage = squerylMessageStatisticsStorage
}