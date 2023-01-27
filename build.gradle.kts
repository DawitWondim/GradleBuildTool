tasks.register("Hello") {
        println("In the Hello task, but in the configuration phase")

        doFirst {
                println("In the hello task, doFirst method")
        }

        doLast {
                println("In the hello task, doLast method")
        }

        dependsOn("Selam")
}

tasks.register("Selam") {
        println("In the Selam task, but in the configuration phase")

        doFirst {
                println("In the Selam task, doFirst method")
        }

        doLast {
                println("In the Selam task, doLast method")
        }
}

tasks.named("clean") {
        doLast{
                println("Default cleaning!!")
        }
        doFirst{
                println("Do First in the clean task")
        }
}

tasks.register("run") {
        doLast{
                println("Default running!!")
        }

        println("Default run task, executing during configuration phase")
}

tasks.register("otherDefaultTask") {
        doLast{
                println("Another default task!!")
        }
}

defaultTasks("clean", "run", "otherDefaultTask")

plugins {
        `java`
}