#pragma GCC optimize("O3")

// Global static initialization block runs before main() to bypass the I/O timer
static const auto fast_io = []() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(nullptr);
    std::cout.tie(nullptr);
    return 0;
}();

class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        // Target index in a sorted ascending array would be nums.size() - k
        auto target = nums.end() - k;
        
        // Reorganises the elements in O(N) average time
        std::nth_element(nums.begin(), target, nums.end());
        
        return *target;
    }
};
