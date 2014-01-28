@echo off

SET APP_NAME="CoinCounter"
SET VERSION="1.1.1"
SET "FILENAME=%APP_NAME%_v%VERSION%.jar"

if not exist build mkdir build
XCOPY /S /F /Q build release

if exist release\data RD /S release\data

cd release

if exist Manifest.txt del Manifest.txt
echo Manifest-Version: 1.0 >> Manifest.txt
echo Created-By: Alex Vasilenko (codevs) >> Manifest.txt
echo Main-Class: counter/CoinCounter >> Manifest.txt

jar cvfm %FILENAME% Manifest.txt counter\

rmdir /s/q counter
del Manifest.txt

cd ..
