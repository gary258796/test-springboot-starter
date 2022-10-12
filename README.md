# test-springboot-starter

Simple repo to verify [issue](https://stackoverflow.com/q/74024937/12973717) from stackoverflow.

What it verifies:

1. We can set properties from starter.
2. Then in Springboot project we use the starter, we can have the properties or override if we need.

Notice:

1. We can't have two properties file with same name.
2. Because of notice 1, we should name our properties something other than application.properties.<br> So the project that use our starter can have their properties name application.properties without mistakes.
