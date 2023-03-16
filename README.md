This repository is a barebones implementation of the
[PluginRepositoryAuthProvider](https://github.com/JetBrains/intellij-community/blob/master/platform/platform-impl/src/com/intellij/ide/plugins/auth/PluginRepositoryAuthProvider.java)
extension point in IntelliJ IDEA. Its purpose is to demonstrate that a change between 2022.2 and 2022.3 causes these 
extension points to never be registered and thus make it impossible to provide plugin authentication via HTTP headers
to custom repositories. 

It exists in two branches, 2022.2 and 2022.3, where the first works as expected and the latter does not. 
