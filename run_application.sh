#! /bin/bash

echo 'Use this for development only.'
echo './create_release.sh would create jar file'
echo ''
read -p "Press [Enter] key to start application..."

cd build
java counter/CoinCounter

