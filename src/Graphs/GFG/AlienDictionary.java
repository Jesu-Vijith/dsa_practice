package Graphs.GFG;

import java.util.*;

public class AlienDictionary {
    public static void main(String[] args) {
//        String[]words = {"baa", "abcd", "abca", "cab", "cad"};
//        String[]words={"dddc", "a", "ad", "ab", "b", "be" ,"cd","cded"};
//        String[]words={"aa", "aab", "ab", "b" ,"babbb"};
        String[]words={"abc","ab"};
        AlienDictionary a1= new AlienDictionary();
        System.out.println("ANS: "+a1.findOrder(words));
        System.out.println("ANSOWN: "+a1.findOrder1(words));
    }

    public String findOrder1(String[] words) {
        StringBuilder ans=new StringBuilder();
        boolean [] exists=new boolean[26];
        for(String word:words){
            for(char ch:word.toCharArray()){
                exists[ch-'a']=true;
            }
        }

        int [] inDegree=new int[26];
        List<List<Integer>>adjacency=new ArrayList<>();
        for (int i=0;i<26;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int word=1;word<words.length;word++){
            String firstWord=words[word-1];
            String secondWord=words[word];
            int length=Math.min(firstWord.length(),secondWord.length());
            int k=0;
            while (k<length && firstWord.charAt(k)==secondWord.charAt(k)) {
                k++;
            }
            if(k<length){
                    adjacency.get(firstWord.charAt(k)-'a').add(secondWord.charAt(k)-'a');
                    inDegree[secondWord.charAt(k)-'a']++;
            }
            else if (firstWord.length()>secondWord.length()) {
                return "";
            }
        }
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<26;i++){
            if(exists[i] && inDegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node=queue.poll();
            ans.append((char)(node+'a'));
            List<Integer>adj=adjacency.get(node);
            for(int elem:adj){
                inDegree[elem]--;
                if(inDegree[elem]==0){
                    queue.add(elem);
                }
            }
        }
        for(int i=0;i<26;i++){
            if(exists[i] && inDegree[i]!=0){
                return "";
            }
        }
        return ans.toString();
    }














    public  String findOrder(String[] words) {

        // Adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // In-degree of each character
        int[] inDegree = new int[26];

        // Tracks which characters are present
        boolean[] exists = new boolean[26];

        // Initialize graph
        for (int i = 0; i < 26; i++) {
            graph.add(new ArrayList<>());
        }

        // Mark existing characters
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                exists[ch - 'a'] = true;
            }
        }

        // Build the graph from adjacent words
        for (int i = 0; i + 1 < words.length; ++i) {
            String w1 = words[i];
            String w2 = words[i + 1];
            int len = Math.min(w1.length(), w2.length());
            int j = 0;

            while (j < len && w1.charAt(j) == w2.charAt(j)) ++j;

            if (j < len) {
                int u = w1.charAt(j) - 'a';
                int v = w2.charAt(j) - 'a';
                graph.get(u).add(v);
                inDegree[v]++;
            } else if (w1.length() > w2.length()) {
                // Invalid input
                return "";
            }
        }

        // Topological sort
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 26; ++i) {
            if (exists[i] && inDegree[i] == 0) {
                q.offer(i);
            }
        }

        String result = "";
        while (!q.isEmpty()) {
            int u = q.poll();
            result += (char)(u + 'a');

            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        // Check, there was a cycle or not
        for (int i = 0; i < 26; ++i) {
            if (exists[i] && inDegree[i] != 0) {
                return "";
            }
        }

        return result;
    }

}
