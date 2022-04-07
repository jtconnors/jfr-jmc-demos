@echo off
call setenv.bat
@echo Starting Java Mission Control...
@echo on
cd %~dp0JMC\"JDK Mission Control"
start jmc.exe
@echo off