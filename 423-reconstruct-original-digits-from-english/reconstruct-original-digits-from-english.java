class Solution {
    public String originalDigits(String s) {
        Set<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.add(ch);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(set.contains('w')){
            int a=map.getOrDefault('w',0);
            int v=a;
            while(v-->0){
                list.add(2);
            }
            map.remove('w');
            int b=map.getOrDefault('t',0);
            if(b-a!=0){
                map.put('t',b-a);
            } else {
                map.remove('t');
            }
            int c=map.getOrDefault('o',0);
            if(c-a!=0){
                map.put('o',c-a);
            } else {
                map.remove('o');
            }
        }
        if(set.contains('z')){
            int a=map.getOrDefault('z',0);
            int v=a;
            while(v-->0){
                list.add(0);
            }
            map.remove('z');
            int b=map.getOrDefault('o',0);
            if(b-a!=0){
                map.put('o',b-a);
            } else {
                map.remove('o');
            }
            int c=map.getOrDefault('e',0);
            if(c-a!=0){
                map.put('e',c-a);
            } else {
                map.remove('e');
            }
            int d=map.getOrDefault('r',0);
            if(d-a!=0){
                map.put('r',d-a);
            } else {
                map.remove('r');
            }
        }
        if(set.contains('u')){
            int a=map.getOrDefault('u',0);
            int v=a;
            while(v-->0){
                list.add(4);
            }
            map.remove('u');
            int b=map.getOrDefault('o',0);
            if(b-a!=0){
                map.put('o',b-a);
            } else {
                map.remove('o');
            }
            int c=map.getOrDefault('f',0);
            if(c-a!=0){
                map.put('f',c-a);
            } else {
                map.remove('f');
            }
            int d=map.getOrDefault('r',0);
            if(d-a!=0){
                map.put('r',d-a);
            } else {
                map.remove('r');
            }
        }
        if(set.contains('x')){
            int a=map.getOrDefault('x',0);
            int v=a;
            while(v-->0){
                list.add(6);
            }
            map.remove('x');
            int b=map.getOrDefault('s',0);
            if(b-a!=0){
                map.put('s',b-a);
            } else {
                map.remove('s');
            }
            int d=map.getOrDefault('i',0);
            if(d-a!=0){
                map.put('i',d-a);
            } else {
                map.remove('i');
            }
        }
        if(set.contains('g')){
            int a=map.getOrDefault('g',0);
            int v=a;
            while(v-->0){
                list.add(8);
            }
            map.remove('g');
            int b=map.getOrDefault('e',0);
            if(b-a!=0){
                map.put('e',b-a);
            } else {
                map.remove('e');
            }
            int d=map.getOrDefault('i',0);
            if(d-a!=0){
                map.put('i',d-a);
            } else {
                map.remove('i');
            }
            int e=map.getOrDefault('t',0);
            if(e-a!=0){
                map.put('t',e-a);
            } else {
                map.remove('t');
            }
            int k=map.getOrDefault('h',0);
            if(k-a!=0){
                map.put('h',k-a);
            } else {
                map.remove('h');
            }
        }
        if(map.containsKey('o')){
            int a=map.getOrDefault('o',0);
            int v=a;
            while(v-->0){
                list.add(1);
            }
            map.remove('o');
            int b=map.getOrDefault('e',0);
            if(b-a!=0){
                map.put('e',b-a);
            } else {
                map.remove('e');
            }
            int c=map.getOrDefault('n',0);
            if(c-a!=0){
                map.put('n',c-a);
            } else {
                map.remove('n');
            }
        }
        if(map.containsKey('h')){
            int a=map.getOrDefault('h',0);
            int v=a;
            while(v-->0){
                list.add(3);
            }
            map.remove('h');
            int b=map.getOrDefault('t',0);
            if(b-a!=0){
                map.put('t',b-a);
            } else {
                map.remove('t');
            }
            int c=map.getOrDefault('e',0);
            if(c-(a*2)!=0){
                map.put('e',c-(2*a));
            } else {
                map.remove('e');
            }
            int d=map.getOrDefault('r',0);
            if(d-a!=0){
                map.put('r',d-a);
            } else {
                map.remove('r');
            }
        }
        if (map.containsKey('f')) {
            int a = map.getOrDefault('f',0);
            int v=a;
            while (v-- > 0) {
                list.add(5);
            }
            map.remove('f');

            int b = map.getOrDefault('i',0);
            if (b - a != 0) {
                map.put('i', b - a);
            } else {
                map.remove('i');
            }

            int c = map.getOrDefault('v',0);
            if (c - a != 0) {
                map.put('v', c - a);
            } else {
                map.remove('v');
            }

            int d = map.getOrDefault('e',0);
            if (d - a != 0) {
                map.put('e', d - a);
            } else {
                map.remove('e');
            }
        }
        if (map.containsKey('s')) {
            int a = map.getOrDefault('s',0);
            int v=a;
            while (v-- > 0) {
                list.add(7);
            }
            map.remove('s');

            int b = map.getOrDefault('e',0);
            if (b - (2 * a) != 0) {
                map.put('e', b - (2 * a));
            } else {
                map.remove('e');
            }

            int c = map.getOrDefault('v',0);
            if (c - a != 0) {
                map.put('v', c - a);
            } else {
                map.remove('v');
            }

            int d = map.getOrDefault('n',0);
            if (d - a != 0) {
                map.put('n', d - a);
            } else {
                map.remove('n');
            }
        }
        if (map.containsKey('i')) {
            int a = map.getOrDefault('i',0);
            int v=a;
            while (v-- > 0) {
                list.add(9);
            }
            map.remove('i');

            int b = map.getOrDefault('n',0);
            if (b - (2 * a) != 0) {
                map.put('n', b - (2 * a));
            } else {
                map.remove('n');
            }

            int c = map.getOrDefault('e',0);
            if (c - a != 0) {
                map.put('e', c - a);
            } else {
                map.remove('e');
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            sb.append(String.valueOf(list.get(i)));
        }
        return sb.toString();
    }
}