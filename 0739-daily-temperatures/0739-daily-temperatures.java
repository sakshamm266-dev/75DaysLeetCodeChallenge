

class Solution {
    public int[] dailyTemperatures(int[] temps) {

        int n = temps.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!stack.isEmpty() && temps[i] > temps[stack.peek()]){
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return result;
    }
}