package org.ethasia.workoutwizard.ioadapters.gateways.crosslayer

abstract class PersistenceFactory {

    companion object {
        var instance: PersistenceFactory? = null
    }

    abstract fun createAppSpecificStorageAccessor(): AppSpecificStorageAccessor
}