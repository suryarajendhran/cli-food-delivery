## Overview

CLI applications are great, they get to the point and usually they take up very little resources to run. This is an experiment to see how far you can get by building a CLI application to order food from restaurants.

## How to run
This app is a single Java file (I don't usually work in Java so might be doing some very obviously stupid things). It runs via Docker, so make sure you have it installed. Need help? Check out the [Docker installation guide](https://docs.docker.com/engine/install/).

1. Make `run-java.sh` an executable 🛠️

```sh
chmod +x run-java.sh
```

2. Verify docker is installed and running 🐳

```sh
docker -v
```

3. Run the app!

```sh
./run-java.sh App
```

## What's next?

- [ ] Display dishes available at a restaurant and it's price
- [ ] Allow user to select multiple dishes
- [ ] Allow user to add address & phone number and place an order (Store it in-memory like we do with restuarants)
- [ ] Then take them to the beginning of the program where we display all orders (restaurant - dishes - placed at - delivery status) in the system and provide them an option to place a new order


## Further reading
1. [Interactive Console Applications in Java](https://dzone.com/articles/interactive-console-applications-in-java)
