public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> result = Arrays.asList(0,0);
    
    IntStream.range(0, a.size())
        .forEach(i -> {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        });
        
        return result;
}
