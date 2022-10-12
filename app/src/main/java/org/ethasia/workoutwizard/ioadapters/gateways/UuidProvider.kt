package org.ethasia.workoutwizard.ioadapters.gateways

class UuidProvider {

    private var nextWorkoutDefinitionUuid = 0
    private var nextSetUuid = 0

    private val uuidsWorkouts = listOf("c5a2d8c4-85b9-4504-8ddf-10e604bf995f", "a99df809-b05e-4afe-ac71-488c0bb4082d",
            "1ccace66-a795-41dc-afb4-9eaf873fd6a2", "57eb5f54-560c-441e-8d39-5911e39393c0",
            "c946802d-a63a-4c88-85c0-2aae5aad0734", "4923774d-f041-42fb-abb9-a2fa26846f47",
            "c7ce8548-0c17-4c80-ae84-91b1b3fca404", "b31610a1-a00e-45c0-a401-2ed4bb381677",
            "313381b2-0c5b-4bff-8cec-123df96b531c")

    private val uuidsSets = listOf("d4e9afb3-3fb2-49c8-99ec-3273ef4b96b8", "f472bf19-9a7a-44eb-9f04-7ce48f32b24d",
            "441f68a3-005c-40d0-9ef3-22a180338463", "13adf56f-1b87-477a-84c7-d75cdaa1ebd1",
            "543981f8-4cb9-448e-8b93-a3c2630fbe54")

    fun getNextWorkoutUuid(): String {
        if (uuidsWorkouts.size <= nextWorkoutDefinitionUuid) {
            nextWorkoutDefinitionUuid = 0
        }

        val result = uuidsWorkouts[nextWorkoutDefinitionUuid]
        nextWorkoutDefinitionUuid++

        return result
    }

    fun getNextSetId(): String {
        if (uuidsSets.size <= nextSetUuid) {
            nextSetUuid = 0
        }

        val result = uuidsSets[nextSetUuid]
        nextSetUuid++

        return result
    }
}