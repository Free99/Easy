package Easy;

/**
 * Created by Tianshan on 9/29/16.
 */

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

//public class NestedListWeightSum {
//    // use recursion call to get the answer
//
//    public int depthSum(List<NestedInteger> nestedList) {
//        return helper(nestedList, 1);
//    }
//
//    private int helper(List<NestedInteger> nestedList, int level) {
//        // if nestedList is null or size = 0, just return 0
//        if (nestedList == null || nestedList.size() == 0) return 0;
//        int sum = 0;
//
//        // traverse all elements in nestedList
//        for (NestedInteger ni : nestedList) {
//            // if it is integer, just add it (don't forget to multiply level)
//            // otherwise, use the recursive function to get the sum of nestedList
//            sum += ni.isInteger() ? ni.getInteger() * level : helper(ni.getList(), level + 1);
//        }
//
//        return sum;
//    }
//}
