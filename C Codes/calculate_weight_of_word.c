#include <stdio.h>

int calculate_weight(const char *str) 
{
    int total_weight = 0;

    for (int i = 0; str[i] != '\0'; i++) {
        int char_weight = str[i] - 'a' + 1;
        total_weight += char_weight;
    }

    return total_weight;
}

int main() 
{
    char input_string[100];
    printf("Enter a lowercase string: ");
    scanf("%s", input_string);
    int weight = calculate_weight(input_string);
    printf("The weight of the string '%s' is: %d\n", input_string, weight);

    return 0;
}
