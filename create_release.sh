#! /bin/bash

function writeManifest {
	echo "Manifest-Version: 1.0
Created-By: Alex Vasilenko (codevs)
Main-Class: counter/CoinCounter
" > Manifest.txt
}

APP_NAME="CoinCounter"
VERSION="1.1.1"
FILENAME="${APP_NAME}_v${VERSION}.jar"

mkdir -p release
cp -r build/* release
if [ -d "release/data" ]; then
	rm -rf release/data
fi

cd release
writeManifest
jar cfm $FILENAME Manifest.txt counter

rm -rf counter

