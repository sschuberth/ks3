package ks3.conventions.lang

import ks3.conventions.Ks3BuildLogicSettings

plugins {
   id("ks3.conventions.lang.kotlin-multiplatform-base")
}

val ks3Settings = extensions.getByType<Ks3BuildLogicSettings>()

if (ks3Settings.enableKotlinJs.get()) {
   kotlin {
      targets {
         js(IR) {
            browser()
            nodejs()
         }
      }
   }

   relocateKotlinJsStore()
}
