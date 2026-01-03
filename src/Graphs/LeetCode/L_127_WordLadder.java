package Graphs.LeetCode;

import java.util.*;

public class L_127_WordLadder {

    //Proper code using BFS
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> set = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        visited.add(beginWord);
        int output = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return output;
                }
                for (int i = 0; i < word.length(); i++) {
                    for(int j='a';j<='z';j++){
                        char[]arr=word.toCharArray();
                        arr[i]=(char)(j);
                        String str=new String(arr);
                        if(set.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            output++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String>wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        L_127_WordLadder l1=new L_127_WordLadder();
        System.out.println(l1.ladderLength(beginWord,endWord,wordList));
    }

    //only 10/60 test cases passed
    public int ladderLengthOwnAttemptWrong(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        int output=0;
        HashMap<Character,Integer>hmap=new HashMap<>();
        for(Character ch:beginWord.toCharArray()){
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<wordList.size();i++){
            String word=wordList.get(i);
            for(Character ch:word.toCharArray()){
                if(hmap.containsKey(ch)){
                    hmap.put(ch,hmap.get(ch)-1);
                    if(hmap.get(ch)==0){
                        hmap.remove(ch);
                    }
                }
            }
            if(hmap.size()==1){
                output++;
                beginWord=word;
                if(beginWord.equals(endWord)){
                    return output;
                }
            }
            hmap.clear();
            for(Character ch:word.toCharArray()){
                hmap.put(ch,hmap.getOrDefault(ch,0)+1);
            }
        }
        return 0;
    }

}
