package me.steliosmagalios.prologserver.services

import org.springframework.stereotype.Service
import com.parctechnologies.eclipse.EclipseEngine;
import com.parctechnologies.eclipse.EclipseEngineOptions
import com.parctechnologies.eclipse.OutOfProcessEclipse

@Service
class PrologService {

    private val engine: EclipseEngine = OutOfProcessEclipse(EclipseEngineOptions())

    fun execute(): String {
        val result = engine.rpc("X = [1, 2, 3]")

        return result.arg(1).toString()
    }

}