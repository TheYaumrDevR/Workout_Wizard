package org.ethasia.workoutwizard.ioadapters.gateways.crosslayer

interface AppSpecificStorageAccessor {

    fun saveFileInAppSpecificStorage(fileName: String, fileContent: String)
}