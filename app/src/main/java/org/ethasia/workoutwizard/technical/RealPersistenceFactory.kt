package org.ethasia.workoutwizard.technical

import org.ethasia.workoutwizard.ioadapters.gateways.crosslayer.AppSpecificStorageAccessor
import org.ethasia.workoutwizard.ioadapters.gateways.crosslayer.PersistenceFactory

class RealPersistenceFactory : PersistenceFactory() {

    override fun createAppSpecificStorageAccessor(): AppSpecificStorageAccessor {
        return AppSpecificStorageAccessorImpl()
    }
}