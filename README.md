# Akka Http: Hello World Example

* Current API version: v1
* Current project version: v1.0.0

This is an Akka HTTP hello-world example compatible with Heroku.

## Versioning

The project uses the [semver specification](https://semver.org) for versioning (vA.B.C) where A represents
major change, B represents a minor change and C represents patches. 

The API follow simple ordinal number versioning (e.g. v1, v2, v3) and a versionless implementation 
that points toward the current version. 

## Usage

To run in your local machine:
1. Compile the app: `sbt compile stage`
2. Run: `./target/universal/stage/bin`
3. See the app at: `0.0.0.0:8080/hello`

To run in your local machine using Heroku (dependency on Heroku CLI):
1. Compile the app: `sbt compile stage`
2. Run: `heroku local web`
3. See the app at: `0.0.0.0:8080/hello`

## Tests

Run the tests: `sbt test`

## Live example

See a live example [here](https://akka-http-hello-world.herokuapp.com/v1/hello).

## Authors

* [Rodrigo Hernández Mota](https://www.linkedin.com/in/rhdzmota)

## License

For more information see the `LICENSE.md` file. 
