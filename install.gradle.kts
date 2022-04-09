/*
apply(plugin = "maven-publish")

val sourcesJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(components.findByName("android"))
}

configure<PublishingExtension> {
    publications {
        create<MavenPublication>(LibraryConstants.PUBLICATION_NAME) {
            run {
                groupId = LibraryConstants.ARTIFACT_GROUP
                artifactId = LibraryConstants.ARTIFACT_NAME
                version = LibraryConstants.VERSION
                from(components.findByName("android"))
                artifact(sourcesJar)
                artifact("$buildDir/outputs/aar/app-release.aar")
                pom {
                    name.set(LibraryConstants.ARTIFACT_NAME)
                    description.set(LibraryConstants.POM_DESCRIPTION)
                    url.set(LibraryConstants.POM_URL)
                    licenses {
                        license {
                            name.set(LibraryConstants.LICENSE_NAME)
                            url.set(LibraryConstants.LICENSE_URL)
                        }
                    }
                    developers {
                        developer {
                            id.set(LibraryConstants.DEVELOPER)
                            name.set(LibraryConstants.DEVELOPER_NAME)
                        }
                    }
                }
            }
        }
    }
}


object LibraryConstants {
    const val PUBLICATION_NAME = "flagly"
    const val ARTIFACT_NAME = "Flagly"
    const val ARTIFACT_GROUP = "com.evercheck.flagly"
    const val VERSION = "1.0.6"

    const val POM_URL = "https://github.com/com.flagly.oscarg798/flagly"
    const val POM_DESCRIPTION = "Handle Feature Flags"

    const val LICENSE_NAME = "MIT"
    const val LICENSE_URL = "https://opensource.org/licenses/mit-license.php"
    const val LICENSE_DIST = "repo"

    const val DEVELOPER = "com.evercheck.flagly.oscarg798"
    const val DEVELOPER_NAME = "Oscar Gallon"
}

object BintrayConstanst {
    const val BINTRAY_USER_KEY = "bintray.user"
    const val BINTRAY_PASSWORD_KEY = "bintray.apikey"
    const val REPO_NAME = "Flagly"
    const val USER_ORG = "oscarg798"
    const val GITHUB_URL = "https://github.com/oscarg798/flagly"
    const val LICENSE = "MIT"
}*/
