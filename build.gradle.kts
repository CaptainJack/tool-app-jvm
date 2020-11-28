plugins {
	kotlin("jvm") version "1.4.20"
	id("nebula.release") version "15.3.0"
	id("ru.capjack.bintray") version "1.0.0"
}

group = "ru.capjack.tool"

repositories {
	jcenter()
	maven("https://dl.bintray.com/capjack/public")
	mavenLocal()
}

kotlin {
	target {
		compilations.all { kotlinOptions.jvmTarget = "1.8" }
	}
}

dependencies {
	implementation(kotlin("reflect"))
	implementation("ch.qos.logback:logback-classic:1.2.3")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.3")
	implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.11.3")
	
	api("ru.capjack.tool:tool-utils:1.1.1")
	api("ru.capjack.tool:tool-logging:1.2.2")
	api("ru.capjack.tool:tool-depin:0.9.0")
}
