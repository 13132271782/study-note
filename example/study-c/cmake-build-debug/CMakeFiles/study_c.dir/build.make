# CMAKE generated file: DO NOT EDIT!
# Generated by "NMake Makefiles" Generator, CMake Version 3.16

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

!IF "$(OS)" == "Windows_NT"
NULL=
!ELSE
NULL=nul
!ENDIF
SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "D:\Work-Soft\CLion 2020.1.1\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "D:\Work-Soft\CLion 2020.1.1\bin\cmake\win\bin\cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = E:\WorkSpace\VuePress\example\study-c

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = E:\WorkSpace\VuePress\example\study-c\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles\study_c.dir\depend.make

# Include the progress variables for this target.
include CMakeFiles\study_c.dir\progress.make

# Include the compile flags for this target's objects.
include CMakeFiles\study_c.dir\flags.make

CMakeFiles\study_c.dir\main.c.obj: CMakeFiles\study_c.dir\flags.make
CMakeFiles\study_c.dir\main.c.obj: ..\main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/study_c.dir/main.c.obj"
	C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\cl.exe @<<
 /nologo $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) /FoCMakeFiles\study_c.dir\main.c.obj /FdCMakeFiles\study_c.dir\ /FS -c E:\WorkSpace\VuePress\example\study-c\main.c
<<

CMakeFiles\study_c.dir\main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/study_c.dir/main.c.i"
	C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\cl.exe > CMakeFiles\study_c.dir\main.c.i @<<
 /nologo $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E E:\WorkSpace\VuePress\example\study-c\main.c
<<

CMakeFiles\study_c.dir\main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/study_c.dir/main.c.s"
	C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\cl.exe @<<
 /nologo $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) /FoNUL /FAs /FaCMakeFiles\study_c.dir\main.c.s /c E:\WorkSpace\VuePress\example\study-c\main.c
<<

# Object files for target study_c
study_c_OBJECTS = \
"CMakeFiles\study_c.dir\main.c.obj"

# External object files for target study_c
study_c_EXTERNAL_OBJECTS =

study_c.exe: CMakeFiles\study_c.dir\main.c.obj
study_c.exe: CMakeFiles\study_c.dir\build.make
study_c.exe: CMakeFiles\study_c.dir\objects1.rsp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable study_c.exe"
	"D:\Work-Soft\CLion 2020.1.1\bin\cmake\win\bin\cmake.exe" -E vs_link_exe --intdir=CMakeFiles\study_c.dir --rc="D:\Windows Kits\10\bin\10.0.17763.0\x86\rc.exe" --mt="D:\Windows Kits\10\bin\10.0.17763.0\x86\mt.exe" --manifests  -- C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\link.exe /nologo @CMakeFiles\study_c.dir\objects1.rsp @<<
 /out:study_c.exe /implib:study_c.lib /pdb:E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\study_c.pdb /version:0.0  /machine:X86 /debug /INCREMENTAL /subsystem:console  kernel32.lib user32.lib gdi32.lib winspool.lib shell32.lib ole32.lib oleaut32.lib uuid.lib comdlg32.lib advapi32.lib 
<<

# Rule to build all files generated by this target.
CMakeFiles\study_c.dir\build: study_c.exe

.PHONY : CMakeFiles\study_c.dir\build

CMakeFiles\study_c.dir\clean:
	$(CMAKE_COMMAND) -P CMakeFiles\study_c.dir\cmake_clean.cmake
.PHONY : CMakeFiles\study_c.dir\clean

CMakeFiles\study_c.dir\depend:
	$(CMAKE_COMMAND) -E cmake_depends "NMake Makefiles" E:\WorkSpace\VuePress\example\study-c E:\WorkSpace\VuePress\example\study-c E:\WorkSpace\VuePress\example\study-c\cmake-build-debug E:\WorkSpace\VuePress\example\study-c\cmake-build-debug E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\CMakeFiles\study_c.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles\study_c.dir\depend

