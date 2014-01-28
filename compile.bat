@echo off

if not exist build mkdir build

cd source
javac -d ../build counter/CoinCounter.java

cd ..

