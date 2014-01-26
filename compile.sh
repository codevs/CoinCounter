#! /bin/bash

APP_NAME="CoinCounter"
VERSION="1.0.1"

mkdir -p build

cd source
javac -d ../build counter/CoinCounter.java


