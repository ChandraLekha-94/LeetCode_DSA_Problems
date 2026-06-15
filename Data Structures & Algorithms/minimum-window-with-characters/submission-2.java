class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> hs = new HashMap<>();
        HashMap<Character,Integer> ht = new HashMap<>();

        for(char ch : t.toCharArray()){
            ht.put(ch, ht.getOrDefault(ch,0)+1);
        }

        int minlen = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;

        int st = -1;

        while(j < s.length()){

            char ch = s.charAt(j);

            hs.put(ch, hs.getOrDefault(ch,0)+1);

            while(isValid(hs, ht)){

                if(j - i + 1 < minlen){

                    minlen = j - i + 1;
                    st = i;
                }

                hs.put(s.charAt(i),
                       hs.get(s.charAt(i)) - 1);

                i++;
            }

            j++;
        }

        if(st == -1){
            return "";
        }

        return s.substring(st, st + minlen);
    }

    public static boolean isValid(HashMap<Character,Integer> s,
                                  HashMap<Character,Integer> t){

        for(char ch : t.keySet()){

            if(s.getOrDefault(ch,0) < t.get(ch)){
                return false;
            }
        }

        return true;
    }
}