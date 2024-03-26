#include <stdio.h>
#include <string.h>

int romanToInt(char *s) {
    int nums[26] = {0};
    nums['I' - 'A'] = 1;
    nums['V' - 'A'] = 5;
    nums['X' - 'A'] = 10;
    nums['L' - 'A'] = 50;
    nums['C' - 'A'] = 100;
    nums['D' - 'A'] = 500;
    nums['M' - 'A'] = 1000;

    int ans = nums[s[strlen(s) - 1] - 'A'];
    for (int i = 0; i < strlen(s) - 1; ++i) {
        int sign = nums[s[i] - 'A'] < nums[s[i + 1] - 'A'] ? -1 : 1;
        ans += sign * nums[s[i] - 'A'];
    }
    return ans;
}

int main() {
    char s[] = "MCMXCIV";
    printf("Roman to Integer: %d\n", romanToInt(s));
    return 0;
}
