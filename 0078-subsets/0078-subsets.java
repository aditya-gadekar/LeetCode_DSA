class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    void helper(int[] nums, int index,
                List<Integer> current,
                List<List<Integer>> ans) {

        // Base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(nums[index]);
        helper(nums, index + 1, current, ans);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        helper(nums, index + 1, current, ans);
    }
}