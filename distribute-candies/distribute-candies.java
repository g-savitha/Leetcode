class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> candies = new HashSet<>();
        for(int type: candyType){
            candies.add(type);
        }
        return Math.min(candies.size(), candyType.length/2);
    }
}