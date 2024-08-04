#include <stdio.h>

int main() {
  // An array storing different ages
  int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
 
  float avg, sum = 0;
  int i;
  
  // Get the length of the array
  int length = sizeof(ages) / sizeof(ages[0]);
    
  // Loop through the elements of the array and accumulate the sum
  for (i = 0; i < length; i++) {
    sum += ages[i];
  }