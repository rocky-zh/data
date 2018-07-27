echo %M2_HOME%
@REM set M2_HOME=
@REM set PATH=%PATH%;%M2_HOME%/bin
call mvn clean install deploy -Dmaven.test.skip=true --settings settings.xml
pause