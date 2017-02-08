int commonCharacterCount(String s1, String s2) {
        int count = 0;
        String[] str1 = s1.split("");
        String[] str2 = s2.split("");
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        for(int i = 0; i < str1.length; i++){
            list1.add(str1[i]);
        }
        for(int i = 0; i < str2.length; i++){
            list2.add(str2[i]);
        }
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i).equals(list2.get(j))){
                    count++;
                    list2.remove(j);
                    break;

                }
            }
        }
    return count;
}