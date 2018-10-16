# Bike rentals
## Design
The challenge was developed in Scala. I created a class called `Rent` which has 2 attributes: type (a trait) and time (an Int) of a rental. There is a service called `RentalService` that manages the behavior according to the type of a rent and evaluates if a family plan discount must be applied, returning the total price of a request.

## Development practices

The `RentalService` accepts a list of rents which has a trait as attribute that can be `Hour`, `Day` or `Week`. They use the parent method called `getPrice` to calculate the price by rent, overriding the amount according to the type. Finally, a method evaluate if a family plan discount must be applied depending on the size of the rental. 

## How to run the tests
Prerequisites: GIT, SBT, Scala

1- Open command line and clone the project with GIT.
2- Navigate into the project folder and run the command bellow

    sbt test
