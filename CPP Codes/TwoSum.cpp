#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target) 
{
    unordered_map<int, int> numMap;
    
    for (int i = 0; i < nums.size(); i++) {
        int complement = target - nums[i];
        // Check if complement exists in the map
        if (numMap.find(complement) != numMap.end()) {
            return { numMap[complement], i };
        }
        
        // Add the current number and its index to the map
        numMap[nums[i]] = i;
    }
    
    // Return an empty vector if no solution is found (though the problem guarantees a solution)
    return {};
}

int main() 
{
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;

    vector<int> result = twoSum(nums, target);

    if (!result.empty()) {
        cout << "Indices: " << result[0] << " and " << result[1] << endl;
    } else {
        cout << "No solution found!" << endl;
    }

    return 0;
}