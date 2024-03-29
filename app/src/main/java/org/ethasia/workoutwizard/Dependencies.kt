package org.ethasia.workoutwizard

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.GatewaysFactory
import org.ethasia.workoutwizard.ioadapters.gateways.RealGatewaysFactory
import org.ethasia.workoutwizard.ioadapters.gateways.crosslayer.PersistenceFactory
import org.ethasia.workoutwizard.technical.RealPersistenceFactory

class Dependencies {

    companion object {

        fun injectDependencies() {
            injectFactories()
        }

        private fun injectFactories() {
            GatewaysFactory.instance = RealGatewaysFactory()
            PersistenceFactory.instance = RealPersistenceFactory()
        }
    }
}