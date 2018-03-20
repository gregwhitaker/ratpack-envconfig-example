# ratpack-envconfig-example
[![Build Status](https://travis-ci.org/gregwhitaker/ratpack-envconfig-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/ratpack-envconfig-example)

Example of using environment specific configuration file overrides with Ratpack.

The example starts a simple webservice that returns a different hello message based on the environment in which it is running. The messages
are defined in environment specific `config-{environment}.yaml` files that override the base `config.yaml`.

## Running the Example

1. Start the application in the default "dev" environment by running the following command:

        $ ./gradlew run

    Once the application has started, point your web browser to [http://localhost:5050](http://localhost:5050) to access the test page.
    
    You should see the following message:
    
        Hello User! This is the Development environment.
        
2. Now start the service in either the "test" or "prod" environments by setting the environment variable `RATPACK_ENVIRONMENT`:

        $ RATPACK_ENVIRONMENT=test ./gradlew run

    Once the application has started, point your web browser to [http://localhost:5050](http://localhost:5050) to access the test page.

    You should see the following message:
    
       Hello User! This is the Test environment. 

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-envconfig-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
