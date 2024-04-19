#include <stdio.h>
#include <stdlib.h>

void my_pow2(int *arr, int sz)
{
    int i;
    for (i = 0; i < sz; i++)
    {
        int tmp = *(arr+i);
        *(arr+i) = tmp * tmp;
    }
}

int main(int argc, char *argv[])
{
    //int value = 5;
   int value[] = {1, 2, 3, 4, 5}; 
   int *ptr = value;

   // printf("value @ %p : %d\n", &value, value);

   printf("value @ %p\n", &value);
   int i;
   for (i = 0; i < 5; i++)
   {
      printf("%d : %d @ %p\n", i, *(ptr + i), ptr + i);
   }

    printf("\n");
    my_pow2(value, 5);

   for (i = 0; i < 5; i++)
   {
      printf("%d : %d @ %p\n", i, *(ptr + i), ptr + i);
   }

   //printf("  ptr @ %p : %p -> %d\n", &ptr, ptr, *ptr);

    //system("pause");
    return 0;

}
