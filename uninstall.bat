
REM Uninstall Install JDK17 locally.
set JDK_ZIP_DIR=jdk-17_windows-x64_bin
rmdir /s /q jdk-17
del /q Downloads-split-zip\%JDK_ZIP_DIR%\%JDK_ZIP_DIR%.zip

REM Uninstall Java Mission Control
set JMC_DIR=jmc-8.1.0_windows-x64
rmdir /s /q JMC
del /q Downloads-split-zip\%JMC_DIR%\%JMC_DIR%.zip

REM Uninstall Eclipse
set ECLIPSE_ZIP_DIR=eclipse-java-2022-03-R-win32-x86_64
rmdir /s /q eclipse
del /q Downloads-split-zip\%ECLIPSE_ZIP_DIR%\%ECLIPSE_ZIP_DIR%.zip