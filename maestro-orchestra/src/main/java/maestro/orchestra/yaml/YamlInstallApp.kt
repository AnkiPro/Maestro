package maestro.orchestra.yaml

data class YamlInstallApp(
    val appId: String,
    val path: String,
    val label: String? = null,
)