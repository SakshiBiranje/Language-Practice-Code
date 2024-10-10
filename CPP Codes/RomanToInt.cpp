#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

class Solution 
{
public:

    int romanToInt(const string& s) 
    {
        
        unordered_map<char, int> romanMap = 
        {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };

        int total = 0;
        int preValue = 0;

        for (char c : s) 
        {
            int value = romanMap[c];
            
            if (value > preValue) 
            {
                total += value - 2 * preValue;
            }
             else 
            {
                total += value;
            }
            preValue = value;
        }

        return total;
    }
};

int main()
{
    Solution solution;
    string romanInput;

    cout << "Enter a Roman numeral: ";
    cin >> romanInput;

    int result = solution.romanToInt(romanInput);

    cout << "The integer value is: " << result << endl;

    return 0;
}
