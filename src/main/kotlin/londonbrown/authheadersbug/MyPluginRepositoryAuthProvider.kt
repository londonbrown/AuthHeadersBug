package londonbrown.authheadersbug

import com.intellij.ide.plugins.auth.PluginRepositoryAuthProvider
import com.intellij.openapi.diagnostic.Logger

class MyPluginRepositoryAuthProvider : PluginRepositoryAuthProvider {
    override fun getAuthHeaders(url: String): Map<String, String> {
        LOG.info("getAuthHeaders was called in registered PluginRepositoryAuthProvider: MyPluginRepositoryAuthProvider")
        return mapOf()
    }

    override fun canHandle(url: String): Boolean {
        return true
    }

    companion object {
        val LOG = Logger.getInstance(MyPluginRepositoryAuthProvider::class.java)
    }
}
