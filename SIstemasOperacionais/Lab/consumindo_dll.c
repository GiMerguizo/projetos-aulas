#include <stdio.h>
#include <stdlib.h>
#define WIN32(_LEAN_AND_MEAN
#include <windows.h>

int main(int argc, char *argv[])
{
    HMODULE mylib = LoadLibraryA("<passar o endereco>");

     = (void(*)()) GetProcAdrress(mylib, "HelloWorld");

    return 0;

}
