@echo off
call setenv.bat
@echo Starting Eclipse...
@echo on
cd %~dp0eclipse
start eclipse.exe
@echo off