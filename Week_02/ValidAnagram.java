public boolean isAnagram(String s, String t) {
    int[] count1 = new int[26];
    for(char c : s.toCharArray()) {
        count1[c - 97] += 1;
    }
       
    for(char c : t.toCharArray()) {
        count1[c - 97] -= 1;
    }
        
    for(int i = 0; i < 26; i++){
        if(count1[i] != 0) {
            return false;
        }   
    }
    return true;
}