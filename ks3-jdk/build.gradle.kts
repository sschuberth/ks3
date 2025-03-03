plugins {
   id("ks3.conventions.lang.kotlin-multiplatform-jvm") // Kotlin/JVM only
   id("ks3.conventions.publishing.maven-publish")
}

kotlin {
   sourceSets {
      val commonMain by getting {
         dependencies {
            implementation(projects.ks3Standard)
            implementation(libs.kotlinxSerialization.core)
         }
      }

      val commonTest by getting {
         dependencies {
            implementation(kotlin("test"))

            implementation(projects.ks3Test)

            implementation(libs.kotest.frameworkEngine)
            implementation(libs.kotest.assertionsCore)
            implementation(libs.kotest.assertionsJson)
            implementation(libs.kotest.property)

            implementation(libs.kotlinxSerialization.json)
         }
      }

      if (ks3Settings.enableKotlinJvm.get()) {
         val jvmTest by getting {
            dependencies {
               implementation(libs.kotest.runnerJunit5)
            }
         }
      }
   }
}
