class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> f= new HashMap<>();
        for(char i : text.toCharArray()){
            if(i=='b' || i=='a' ||i=='l'|| i=='o'|| i=='n'){
                f.put(i,f.getOrDefault(i,0)+1);   //make a hashmap

            }
        }

        int x1= Math.min(f.getOrDefault('b',0),Math.min(f.getOrDefault('a',0),f.getOrDefault('n',0)));   //now check minimu value of characters
        int x2= Math.min(f.getOrDefault('l',0),f.getOrDefault('o',0));
        return Math.min(x2/2,x1);
    }
}


//OR
//         int[] freq = new int[26];
//         for(char c : text.toCharArray()){
//             freq[c - 'a']++;
//         }

//         int ans = Math.min(
//             Math.min(freq['b' - 'a'] , freq['a' - 'a']) , 
//             Math.min(
//                 Math.min(freq['l' - 'a'] / 2 , freq['o' - 'a'] / 2) , freq['n' - 'a']
//             )
//         );

//         return ans;
//     }
// }