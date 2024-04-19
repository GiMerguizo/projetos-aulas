#include <stdio.h>
#include <stdlib.h>

struct my_data
{
    int valueA;
    int valueB;    
};

void print_collection(struct my_data *coll, int sz);

int main(int argc, char *argv[])
{
    struct my_data data[] = 
    {
        { .valueA = 2, .valueB = 5 },
        { .valueA = 12, .valueB = 15 },
        { .valueA = 22, .valueB = 25 },        
    };

    // struct my_data *ptr = &data;

    // printf("data @ %p\n", &data);
    // printf("data.valueA @ %p\n", &data.valueA);
    // printf("data.valueB @ %p\n", &data.valueB);

    // printf("ptr @ %p -> %p", &ptr, ptr);

    print_collection(data, 3);

    printf("\n");
    return 0;
}

void print_collection(struct my_data *coll, int sz)
{
    for (;sz > 0; --sz)
    {
        printf("{%d %d}\n", coll->valueA, coll->valueB);
        coll++;
    }
}