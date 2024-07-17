$version: "2.0"

namespace test.model

use smithy.mqtt#mqttJson
use smithy.mqtt#publish
use smithy.mqtt#topicLabel

@mqttJson
service TestService {
    version: "2024-07-17"
    operations: [
        TestPublish
        // TestSubscribe
    ]
}

@publish("topics/{topicId}")
operation TestPublish {
    input := {
        @topicLabel
        @required
        topicId: String

        message: String
    }

    output: Unit
}
