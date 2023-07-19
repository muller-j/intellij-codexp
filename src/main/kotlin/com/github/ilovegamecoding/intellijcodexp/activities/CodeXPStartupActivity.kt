package com.github.ilovegamecoding.intellijcodexp.activities

import com.github.ilovegamecoding.intellijcodexp.services.CodeXPService
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

class CodeXPStartupActivity : StartupActivity {
    override fun runActivity(project: Project) {
        thisLogger().warn("CodeXPStartupActivity.runActivity")
        val codeXPService = ApplicationManager.getApplication().getService(CodeXPService::class.java)
    }
}