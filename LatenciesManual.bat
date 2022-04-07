call setenv.bat
@echo Starting LatenciesManual with Java Version %JAVA_VERSION%
@echo on 

%JAVA_HOME%\bin\java -XX:StartFlightRecording -cp %~dp0projects\03a_JFR_Latencies_manual\bin se.hirt.jmc.tutorial.latencies.LatenciesManual

@echo off

