@echo off

cd ..\dao

call dao-clean-install

echo ====== dao finish ==========
pause

cd ..\web

mvn clean install
echo ====== web finish ==========
pause
