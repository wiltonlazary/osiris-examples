package ws.osiris.example.dynamodb.core

import ws.osiris.aws.ApplicationConfig
import ws.osiris.aws.Stage
import java.time.Duration

/**
 * Configuration that controls how the application is deployed to AWS.
 */
val config = ApplicationConfig(
    applicationName = "osiris-dynamodb-example",
    lambdaMemorySizeMb = 512,
    lambdaTimeout = Duration.ofSeconds(10),
    stages = listOf(
        Stage(
            name = "dev",
            description = "Development stage",
            deployOnUpdate = true
        )
    )
)
