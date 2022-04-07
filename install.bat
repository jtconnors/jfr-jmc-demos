
REM Install JDK17 locally. 
REM To avoid the Git large files issue, the JDK 17 ZIP file is split into chunks < 50MB.  Reconstitute it before installing.
set JDK_ZIP_DIR=jdk-17_windows-x64_bin
set JDK_DIR=jdk-17.0.2
type Downloads-split-zip\%JDK_ZIP_DIR%\x0* > Downloads-split-zip\%JDK_ZIP_DIR%\%JDK_ZIP_DIR%.zip
powershell Expand-Archive -Path Downloads-split-zip\%JDK_ZIP_DIR%\%JDK_ZIP_DIR%.zip -DestinationPath .
rename %JDK_DIR% jdk-17

REM Install and Configure Java Mission Control
REM To avoid the Git large files issue, the JMC ZIP file is split into chunks < 50MB.  Reconstitute it before installing.
set JMC_DIR=jmc-8.1.0_windows-x64
type Downloads-split-zip\%JMC_DIR%\x0* > Downloads-split-zip\%JMC_DIR%\%JMC_DIR%.zip
powershell Expand-Archive -Path Downloads-split-zip\%JMC_DIR%\%JMC_DIR%.zip -DestinationPath .
rename %JMC_DIR% JMC
copy config\jmc.ini JMC

REM Install and Configure Eclipse
REM To avoid the Git large files issue, the Eclipse ZIP file is split into chunks < 50MB.  Reconstitute it before installing.
set ECLIPSE_ZIP_DIR=eclipse-java-2022-03-R-win32-x86_64
type Downloads-split-zip\%ECLIPSE_ZIP_DIR%\x0* > Downloads-split-zip\%ECLIPSE_ZIP_DIR%\%ECLIPSE_ZIP_DIR%.zip
powershell Expand-Archive -Path Downloads-split-zip\%ECLIPSE_ZIP_DIR%\%ECLIPSE_ZIP_DIR%.zip -DestinationPath .
copy config\eclipse.ini eclipse
