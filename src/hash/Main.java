package hash;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "gre1k";
        System.out.println(checkHasSameCharacter(s));
        System.out.println(checkHasSubArraySumZero(new int[]{4, 2, 9, 1, 1}));
        checkWinnerOfElection("thanh thanh khoi ngoc ngoc ngoc");
        sortString("abcacbbbcccaaaaaaa");
    }

    static void sortString(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> hashMap = new TreeMap<>();
        for (char c : arr) {
            if (hashMap.get(c) == null) {
                hashMap.put(c, 1);
            } else {
                int count = hashMap.get(c) + 1;
                hashMap.put(c, count);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                stringBuilder.append(entry.getKey());
            }
        }
        System.out.println(stringBuilder);
    }

    static void checkWinnerOfElection(String s) {
        String[] arr = s.trim().split("\\s+");
        HashMap<String, Integer> mapString = new HashMap<>();
        for (String i : arr) {
            Integer count = mapString.get(i);
            if (count != null) {
                count++;
                mapString.put(i, count);
            } else {
                mapString.put(i, 1);
            }
        }
        int max = 0;
        String result = "";
        for (String key : mapString.keySet()) {
            if (mapString.get(key) > max) {
                max = mapString.get(key);
                result = key;
            }
        }
        System.out.println(result + " " + max);
    }

    static boolean checkHasSameCharacter(String s) {
        char arr[] = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size() == arr.length;
    }

    static boolean checkHasSubArraySumZero(int[] arr) {
        Set<Integer> setInt = new HashSet<>();
        int sum = 0;
        for (int i1 : arr) {
            setInt.add(sum);
            sum += i1;
            if (setInt.contains(sum)) {
                return true;
            }
        }
        return false;
    }
}
