call setenv.bat
@echo off
@echo Resetting Demo Environment
call :restore 02_JFR_HotMethods
call :restore 03_JFR_Latencies
call :restore 03a_JFR_Latencies_manual
call :restore 04_JFR_GC
call :del_jrfs
goto :eof

REM Function restore
REM Arguments: %1 - Eclipse Project Directory
:restore
@echo +++++ Restoring %~dp0workspace\%1 +++++
@echo on
rmdir %~dp0projects\%1\src /s /q
mkdir %~dp0projects\%1\src
xcopy %~dp0projects\%1\src-original %~dp0projects\%1\src /e
rmdir %~dp0projects\%1\bin /s /q
mkdir %~dp0projects\%1\bin
xcopy %~dp0projects\%1\bin-original %~dp0projects\%1\bin /e
@echo off
goto :eof

REM Function del_jfrs
:del_jrfs
@echo +++++ Deleting temporary flight recordings +++++
@echo on
del %~dp0projects\Recordings\*.jfr /q
del "%~dp0projects\Mission Control\"*.jfr /q
del %~dp0autorecordings\*.jfr /q
del %MY_HOME%\.jmc\8.1.0\*.jfr
@echo off
goto :eof