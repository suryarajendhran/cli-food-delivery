## Overview

CLI applications are great, they get to the point and usually they take up very little resources to run. This is an experiment to see how far you can get by building a CLI application to order food from restaurants.

## How to run

The app currently resides in a single java file (why Java? I don't work in Java very often so I thought it would be interesting) and runs on docker. You can find more instructions on how to install docker [here](https://docs.docker.com/engine/install/).

1. Make `run-java.sh` an executable

```sh
chmod +x run-java.sh
```

2. Check that you have docker running

```sh
docker -v
```

3. Run the App file

```sh
./run-java.sh App
```

## Features to add:

- [ ] Display dishes available at a restaurant and it's price
- [ ] Allow user to select multiple dishes
- [ ] Allow user to add address & phone number and place an order (Store it in-memory like we do with restuarants)
- [ ] Then take them to the beginning of the program where we display all orders (restaurant - dishes - placed at - delivery status) in the system and provide them an option to place a new order


## Further reading
1. https://dzone.com/articles/interactive-console-applications-in-java
