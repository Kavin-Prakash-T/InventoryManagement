@echo off
echo Compiling Java files...
javac -d out src\Main.java src\model\*.java src\service\*.java

if %errorlevel% neq 0 (
    echo Compilation failed!
    exit /b %errorlevel%
)

echo Running program...
java -cp out Main