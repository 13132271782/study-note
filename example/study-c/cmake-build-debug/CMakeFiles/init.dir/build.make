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
include CMakeFiles\init.dir\depend.make

# Include the progress variables for this target.
include CMakeFiles\init.dir\progress.make

# Include the compile flags for this target's objects.
include CMakeFiles\init.dir\flags.make

CMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.obj: CMakeFiles\init.dir\flags.make
CMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.obj: ..\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/init.dir/2.basics/2.1.data-type/2.1.2.variable/init_defineThenAssign.c.obj"
	C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\cl.exe @<<
 /nologo $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) /FoCMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.obj /FdCMakeFiles\init.dir\ /FS -c E:\WorkSpace\VuePress\example\study-c\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c
<<

CMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/init.dir/2.basics/2.1.data-type/2.1.2.variable/init_defineThenAssign.c.i"
	C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\cl.exe > CMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.i @<<
 /nologo $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E E:\WorkSpace\VuePress\example\study-c\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c
<<

CMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/init.dir/2.basics/2.1.data-type/2.1.2.variable/init_defineThenAssign.c.s"
	C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\cl.exe @<<
 /nologo $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) /FoNUL /FAs /FaCMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.s /c E:\WorkSpace\VuePress\example\study-c\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c
<<

# Object files for target init
init_OBJECTS = \
"CMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.obj"

# External object files for target init
init_EXTERNAL_OBJECTS =

init.exe: CMakeFiles\init.dir\2.basics\2.1.data-type\2.1.2.variable\init_defineThenAssign.c.obj
init.exe: CMakeFiles\init.dir\build.make
init.exe: CMakeFiles\init.dir\objects1.rsp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable init.exe"
	"D:\Work-Soft\CLion 2020.1.1\bin\cmake\win\bin\cmake.exe" -E vs_link_exe --intdir=CMakeFiles\init.dir --rc="D:\Windows Kits\10\bin\10.0.17763.0\x86\rc.exe" --mt="D:\Windows Kits\10\bin\10.0.17763.0\x86\mt.exe" --manifests  -- C:\PROGRA~2\MIB055~1\2017\BUILDT~1\VC\Tools\MSVC\1416~1.270\bin\Hostx86\x86\link.exe /nologo @CMakeFiles\init.dir\objects1.rsp @<<
 /out:init.exe /implib:init.lib /pdb:E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\init.pdb /version:0.0  /machine:X86 /debug /INCREMENTAL /subsystem:console  kernel32.lib user32.lib gdi32.lib winspool.lib shell32.lib ole32.lib oleaut32.lib uuid.lib comdlg32.lib advapi32.lib 
<<

# Rule to build all files generated by this target.
CMakeFiles\init.dir\build: init.exe

.PHONY : CMakeFiles\init.dir\build

CMakeFiles\init.dir\clean:
	$(CMAKE_COMMAND) -P CMakeFiles\init.dir\cmake_clean.cmake
.PHONY : CMakeFiles\init.dir\clean

CMakeFiles\init.dir\depend:
	$(CMAKE_COMMAND) -E cmake_depends "NMake Makefiles" E:\WorkSpace\VuePress\example\study-c E:\WorkSpace\VuePress\example\study-c E:\WorkSpace\VuePress\example\study-c\cmake-build-debug E:\WorkSpace\VuePress\example\study-c\cmake-build-debug E:\WorkSpace\VuePress\example\study-c\cmake-build-debug\CMakeFiles\init.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles\init.dir\depend

