package Graphs.LeetCode;

import java.util.*;

public class L_126_WordLadder_II {


    public List<List<String>> findLadders1(String beginWord, String endWord, List<String> wordList) {
        Set<String>set=new HashSet<>(wordList);
        List<List<String>>output=new ArrayList<>();
        if(!set.contains(endWord)){
            return output;
        }
        Queue<List<String>>queue=new LinkedList<>();
        Set<String>visited=new HashSet<>();
        List<String>q=new ArrayList<>();
        q.add(beginWord);
        visited.add(beginWord);
        int limit=Integer.MAX_VALUE;
        queue.add(q);
        Queue<List<String>>copyQueue=new LinkedList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int s=0;s<size;s++){
                List<String>list=queue.poll();
                if(list.size()>limit){
                    return output;
                }
                String word=list.getLast();
                for(int i=0;i<word.length();i++){
                    char[]arr=word.toCharArray();
                    for(int j='a';j<='z';j++){
                        if(arr[i]==j)continue;
                        arr[i]=(char)j;
                        String str=new String(arr);

                        if(str.equals(endWord)){
                            List<String>copy=new ArrayList<>(list);
                            copy.add(str);
                            limit=copy.size();
                            output.add(copy);
                        }
                        else if(set.contains(str) && !visited.contains(str)){
                            List<String>copy=new ArrayList<>(list);
                            copy.add(str);
                            queue.add(copy);
                            copyQueue.add(copy);
                        }
                    }
                }
            }
            while(!copyQueue.isEmpty()){
                List<String>copy=copyQueue.poll();
                visited.add(copy.getLast());
            }
        }
        return output;
    }

    //BAD APPROACH, TLE
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<List<String>> treeSet = new TreeSet<>(
                Comparator.comparingInt((List<String> a) -> a.size()).thenComparing(Object::toString)
        );
        List<List<String>>output=new ArrayList<>();
        List<String>ans=new ArrayList<>();
        Set<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return output;
        }
        Set<String>visited=new HashSet<>();
        ans.add(beginWord);
        visited.add(beginWord);
        dfs(beginWord,ans,set,visited,treeSet,endWord,-1);
        if(treeSet.isEmpty()){
            return output;
        }
        int minSize = treeSet.iterator().next().size();
        for (List<String> path : treeSet) {
            if (path.size() == minSize) {
                output.add(path);
            } else {
                break;
            }
        }
        return output;
    }
    public void dfs(String word,List<String>ans,Set<String>set,Set<String>visited,Set<List<String>>treeSet,String endWord,int avoid){
        for(int i=0;i<word.length();i++){
            if(i!=avoid) {
                char[] arr = word.toCharArray();
                for (int j = 'a'; j <= 'z'; j++) {
                    arr[i] = (char) j;
                    String str = new String(arr);
                    if (set.contains(str) && !visited.contains(str)) {
                        if(str.equals(endWord)){
                            ans.add(str);
                            treeSet.add(new ArrayList<>(ans));
                            ans.remove(str);
                            break;
                        }
                        visited.add(str);
                        ans.add(str);
                        dfs(str, ans, set, visited, treeSet, endWord,i);
                        visited.remove(str);
                        ans.remove(str);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        String beginWord = "red", endWord = "tax";
//        String[]wordList = {"ted","tex","red","tax","tad","den","rex","pee"};
        String beginWord ="a", endWord = "c";
        String [] wordList ={"a","b","c"};
        L_126_WordLadder_II l1=new L_126_WordLadder_II();
//        System.out.println(l1.findLadders(beginWord,endWord,new ArrayList<>(Arrays.asList(wordList))));
        System.out.println(l1.findLadders1(beginWord,endWord,new ArrayList<>(Arrays.asList(wordList))));
    }
}
