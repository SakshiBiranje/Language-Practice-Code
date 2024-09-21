#include <iostream>
#include <string>

using namespace std;

class Solution 
{
public:
    bool isValid(const string& s) 
    {
        string stk;
        
        for (char c : s) 
        {
            if (c == '(' || c == '{' || c == '[') 
            {
                stk.push_back(c);
            } else if (stk.empty() || !match(stk.back(), c)) 
            {
                return false;
            } else {
                stk.pop_back();
            }
        }
        return stk.empty();
    }

private:
    bool match(char l, char r) 
    {
        return (l == '(' && r == ')') ||
               (l == '[' && r == ']') ||
               (l == '{' && r == '}');
    }
};
int main() 
{
    Solution solution;
    string test ;
   
    cout<<"Enter parentheses : "<<endl;
    cin>>test;

    bool result = solution.isValid(test);
    cout<<"Result is : "<<(result ? "true": "false")<<endl;

    return 0;
}
