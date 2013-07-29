echo on

cd ..\dao

call dao-clean-install

echo ====== dao finish ==========


cd ..\web

call clean-install

echo ====== web finish ==========


pause
